package com.epitome.ec;

import com.epitome.ec.core.Day;
import com.epitome.ec.core.DefaultEventCalendar;
import com.epitome.ec.core.EventCalendar;

import static com.epitome.ec.ext.Filters.TRADING_DAY;
import static com.epitome.ec.ext.Filters.T_PLUS_3_WORKING_DAY;
import static com.epitome.ec.ext.Filters.WORKING_DAY;

/**
 * Created by maheshvibhute on 10/6/17.
 * Copyright: Resilient Software
 */
public class Main {
    public static void main(String[] args) {

        EventCalendar batsCalendar = new DefaultEventCalendar();

        Day today = batsCalendar.today();

        if (today.is(WORKING_DAY)) {
            System.out.println("Today is a working day for BATS ");
        } else System.out.println("Today is holiday for BATS");

        batsCalendar.getNext(WORKING_DAY);
        batsCalendar.getPrevious(TRADING_DAY);

        Day settlementDay = batsCalendar.getNext(T_PLUS_3_WORKING_DAY);
    }
}
