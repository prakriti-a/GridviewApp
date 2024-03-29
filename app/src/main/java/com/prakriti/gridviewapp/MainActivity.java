package com.prakriti.gridviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView myGridview = findViewById(R.id.myGridview);

        GridViewAdapter adapter = new GridViewAdapter(this);
        myGridview.setAdapter(adapter);
    }
}