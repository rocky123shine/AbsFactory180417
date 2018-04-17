package com.study.rocky.absfactory.map.view.impl;

import android.util.Log;

import com.study.rocky.absfactory.map.view.AbsMapView;

/**
 * Created by Administrator on 2018/4/17 0017.
 */

public class GaoDeMapView extends AbsMapView {
    private String tag = "GaoDeMapView";

    @Override
    public void onStart() {
        Log.d("MapView", tag + ":onStart");

    }

    @Override
    public void onResume() {
        Log.d("MapView", tag + ":onResume");
    }

    @Override
    public void onDestroy() {
        Log.d("MapView", tag + ":onDestroy");
    }
}
