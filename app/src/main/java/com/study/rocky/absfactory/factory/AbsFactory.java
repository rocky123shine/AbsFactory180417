package com.study.rocky.absfactory.factory;

import com.study.rocky.absfactory.map.location.AbsMapLocation;
import com.study.rocky.absfactory.map.navigation.AbsMapNavigation;
import com.study.rocky.absfactory.map.view.AbsMapView;

/**
 * Created by Administrator on 2018/4/17 0017.
 */

public abstract class AbsFactory {
    //抽象工厂 提供公用方法  创建地图 导航 和定位--->地图的功能
    public abstract AbsMapView createMapView();

    public abstract AbsMapNavigation createMapNavigation();

    public abstract AbsMapLocation createMapLocation();
}
