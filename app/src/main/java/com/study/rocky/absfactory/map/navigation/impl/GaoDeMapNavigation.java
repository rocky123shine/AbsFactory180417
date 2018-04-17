package com.study.rocky.absfactory.map.navigation.impl;

import android.util.Log;

import com.study.rocky.absfactory.map.navigation.AbsMapNavigation;

/**
 * Created by Administrator on 2018/4/17 0017.
 */

public class GaoDeMapNavigation extends AbsMapNavigation {
    @Override
    public void turnByTurn() {
        Log.d("MapNavigation", "GaoDeMapNavigation:navigation");
    }
}
