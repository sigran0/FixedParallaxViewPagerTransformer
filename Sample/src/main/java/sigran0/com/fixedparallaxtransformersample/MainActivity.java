package sigran0.com.fixedparallaxtransformersample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import sigran0.com.parallaxtransformer.ParallaxTransformer;
import sigran0.com.parallaxtransformer.ParallaxItem;
import sigran0.com.fixedparallaxtransformersample.Adapter.SampleAdapter;
import sigran0.com.fixedparallaxtransformersample.Fragment.SampleFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;
    private SampleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.activity_main_pager);
        mAdapter = new SampleAdapter(getSupportFragmentManager());

        SampleFragment fragment1 = new SampleFragment();
        SampleFragment fragment2 = new SampleFragment();
        SampleFragment fragment3 = new SampleFragment();
        SampleFragment fragment4 = new SampleFragment();

        Bundle item1 = new Bundle();
        Bundle item2 = new Bundle();
        Bundle item3 = new Bundle();
        Bundle item4 = new Bundle();

        item1.putString("title", "Hello World!");
        item1.putInt("image", R.drawable.background1);

        item2.putString("title", "Good luck too you!");
        item2.putInt("image", R.drawable.background2);

        item3.putString("title", "Have a nice day!");
        item3.putInt("image", R.drawable.background3);

        item4.putString("title", "Do enjoy your development!");
        item4.putInt("image", R.drawable.background4);

        fragment1.setArguments(item1);
        fragment2.setArguments(item2);
        fragment3.setArguments(item3);
        fragment4.setArguments(item4);

        mAdapter.add(fragment1);
        mAdapter.add(fragment2);
        mAdapter.add(fragment3);
        mAdapter.add(fragment4);

        ParallaxItem backgroundItem = new ParallaxItem(R.id.fr_sample_rl_background);
        ParallaxItem fixItem = new ParallaxItem(R.id.fr_sample_tv_title, ParallaxItem.SPEED.FIXED);
        ParallaxItem fastMoveItem = new ParallaxItem(R.id.fr_sample_tv_right, ParallaxItem.SPEED.SLOWER);
        ParallaxItem leftToRightMoveItem = new ParallaxItem(R.id.fr_sample_tv_left, ParallaxItem.SPEED.FASTEST, ParallaxItem.DIRECTION.REVERSE);

        ParallaxTransformer pt = new ParallaxTransformer(fixItem, backgroundItem, fastMoveItem, leftToRightMoveItem);

        mPager.setAdapter(mAdapter);
        mPager.setPageTransformer(false, pt);
    }
}
