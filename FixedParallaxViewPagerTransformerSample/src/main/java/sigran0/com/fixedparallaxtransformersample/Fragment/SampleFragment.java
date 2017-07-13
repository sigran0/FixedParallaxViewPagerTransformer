package sigran0.com.fixedparallaxtransformersample.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import sigran0.com.fixedparallaxtransformersample.R;

/**
 * Created by jungsungwoo on 7/13/17.
 */

public class SampleFragment extends Fragment {

    private TextView mTvTitle;
    private ImageView mIvBackground;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_sample, container, false);

        mTvTitle = (TextView) view.findViewById(R.id.fr_sample_tv_title);


        String title = getArguments().getString("title");

        mTvTitle.setText(title);

        return view;
    }
}
