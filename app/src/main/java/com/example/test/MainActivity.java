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
        ArrayList<Item> ls = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ls.add(new Item(R.drawable.ic_launcher_background, "test"+i));
        }
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
