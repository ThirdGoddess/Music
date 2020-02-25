package com.chengyinan.music.utils;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-19 19:09
 */
public class RecyclerViewScrollListener extends RecyclerView.OnScrollListener implements BaseModle.BottomListener {

    // 最后几个完全可见项的位置（瀑布式布局会出现这种情况）
    private int[] lastCompletelyVisiblePositions;
    // 最后一个完全可见项的位置
    private int lastCompletelyVisibleItemPosition;

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        // 找到最后一个完全可见项的位置
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager manager = (StaggeredGridLayoutManager) layoutManager;
            if (lastCompletelyVisiblePositions == null) {
                lastCompletelyVisiblePositions = new int[manager.getSpanCount()];
            }
            manager.findLastCompletelyVisibleItemPositions(lastCompletelyVisiblePositions);
            lastCompletelyVisibleItemPosition = getMaxPosition(lastCompletelyVisiblePositions);
        } else if (layoutManager instanceof GridLayoutManager) {
            lastCompletelyVisibleItemPosition = ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            lastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        } else {
            throw new RuntimeException("Unsupported LayoutManager.");
        }
    }

    private int getMaxPosition(int[] positions) {
        int max = positions[0];
        for (int i = 1; i < positions.length; i++) {
            if (positions[i] > max) {
                max = positions[i];
            }
        }
        return max;
    }

    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int visibleItemCount = layoutManager.getChildCount();
        int totalItemCount = layoutManager.getItemCount();
        if (newState == RecyclerView.SCROLL_STATE_IDLE) {
            if (visibleItemCount > 0 && lastCompletelyVisibleItemPosition >= totalItemCount - 1) {
                onScrollToBottom();
            }
        }
    }

    @Override
    public void onScrollToBottom() {

    }
}