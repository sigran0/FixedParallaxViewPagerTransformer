# FixedParallaxTransformer

### What is this?
---
FixParallaxTransformer Plugin is ViewPager.PageTransformer plugin to parallax moving.
it is easy to use. and can make beautiful ViewPager in your app.

![Alt Text](https://github.com/sigran0/FixedParallaxViewPagerTransformer/blob/master/sample.gif)


### Install
---
First, add this line in your project gradle.build
```java
repositories {
    maven {
        url 'https://dl.bintray.com/sigran0/maven/'
    }
}
```
Second, add this line in your app gradle.build
```java
compile 'com.smtown.sigran0:FixedParallaxTransformer:0.1.3'
```

just end!


### Useage
---
To make parallax, just add Resource ID of view that you want to parallax moving in your Fragment of ViewPager

Follow below code.

```java
ParallaxItem backgroundItem = new ParallaxItem(R.id.fr_sample_rl_background);
ParallaxItem fixItem = new ParallaxItem(R.id.fr_sample_tv_title, ParallaxItem.SPEED.FIXED);
ParallaxItem fastMoveItem = new ParallaxItem(R.id.fr_sample_tv_right, ParallaxItem.SPEED.SLOWER);
ParallaxItem leftToRightMoveItem = new ParallaxItem(R.id.fr_sample_tv_left, ParallaxItem.SPEED.FASTEST, ParallaxItem.DIRECTION.REVERSE);
```
And create instance of ParallaxTransformer and add your ParallaxItem into this instance.
The constructor of ParallaxTransformer can have following parameters
 - List
 - Single ParallaxItem
 - Multi ParallaxItem

Follow below code
```java
ViewPager mPager;
...
ParallaxTransformer pt = new ParallaxTransformer(fixItem, backgroundItem, fastMoveItem, leftToRightMoveItem);
mPager.setPageTransformer(false, pt);
```

### Todos
---
 - Make moving forward and backward equal position

### License
---
MIT



Thanks to use this plugin
