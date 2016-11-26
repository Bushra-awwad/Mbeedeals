package mbeeseals.com.mbeedeals;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;

public class requests extends AppCompatActivity {
    ViewPager viewPager;
    FragmentPagerAdapter ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);
        Toolbar title_bar  = (Toolbar) findViewById(R.id.title_bar);
        setSupportActionBar(title_bar);

        TextView title = (TextView) findViewById(R.id.mytext) ;
        title.setText(R.string.requests);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        ft = new SampleFragmentPagerAdapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(ft);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setDefaultTabPosition(4);

    }
}
