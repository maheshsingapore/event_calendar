package com.epitome.ec.core;

import java.util.Iterator;

/**
 * Created by maheshvibhute on 10/6/17.
 * Copyright: Resilient Software
 */
public interface EventCalendar {

    Day getNext(Filter f);

    Day getPrevious(Filter f);

    Iterator<Day> getFutureSeries(Filter f);

    Iterator<Day> getPastSeries(Filter f);

    Day today();

}
