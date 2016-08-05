package com.yang.sample.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.view.View;

import com.yang.library.base.BaseActivity;
import com.yang.library.utils.LogUtil;
import com.yang.sample.R;
import com.yang.sample.login.LoginActivity;

/**
 *
 */
public class SplashActivity extends BaseActivity{
    private static final int DELAY_TIME = 2000;
    private View mContentView;

    private final Handler mHandler = new Handler();

    private final Runnable loginRun = new Runnable() {
        @Override
        public void run() {
            LogUtil.i(Thread.currentThread().getName());
            "sub".substring(10);
            int t = 3/0;
//            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
//            startActivity(intent);
//            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        mContentView = findViewById(R.id.fullscreen_content);
        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        mHandler.postDelayed(loginRun, DELAY_TIME);
    }

}
