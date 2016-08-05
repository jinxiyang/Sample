package com.yang.library.base;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by yangjinxi on 2016/7/27.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobclickAgent.setCatchUncaughtExceptions(true);
    }
}
