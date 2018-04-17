package com.study.rocky.absfactory.map.view;

/**
 * Created by Administrator on 2018/4/17 0017.
 */

public abstract class AbsMapView {
    //抽象地图  同步生命周期
    public abstract void onStart();

    public abstract void onResume();

    public abstract void onDestroy();
}
