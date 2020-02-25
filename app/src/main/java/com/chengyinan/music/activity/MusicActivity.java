package com.chengyinan.music.activity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;

import com.chengyinan.music.R;
import com.chengyinan.music.modle.MusicActivityModle;
import com.chengyinan.music.service.MyService;
import com.chengyinan.music.utils.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 音乐播放页面
 */
public class MusicActivity extends BaseActivity {


    @BindView(R.id.play)
    Button play;
    private MusicActivityModle musicActivityModle;

    private String musicId;
    private String musicUrl;

    private MyConnection conn;
    private MyService.MyBinder musicControl;

    private static final int UPDATE_PROGRESS = 0;

    //使用handler定时更新进度条
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case UPDATE_PROGRESS:
//                    updateProgress();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        ButterKnife.bind(this);

        musicActivityModle = new MusicActivityModle(this);

        intoIntent();

        intoData();

    }

    /**
     * 数据绑定
     */
    private void intoData() {

        //歌曲Url
        MusicActivityModle.musicUrlDetail musicUrlDetail = url -> {
            musicUrl = url;


            //播放
            Handler mainHandler = new Handler(Looper.getMainLooper());
            mainHandler.post(() -> {
                Intent intent = new Intent(this, MyService.class);
                intent.putExtra("url", musicUrl);
                conn = new MyConnection();
                startService(intent);
                bindService(intent, conn, BIND_AUTO_CREATE);
            });


//            //播放
//            Handler mainHandler = new Handler(Looper.getMainLooper());
//            mainHandler.post(() -> {
//                MediaPlayer mediaPlayer = new MediaPlayer();
//                try {
//                    mediaPlayer.setDataSource(musicUrl);
//                    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//                    mediaPlayer.prepare(); //准备播放
//                    mediaPlayer.start();//开始播放
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });

        };
        musicActivityModle.searchMsic(musicId, musicUrlDetail);


    }

    private void intoIntent() {
        Intent intent = getIntent();
        musicId = intent.getStringExtra("musicId");
    }

    @OnClick(R.id.play)
    public void onViewClicked() {
        if (clickNext()) {
            play();
        }
    }

    private class MyConnection implements ServiceConnection {

        //服务启动完成后会进入到这个方法
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //获得service中的MyBinder
            musicControl = (MyService.MyBinder) service;
//            //更新按钮的文字
//            updatePlayText();
//            //设置进度条的最大值
//            seekBar.setMax(musicControl.getDuration());
//            //设置进度条的进度
//            seekBar.setProgress(musicControl.getCurrenPostion());
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //退出应用后与service解除绑定
        unbindService(conn);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //停止更新进度条的进度
        handler.removeCallbacksAndMessages(null);
    }

    //更新按钮的文字
    public void updatePlayText() {
        if (musicControl.isPlaying()) {
//            playBtn.setText("暂停");
            handler.sendEmptyMessage(UPDATE_PROGRESS);
        } else {
//            playBtn.setText("播放");
        }
    }


    //调用MyBinder中的play()方法
    public void play() {
        musicControl.play();
        updatePlayText();
    }
}
