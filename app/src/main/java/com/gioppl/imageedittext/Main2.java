package com.gioppl.imageedittext;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

/**
 * Created by GIOPPL on 2017/8/10.
 */

public class Main2 extends Activity {
    private RecyclerView mRV;
    private LinearLayoutManager mLinearLayoutManager;
    private MyAdapt mAdapt;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRV= (RecyclerView) findViewById(R.id.id_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRV.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        mAdapt = new MyAdapt();
        mRV.setAdapter(mAdapt);
        mRV.setItemAnimator(new DefaultItemAnimator());
    }
}
