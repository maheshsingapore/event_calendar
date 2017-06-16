package com.epitome.ec.ext;

import com.epitome.ec.core.Filter;

/**
 * Created by maheshvibhute on 10/6/17.
 * Copyright: Resilient Software
 */
public interface  Filters {

    Filter WORKING_DAY = day -> false;
    Filter TRADING_DAY = day -> false;
    Filter T_PLUS_3_WORKING_DAY = day -> false;


}
