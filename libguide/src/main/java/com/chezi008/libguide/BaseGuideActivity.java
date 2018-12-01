package com.chezi008.libguide;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import com.dotlibrary.BezierBannerDot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：chezi008 on 2018/11/30 22:03
 * @description ：引导页基类
 * @email ：chezi008@qq.com
 */
public abstract class BaseGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_guide);
        initView();
    }

    private ViewPager viewPager;
    private GuidePageAdapter mPageAdapter;
    private List<View> mData = new ArrayList<>();
    private BezierBannerDot indicator;

    private void initView() {
        viewPager = findViewById(R.id.viewPager);
        mPageAdapter = new GuidePageAdapter(mData);
        initData();
        viewPager.setAdapter(mPageAdapter);
        attachToViewpager(viewPager);
    }

    /**
     * 初始化数据
     */
    protected abstract void initData();

    protected void attachToViewpager(ViewPager viewPager){
        indicator = findViewById(R.id.bezierBannerDot);
        indicator.attachToViewpager(viewPager);
    }

    protected void addView(int resId) {
        View view = LayoutInflater.from(this).inflate(resId, null);
        mData.add(view);
    }

    protected void addView(View view) {
        mData.add(view);
    }
}
