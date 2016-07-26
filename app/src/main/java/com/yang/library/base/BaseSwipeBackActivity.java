package com.yang.library.base;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yang.library.utils.LogUtil;

import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;


/**
 * 使用此基类activity，必须设置主题为透明，才能实现左滑后退。
 * 注意：在栈最低层对的activity，请勿使用此基类，在android 4.4，会导致上层的activity左滑时显示桌面
 * Created by yang on 2016/6/14.
 */
public class BaseSwipeBackActivity extends SwipeBackActivity {
    private String TAG = this.getClass().getSimpleName();
    private SwipeBackLayout swipeBackLayout;

    //设置左滑后退
    private int edgeFlags = SwipeBackLayout.EDGE_LEFT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.i(TAG + "------" + "onCreate");

        swipeBackLayout = getSwipeBackLayout();
        swipeBackLayout.setEdgeTrackingEnabled(edgeFlags);
    }


    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.i(TAG + "------" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.i(TAG + "------" + "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.i(TAG + "------" + "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.i(TAG + "------" + "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.i(TAG + "------" + "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.i(TAG + "------" + "onRestart");
    }
}
