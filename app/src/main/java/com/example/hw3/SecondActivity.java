package com.example.hw3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    private String componentName = MainActivity.class.getSimpleName();

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(componentName, "onStart");
    }
}
