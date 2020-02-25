package com.chengyinan.music.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.io.IOException;

public class MyService extends Service {

    private String path;
    private MediaPlayer player;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        path = intent.getStringExtra("url");

        try {
            //准备资源
            player.setDataSource(path);
            player.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return new MyBinder();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        player = new MediaPlayer();
    }

    //该方法包含关于歌曲的操作
    public class MyBinder extends Binder {

        //判断是否处于播放状态
        public boolean isPlaying() {
            return player.isPlaying();
        }

        //播放或暂停歌曲
        public void play() {
            if (player.isPlaying()) {
                player.pause();
            } else {
                player.start();
            }
        }

        //返回歌曲的长度，单位为毫秒
        public int getDuration() {
            return player.getDuration();
        }

        //返回歌曲目前的进度，单位为毫秒
        public int getCurrenPostion() {
            return player.getCurrentPosition();
        }

        //设置歌曲播放的进度，单位为毫秒
        public void seekTo(int mesc) {
            player.seekTo(mesc);
        }
    }


}
