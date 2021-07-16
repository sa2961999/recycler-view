package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView main_recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_recycler=findViewById(R.id.main_recycler);
        main_recycler.setLayoutManager(new LinearLayoutManager(this));
        main_recycler.setAdapter(new adapter());


    }
}