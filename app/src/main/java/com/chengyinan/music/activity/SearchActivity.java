package com.chengyinan.music.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.chengyinan.music.R;
import com.chengyinan.music.modle.SearchActivityModle;
import com.chengyinan.music.utils.BaseActivity;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 搜索Activity
 */
public class SearchActivity extends BaseActivity {

    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.searchTextInput)
    EditText searchTextInput;
    @BindView(R.id.searchButton)
    TextView searchButton;
    @BindView(R.id.searchList)
    RecyclerView searchList;

    private SearchActivityModle searchActivityModle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        searchActivityModle = new SearchActivityModle(this);

        searchActivityModle.setLayoutManager(searchList);

    }

    @OnClick({R.id.back, R.id.searchButton})
    public void onViewClicked(View view) {
        if (clickNext()) {
            switch (view.getId()) {
                case R.id.back:
                    removeActivity();
                    break;
                case R.id.searchButton:
                    //搜索
                    searchActivityModle.searchMusic(searchTextInput.getText().toString());
                    break;
            }
        }
    }
}
