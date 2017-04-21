package com.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(MainActivity.class.getSimpleName(), "In onCreate");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(MainActivity.class.getSimpleName(), "In onStart");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(MainActivity.class.getSimpleName(), "In onPause");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(MainActivity.class.getSimpleName(), "In onResume");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(MainActivity.class.getSimpleName(), "In onStop");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(MainActivity.class.getSimpleName(), "In onRestart");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(MainActivity.class.getSimpleName(), "In onDestroy");
    }
}
