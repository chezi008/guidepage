package com.chezi008.guidepagedemo

import com.chezi008.libguide.BaseGuideActivity

class MainActivity : BaseGuideActivity() {

    override fun initData() {
        addView(R.layout.view_guide_one)
        addView(R.layout.view_guide_two)
        addView(R.layout.view_guide_three)
    }
}
