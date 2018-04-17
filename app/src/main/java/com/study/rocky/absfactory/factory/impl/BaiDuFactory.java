package com.study.rocky.absfactory.factory.impl;

import com.study.rocky.absfactory.factory.AbsFactory;
import com.study.rocky.absfactory.map.location.AbsMapLocation;
import com.study.rocky.absfactory.map.location.impl.BaiDuMapLocation;
import com.study.rocky.absfactory.map.navigation.AbsMapNavigation;
import com.study.rocky.absfactory.map.navigation.impl.BaiDuMapNavigation;
import com.study.rocky.absfactory.map.view.AbsMapView;
import com.study.rocky.absfactory.map.view.impl.BaiDuMapView;

/**
 * Created by Administrator on 2018/4/17 0017.
 */

public class BaiDuFactory extends AbsFactory {
    @Override
    public AbsMapView createMapView() {
        //创建百度地图
        BaiDuMapView baiduMapView = new BaiDuMapView();
        baiduMapView.onStart();
        return baiduMapView;
    }

    @Override
    public AbsMapNavigation createMapNavigation() {
        return new BaiDuMapNavigation();
    }

    @Override
    public AbsMapLocation createMapLocation() {
        return new BaiDuMapLocation();
    }
}
