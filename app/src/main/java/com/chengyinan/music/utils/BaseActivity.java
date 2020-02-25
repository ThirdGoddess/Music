package com.chengyinan.music.utils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-18 18:56
 */
public class BaseActivity extends AppCompatActivity {

    public static final int DELAY = 500;
    private static long lastClickTime = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //状态栏黑色字体
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        //将Activity添加到栈
        addActivity(this);
    }


    /**
     * 栈管理Activity：添加Activity
     *
     * @param activity
     */
    public static void addActivity(Activity activity) {
        MainApp.addActivity(activity);
    }


    /**
     * 栈管理Activity：删除最后一个Activity
     */
    public static void removeActivity() {
        MainApp.removeActivity();
    }

    /**
     * 栈管理Activity：删除指定Activity
     *
     * @param activity
     */
    public static void removeActivity(Activity activity) {
        MainApp.removeActivity(activity);
    }

    /**
     * 防止连点
     *
     * @return
     */
    public boolean clickNext() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastClickTime > DELAY) {
            lastClickTime = currentTime;
            return true;
        } else {
            return false;
        }
    }
}
