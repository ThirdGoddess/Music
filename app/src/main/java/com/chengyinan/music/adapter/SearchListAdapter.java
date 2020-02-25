package com.chengyinan.music.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chengyinan.music.R;
import com.chengyinan.music.bean.SearchBean;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-19 18:51
 */
public class SearchListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<SearchBean.ResultBean.SongsBean> data;

    public SearchListAdapter(Context context, List<SearchBean.ResultBean.SongsBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_search, parent, false);
        return new Item(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Glide.with(context).load(data.get(position).getAlbum().getArtist().getImg1v1Url()).into(((Item) holder).musicPhoto);
        ((Item) holder).MusicName.setText(data.get(position).getName());
        ((Item) holder).authorName.setText(data.get(position).getArtists().get(0).getName());

        ((Item) holder).itemRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void addData(List<SearchBean.ResultBean.SongsBean> addData) {
        data.addAll(addData);
        notifyDataSetChanged();
    }

    /**
     * item
     */
    class Item extends RecyclerView.ViewHolder {

        ImageView musicPhoto;
        TextView MusicName;
        TextView authorName;
        LinearLayout itemRoot;

        Item(@NonNull View itemView) {
            super(itemView);
            musicPhoto = itemView.findViewById(R.id.musicPhoto);
            MusicName = itemView.findViewById(R.id.MusicName);
            authorName = itemView.findViewById(R.id.authorName);
            itemRoot = itemView.findViewById(R.id.itemRoot);
        }
    }


}
