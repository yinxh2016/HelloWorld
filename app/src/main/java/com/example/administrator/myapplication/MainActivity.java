package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.raizlabs.android.dbflow.sql.language.Select;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        News people = new News();
        people.id = 'i';
        people.save();
        People people1 = new People();
        List<News> list = new Select().from(News.class).queryList();
        for (int i = 0; i < list.size(); i++) {
            Toast.makeText(this, list.size(), Toast.LENGTH_SHORT).show();
        }
    }
}
