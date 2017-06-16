package com.epitome.ec.core;

import org.quartz.CronExpression;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by maheshvibhute on 10/6/17.
 * Copyright: Resilient Software
 */
public class DefaultEventCalendar implements EventCalendar {
    private List<CronExpression> eventRules;

    @Override
    public Day getNext(Filter f) {
        return getFutureSeries(f).next();
    }

    @Override
    public Day getPrevious(Filter f) {
        return getPastSeries(f).next();
    }

    @Override
    public Iterator<Day> getFutureSeries(Filter f) {
        final EventCalendar cal = this;

        return new Iterator<Day>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Day next() {

                LocalDate start = LocalDate.now();
                LocalDate end = start.plusYears(2);

                for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
                    for (CronExpression e : eventRules) {
                        Date today = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());

                        if (e.isSatisfiedBy(today))
                            return DefaultDay.of(date, cal);
                    }
                }
                return null;
            }
        };
    }

    @Override
    public Iterator<Day> getPastSeries(Filter f) {
        return null;
    }

    @Override
    public Day today() {
        return DefaultDay.of(LocalDate.now(), this);
    }

    public void setEventRules(List<CronExpression> eventRules) {
        this.eventRules = eventRules;
    }
}
