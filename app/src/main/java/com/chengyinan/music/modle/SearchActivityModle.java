package com.chengyinan.music.modle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.chengyinan.music.adapter.SearchListAdapter;
import com.chengyinan.music.bean.SearchBean;
import com.chengyinan.music.utils.BaseUrl;
import com.chengyinan.music.utils.Http;
import com.chengyinan.music.utils.RecyclerViewScrollListener;
import com.google.gson.Gson;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-19 18:25
 */
public class SearchActivityModle {
    private Context context;
    private RecyclerView searchList;
    private String searchText = "";

    private SearchListAdapter searchListAdapter;

    private int limit = 20;
    private int offset = 0;

    public SearchActivityModle(Context context) {
        this.context = context;
    }

    public void searchMusic(String searchText) {
        if (!this.searchText.equals(searchText)) {
            offset = 0;
            this.searchText = searchText;
        }

        getSearchData(searchText);

        searchList.addOnScrollListener(new RecyclerViewScrollListener() {
            @Override
            public void onScrollToBottom() {
                // 加载更多
                offset++;
                addData();
            }
        });
    }

    private void getSearchData(String searchText) {
        Http http = new Http(BaseUrl.searchMusic)
                .addParam("keywords", searchText.trim())
                .addParam("offset", offset + "")
                .addParam("limit", limit + "");
        http.build((call, response) -> {
            Handler mainHandler = new Handler(Looper.getMainLooper());
            mainHandler.post(() -> {
                SearchBean searchBean = new Gson().fromJson(response, SearchBean.class);
                searchListAdapter = new SearchListAdapter(context, searchBean.getResult().getSongs());
                searchList.setAdapter(searchListAdapter);
            });
        });
    }

    private void addData() {
        Http http = new Http(BaseUrl.searchMusic)
                .addParam("keywords", searchText.trim())
                .addParam("offset", offset + "")
                .addParam("limit", limit + "");
        http.build((call, response) -> {
            Handler mainHandler = new Handler(Looper.getMainLooper());
            mainHandler.post(() -> {
                SearchBean searchBean = new Gson().fromJson(response, SearchBean.class);
                searchListAdapter.addData(searchBean.getResult().getSongs());
            });
        });
    }

    /**
     * RecyclerViewManager
     *
     * @param searchList
     */
    public void setLayoutManager(RecyclerView searchList) {
        this.searchList = searchList;
        searchList.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));
    }


}
