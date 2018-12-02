package com.chezi008.guidepagedemo

import android.graphics.Color
import com.chezi008.libguide.BaseGuideActivity
import com.chezi008.libguide.BezierBannerDot

class MainActivity : BaseGuideActivity() {


    override fun initData() {
        addView(R.layout.view_guide_one)
        addView(R.layout.view_guide_two)
        addView(R.layout.view_guide_three)
    }

    override fun setIndicator(indicator: BezierBannerDot?) {
        indicator?.setSelectedColor(resources.getColor(R.color.colorPrimary))
        indicator?.setUnSelectedColor(Color.RED)
    }
}