package com.gioppl.imageedittext;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by GIOPPL on 2017/8/10.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
