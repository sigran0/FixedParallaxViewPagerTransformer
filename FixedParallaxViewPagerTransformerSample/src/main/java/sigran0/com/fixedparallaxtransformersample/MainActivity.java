package sigran0.com.fixedparallaxtransformersample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

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

        Bundle item1 = new Bundle();
        Bundle item2 = new Bundle();
        Bundle item3 = new Bundle();

        item1.putString("title", "Hello World!");
        item2.putString("title", "Good luck too you!");
        item3.putString("title", "Have a nice day!");

        fragment1.setArguments(item1);
        fragment2.setArguments(item2);
        fragment3.setArguments(item3);

        mAdapter.add(fragment1);
        mAdapter.add(fragment2);
        mAdapter.add(fragment3);

        mPager.setAdapter(mAdapter);
    }
}
