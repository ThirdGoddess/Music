package com.chengyinan.music.modle;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.chengyinan.music.activity.MusicActivity;
import com.chengyinan.music.adapter.HotListAdapter;
import com.chengyinan.music.bean.HotBean;
import com.chengyinan.music.bean.HotDataBean;
import com.chengyinan.music.utils.BaseModle;
import com.chengyinan.music.utils.BaseUrl;
import com.chengyinan.music.utils.Http;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-18 20:31
 */
public class MainActivityModle {
    private Context context;
    private HotBean hotBean;
    private HotListAdapter hotListAdapter;

    public MainActivityModle(Context context) {
        this.context = context;
    }

    /**
     * 获取热搜数据
     */
    public void httpHotData(final httpCallBack httpCallBack) {
        Http http = new Http(BaseUrl.searchHot);
        http.build((call, response) -> {
            hotBean = new Gson().fromJson(response, HotBean.class);
            httpCallBack.hotData(hotBean);
        });
    }


    /**
     * 适配热搜列表
     *
     * @param hotList
     * @param hotBean
     */
    public void setHotListData(RecyclerView hotList, HotBean hotBean) {

        List<HotDataBean> dataBeans = new ArrayList<>();

        for (int i = 0; i < hotBean.getPlaylist().getTracks().size(); i++) {
            dataBeans.add(new HotDataBean(i + 1, hotBean.getPlaylist().getTracks().get(i).getId() + "", hotBean.getPlaylist().getTracks().get(i).getName(), hotBean.getPlaylist().getTracks().get(i).getAr().get(0).getName(), hotBean.getPlaylist().getTracks().get(i).getAl().getPicUrl()));
        }

        hotList.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));
        hotListAdapter = new HotListAdapter(context, dataBeans);
        hotListAdapter.setOnClickListener((v, id) -> {
            Intent intent = new Intent(context, MusicActivity.class);
            context.startActivity(intent);
        });

        hotList.setAdapter(hotListAdapter);
    }

    public HotListAdapter getHotListAdapter() {
        return hotListAdapter;
    }

    public interface httpCallBack {
        void hotData(HotBean hotBean);
    }
}
