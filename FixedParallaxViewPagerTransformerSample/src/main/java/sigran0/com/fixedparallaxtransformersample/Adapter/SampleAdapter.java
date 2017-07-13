package sigran0.com.fixedparallaxtransformersample.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

import sigran0.com.fixedparallaxtransformersample.Fragment.SampleFragment;

/**
 * Created by jungsungwoo on 7/13/17.
 */

public class SampleAdapter extends FragmentPagerAdapter {

    private static final String TAG = "SampleAdapter";

    private ArrayList<SampleFragment> mFragmentList;

    public SampleAdapter(FragmentManager fm) {
        super(fm);

        mFragmentList = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int pos){
        return mFragmentList.get(pos);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void add(SampleFragment fragment){

        mFragmentList.add(fragment);
        notifyDataSetChanged();
    }

    public void remove(int pos){
        mFragmentList.remove(pos);
        notifyDataSetChanged();
    }
}
