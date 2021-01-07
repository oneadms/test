package com.example.test;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    void initView() {
        RecyclerView recyclerView = findViewById(R.id.rc);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3,RecyclerView.VERTICAL,false));
        ArrayList<Object> ls = new ArrayList<>();

        ls.add(1);ls.add(1);ls.add(1);ls.add(1);ls.add(1);ls.add(1);ls.add(1);
        recyclerView.setAdapter( new MyAdapter(this,ls));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        initView();
    }
}
