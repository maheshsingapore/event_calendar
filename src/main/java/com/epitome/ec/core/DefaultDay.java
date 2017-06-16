package com.epitome.ec.core;

import java.time.LocalDate;

/**
 * Created by maheshvibhute on 10/6/17.
 * Copyright: Resilient Software
 */
class DefaultDay implements Day {
    private final EventCalendar calendar;

    private DefaultDay(EventCalendar calendar) {
        this.calendar = calendar;
    }

    public static Day of(EventCalendar calendar) {
        return new DefaultDay(calendar);
    }

    @Override
    public boolean is(Filter f) {
        return false;
    }

    public static Day of(LocalDate date, EventCalendar calendar) {
        return null;
    }
}
