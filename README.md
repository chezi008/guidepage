# guidepage
安卓引导页框架

[![](https://jitpack.io/v/chezi008/guidepage.svg)](https://jitpack.io/#chezi008/guidepage)

### 添加依赖
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
```
	dependencies {
	        implementation 'com.github.chezi008:guidepage:1.x.x'
	}
```
### 如何使用
```
class MainActivity : BaseGuideActivity() {

    override fun initData() {
        addView(R.layout.view_guide_one)
        addView(R.layout.view_guide_two)
        addView(R.layout.view_guide_three)
    }
}
```
### 更新
#### 1.0.1
- 添加方法void addView(View view)
- 复写void attachToViewpager(ViewPager viewPager)即可自己绑定指示器（circleIndex）

#### 1.0.2
- 添加方法void attachToViewpager(ViewPager viewPager),使用者只需要继承改方法就可自己使用指示器绑定viewPager。
- 默认指示器添加选择颜色以及未选中颜色的方法，用户需要设置指示器颜色只需要实现 abstract void setIndicator(BezierBannerDot indicator)方法即可。

### 效果图
![](https://github.com/chezi008/guidepage/blob/master/screen/guidepage_screen.gif)
