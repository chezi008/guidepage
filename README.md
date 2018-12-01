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