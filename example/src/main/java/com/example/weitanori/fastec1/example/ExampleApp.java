package com.example.weitanori.fastec1.example;

import android.app.Application;

import com.example.latte.app.Latte;

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .configure();
    }
}
