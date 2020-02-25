package com.chengyinan.music.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-18 19:12
 */
public class Http {

    private String url;
    private Map<String, String> param;

    public Http(String url) {
        this.url = url;
    }

    public Http(String url, Map<String, String> param) {
        this.url = url;
        this.param = param;
    }

    /**
     * 添加参数
     *
     * @param paramName
     * @param paramValue
     * @return
     */
    public Http addParam(String paramName, String paramValue) {
        if (null == param) {
            param = new HashMap<>();
        }
        param.put(paramName, paramValue);
        return this;
    }

    /**
     * 提交请求
     */
    public void build(final CallListener callListener) {
        //OkHttpClient
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10000L, TimeUnit.SECONDS)
                .readTimeout(10000L, TimeUnit.SECONDS)
                .build();

        //Request
        Request request = new Request.Builder()
                .url(url + paramSplicing()).get()
                .build();

        okHttpClient.newCall(request).enqueue(new BaseCallBack() {
            @Override
            public void onResponse(Call call, Response response) {

                String responseString = null;
                try {
                    responseString = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                callListener.onResponse(call, responseString);
            }
        });
    }

    public interface CallListener {
        void onResponse(Call call, String response);
    }

    private String paramSplicing() {

        if (null == param) {
            return "";
        }

        Set<String> set = param.keySet();

        StringBuilder str = new StringBuilder("?");

        for (String key : set) {
            String value = param.get(key);
            str.append(key).append("=").append(value).append("&");
        }

        return str.substring(0, str.length() - 1);
    }

}
