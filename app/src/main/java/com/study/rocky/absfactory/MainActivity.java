package com.study.rocky.absfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.study.rocky.absfactory.factory.AbsFactory;
import com.study.rocky.absfactory.factory.impl.BaiDuFactory;
import com.study.rocky.absfactory.factory.impl.GaoDeFactory;
import com.study.rocky.absfactory.map.location.AbsMapLocation;
import com.study.rocky.absfactory.map.navigation.AbsMapNavigation;
import com.study.rocky.absfactory.map.view.AbsMapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AbsFactory factory = new BaiDuFactory();
        AbsMapView mapView = factory.createMapView();
        AbsMapLocation mapLocation = factory.createMapLocation();
        AbsMapNavigation mapNavigation = factory.createMapNavigation();
        mapNavigation.turnByTurn();
        mapLocation.location();
    }

}
