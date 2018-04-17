package com.study.rocky.absfactory.map.location.impl;

import android.util.Log;

import com.study.rocky.absfactory.map.location.AbsMapLocation;

/**
 * Created by Administrator on 2018/4/17 0017.
 */

public class BaiDuMapLocation extends AbsMapLocation{
    @Override
    public void location() {
        Log.d("MapLocation", "BaiDuMapLocation" + ":location");
    }
}
