package com.recycler.coverflow.recyclerview;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutManager;
import androidx.appcompat.widget.RecyclerView;

import com.recycler.coverflow.R;

/**
 * 嵌套RecyclerView Demo
 *
 * @author Chen Xiaoping (562818444@qq.com)
 * @version RecyclerCoverFlow
 * @Datetime 2017-08-05 10:50
 * @since RecyclerCoverFlow
 */

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        initList();
    }

    private void initList() {
        mList = (RecyclerView) findViewById(R.id.list);
        mList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mList.setAdapter(new ListAdapter());
    }
}
