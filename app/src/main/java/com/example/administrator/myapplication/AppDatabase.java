package com.example.administrator.myapplication;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Administrator on 2016/8/13.
 */
@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION)
public class AppDatabase {
    public static final String NAME="AppDatabase";
    public static final int VERSION=1;
}
