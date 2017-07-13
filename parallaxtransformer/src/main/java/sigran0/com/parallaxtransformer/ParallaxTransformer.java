package sigran0.com.parallaxtransformer;

import android.os.Build;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jungsungwoo on 7/13/17.
 */

public class ParallaxTransformer implements ViewPager.PageTransformer {

    private static final String TAG = "FPT";
    private static final String EXCEPTION_ERROR_VIEW = "res Id of view must be correct";

    private List<ParallaxItem> mItemList;

    private float speed = 0.2f;

    public ParallaxTransformer(List<ParallaxItem> items){
        mItemList = items;
    }

    public ParallaxTransformer(int res, float speed){
        mItemList = new ArrayList<>();
        mItemList.add(new ParallaxItem(res, speed));
    }

    public ParallaxTransformer(ParallaxItem... items){

        mItemList = new ArrayList<>();

        for(ParallaxItem item : items){
            mItemList.add(item);
        }
    }

    @Override
    public void transformPage(View view, float position){

        if(Build.VERSION.SDK_INT <= 13)
            throw new UnsupportedOperationException("This library can use after HoneyComb version");

        for(ParallaxItem item : mItemList){
            View parallaxView = view.findViewById(item.getItemResource());

            if(parallaxView == null)
                throw new NullPointerException(EXCEPTION_ERROR_VIEW);

            float parallaxViewWidth = parallaxView.getWidth();
            parallaxView.setTranslationX( position * parallaxViewWidth * item.getSpeed() * item.getDirection() );
        }
    }
}