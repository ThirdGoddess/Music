package com.chengyinan.music.modle;

import android.content.Context;
import android.util.Log;

import com.chengyinan.music.bean.MusicDetail;
import com.chengyinan.music.bean.MusicUrlBean;
import com.chengyinan.music.utils.BaseUrl;
import com.chengyinan.music.utils.Http;
import com.google.gson.Gson;

import okhttp3.Call;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-19 20:12
 */
public class MusicActivityModle {

    private Context context;
    private String musicUrl;

    public MusicActivityModle(Context context) {
        this.context = context;
    }

    /**
     * 搜索音乐
     *
     * @param musicId
     */
    public void searchMsic(String musicId, musicUrlDetail musicUrlDetail) {
        Http http = new Http(BaseUrl.musicUrl).addParam("id", musicId);
        http.build((call, response) -> {
            Log.d("mylog-res", musicId);
            Log.d("mylog-res", response);
            MusicUrlBean musicDetail = new Gson().fromJson(response, MusicUrlBean.class);
            musicUrl = musicDetail.getData().get(0).getUrl();
            musicUrlDetail.musicUrl(musicUrl);
        });

    }

    /**
     * 获取歌曲详细
     */
    public void getMusicDetail() {

    }

    public interface musicUrlDetail {
        void musicUrl(String url);
    }
}
