package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("activity lifecycle","Activity created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("activity lifecycle","onstart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("activity lifecycle","onresume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity lifecycle","onpause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity lifecycle","onstop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("activity lifecycle","onrestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity lifecycle","ondestroy invoked");
    }
}

