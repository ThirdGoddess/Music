package com.chengyinan.music;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;

import com.chengyinan.music.activity.MusicActivity;
import com.chengyinan.music.activity.SearchActivity;
import com.chengyinan.music.adapter.HotListAdapter;
import com.chengyinan.music.bean.HotBean;
import com.chengyinan.music.modle.MainActivityModle;
import com.chengyinan.music.utils.BaseActivity;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.search)
    TextView search;
    @BindView(R.id.hotList)
    RecyclerView hotList;

    private MainActivityModle mainActivityModle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainActivityModle = new MainActivityModle(this);

        intoData();


    }

    /**
     * 数据加载
     */
    private void intoData() {
        mainActivityModle.httpHotData(hotBean -> {
            Handler mainHandler = new Handler(Looper.getMainLooper());
            mainHandler.post(() -> {
                //已在主线程中，更新UI
                mainActivityModle.setHotListData(hotList, hotBean);

                mainActivityModle.getHotListAdapter().setOnClickListener((v, id) -> {
                    if (clickNext()) {
                        Intent intent = new Intent(this, MusicActivity.class);
                        intent.putExtra("musicId", id);
                        startActivity(intent);
                    }
                });

            });
        });
    }

    @OnClick(R.id.search)
    public void onViewClicked() {
        if (clickNext()) {
            //搜索点击
            Intent intent = new Intent(this, SearchActivity.class);
            startActivity(intent);
        }
    }
}
