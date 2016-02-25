package com.voyager.weather;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.thinkland.sdk.android.JuheSDKInitializer;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    /**
     * init data.
     */
    private void initData() {
        JuheSDKInitializer.initialize(getApplicationContext());
    }

    /**
     * init view.
     */
    private void initView() {
        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolBar);
        SwipeRefreshLayout pull_refresh_view = (SwipeRefreshLayout) findViewById(R.id.pull_refresh_view);
        pull_refresh_view.setOnRefreshListener(this);
    }

    /**
     * call this when user pull to refresh
     */
    @Override
    public void onRefresh() {

    }
}
