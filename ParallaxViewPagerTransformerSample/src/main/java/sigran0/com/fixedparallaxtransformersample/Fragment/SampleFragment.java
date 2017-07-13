package sigran0.com.fixedparallaxtransformersample.Fragment;

import android.graphics.Matrix;
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
        mIvBackground = (ImageView) view.findViewById(R.id.fr_sample_iv_background);

        String title = getArguments().getString("title");
        int image = getArguments().getInt("image");

        mTvTitle.setText(title);

        mIvBackground.setImageResource(image);
        mIvBackground.post(new Runnable() {
            @Override
            public void run() {
                Matrix matrix = new Matrix();
                matrix.reset();

                float wv = mIvBackground.getWidth();
                float hv = mIvBackground.getHeight();

                float wi = mIvBackground.getDrawable().getIntrinsicWidth();
                float hi = mIvBackground.getDrawable().getIntrinsicHeight();

                float width = wv;
                float height = hv;

                if (wi / wv > hi / hv) {
                    matrix.setScale(hv / hi, hv / hi);
                    width = wi * hv / hi;
                } else {
                    matrix.setScale(wv / wi, wv / wi);
                    height= hi * wv / wi;
                }

                matrix.preTranslate((wv - width) / 2, (hv - height) / 2);
                mIvBackground.setScaleType(ImageView.ScaleType.MATRIX);
                mIvBackground.setImageMatrix(matrix);
            }
        });

        return view;
    }
}
