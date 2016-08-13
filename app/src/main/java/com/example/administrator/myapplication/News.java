package com.example.administrator.myapplication;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ModelContainer;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Administrator on 2016/8/13.
 */
@Table(database = AppDatabase.class)
public class News extends BaseModel{
    @PrimaryKey(autoincrement = true)
    long id;
    @Column
    String title;
    @Column
    String url;
}
