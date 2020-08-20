package com.speed.gs.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.speed.ndkdemo.Jni;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Jni jni =  new Jni() ;
        jni.getString(onErrorListener);
    }

    public native int speed(String[] list);


    Jni.OnErrorListener onErrorListener  = new Jni.OnErrorListener() {
        @Override
        public void getCurResponseRate(int code, String msg) {

        }
    };
}
