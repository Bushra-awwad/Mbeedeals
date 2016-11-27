package mbeeseals.com.mbeedeals;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;


public class MainActivity extends AppCompatActivity {

   ViewPager viewPager;
    FragmentPagerAdapter ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar title_bar = (Toolbar) findViewById(R.id.title_bar);
        setSupportActionBar(title_bar);

        TextView title = (TextView) findViewById(R.id.mytext);
        title.setText(R.string.app_name);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setDefaultTabPosition(4);

          bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
              @Override
              public void onTabSelected(@IdRes int tabId) {

                if (tabId == R.id.itemOne) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.PlaceHolder , new SearchFragment());
                    ft.commit();
                }
                else if (tabId == R.id.itemTow) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.PlaceHolder , new requestFragment());
                    ft.commit();
                }
                else if(tabId == R.id.itemThree) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.PlaceHolder , new singInFragment());
                    ft.commit();
                }
                else if(tabId == R.id.itemFour) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.PlaceHolder , new signUpFragment());
                    ft.commit();
                }
                else if(tabId == R.id.itemFive) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.PlaceHolder , new introFragment());
                    ft.commit();
                }
            }
        });


}}