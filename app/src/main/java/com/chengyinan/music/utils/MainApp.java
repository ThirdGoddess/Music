package com.chengyinan.music.utils;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-18 18:36
 */
public class MainApp extends Application {

    private static List<Activity> activityList;

    @Override
    public void onCreate() {
        super.onCreate();
        activityList = new ArrayList<>();
    }

    /**
     * 栈管理Activity：添加Activity
     *
     * @param activity
     */
    public static void addActivity(Activity activity) {
        activityList.add(activity);
    }


    /**
     * 栈管理Activity：删除最后一个Activity
     */
    public static void removeActivity() {
        activityList.get(activityList.size() - 1).finish();
    }

    /**
     * 栈管理Activity：删除指定Activity
     *
     * @param activity
     */
    public static void removeActivity(Activity activity) {

        for (int i = 0; i < activityList.size(); i++) {
            if (activity == activityList.get(i)) {
                activityList.get(i).finish();
                activityList.remove(activity);
                break;
            }
        }
    }


}
