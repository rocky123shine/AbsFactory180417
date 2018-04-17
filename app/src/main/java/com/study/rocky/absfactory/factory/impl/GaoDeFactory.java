package com.study.rocky.absfactory.factory.impl;

import com.study.rocky.absfactory.factory.AbsFactory;
import com.study.rocky.absfactory.map.location.AbsMapLocation;
import com.study.rocky.absfactory.map.location.impl.GaoDeMapLocation;
import com.study.rocky.absfactory.map.navigation.AbsMapNavigation;
import com.study.rocky.absfactory.map.navigation.impl.GaoDeMapNavigation;
import com.study.rocky.absfactory.map.view.AbsMapView;
import com.study.rocky.absfactory.map.view.impl.GaoDeMapView;

/**
 * Created by Administrator on 2018/4/17 0017.
 */

public class GaoDeFactory extends AbsFactory {
    @Override
    public AbsMapView createMapView() {
        //高德地图
        return new GaoDeMapView();
    }

    @Override
    public AbsMapNavigation createMapNavigation() {
        return new GaoDeMapNavigation();
    }

    @Override
    public AbsMapLocation createMapLocation() {
        return new GaoDeMapLocation();
    }
}
