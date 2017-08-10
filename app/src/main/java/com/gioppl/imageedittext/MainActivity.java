package com.gioppl.imageedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private MyRecyclerViewAdapter_Best mRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerView);

        mLinearLayoutManager = new LinearLayoutManager(this);

        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mRecyclerViewAdapter = new MyRecyclerViewAdapter_Best(this,Images.imageUrls);

        mRecyclerView.setAdapter(mRecyclerViewAdapter);


    }

}
