package com.chengyinan.music.utils;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-18 19:30
 */
public abstract class BaseCallBack implements Callback {
    @Override
    public void onFailure(Call call, IOException e) {
        Log.d("mylog-error", e.toString());
    }

    @Override
    public abstract void onResponse(Call call, Response response) throws IOException;

}
