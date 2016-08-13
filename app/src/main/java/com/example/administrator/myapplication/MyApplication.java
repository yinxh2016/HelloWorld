package com.example.administrator.myapplication;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by Administrator on 2016/8/13.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowConfig.Builder builder = new FlowConfig.Builder(getApplicationContext());
        builder = builder.openDatabasesOnInit(true);
        FlowManager.init(builder.build());
    }
}
