package com.chengyinan.music.adapter;

import android.annotation.SuppressLint;
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
import com.chengyinan.music.bean.HotDataBean;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-18 20:41
 */
public class HotListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<HotDataBean> data;

    private onClickListener onClickListener;


    public HotListAdapter(Context context, List<HotDataBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_hot, parent, false);
        return new Item(inflate);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (position <= 2) {
            ((Item) holder).rankingText.setTextColor(Color.parseColor("#FF0000"));
        } else {
            ((Item) holder).rankingText.setTextColor(Color.parseColor("#CCCCCC"));
        }

        ((Item) holder).rankingText.setText(data.get(position).getRanking() + "");
        Glide.with(context).load(data.get(position).getPhoto()).into(((Item) holder).musicPhoto);
        ((Item) holder).MusicName.setText(data.get(position).getMusicName());
        ((Item) holder).authorName.setText(data.get(position).getAuthor());

        ((Item) holder).itemRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onClick(v, data.get(position).getId());
            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    /**
     * item
     */
    class Item extends RecyclerView.ViewHolder {

        TextView rankingText;
        ImageView musicPhoto;
        TextView MusicName;
        TextView authorName;
        LinearLayout itemRoot;

        Item(@NonNull View itemView) {
            super(itemView);
            rankingText = itemView.findViewById(R.id.rankingText);
            musicPhoto = itemView.findViewById(R.id.musicPhoto);
            MusicName = itemView.findViewById(R.id.MusicName);
            authorName = itemView.findViewById(R.id.authorName);
            itemRoot = itemView.findViewById(R.id.itemRoot);
        }
    }

    public interface onClickListener {
        void onClick(View v, String id);
    }

    public void setOnClickListener(onClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
