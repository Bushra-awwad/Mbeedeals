package mbeeseals.com.mbeedeals;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar title_bar = (Toolbar) findViewById(R.id.title_bar);
        setSupportActionBar(title_bar);

        TextView title = (TextView) findViewById(R.id.mytext);
        title.setText(R.string.app_name);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);

        final SearchFragment searchFragment = new SearchFragment();
        final NotificationFragment notificationFragment = new NotificationFragment();
        final AdsFragment adsFragment = new AdsFragment();
        final requestFragment requestFragment = new requestFragment();
        final MeetingFragment meetingFragment = new MeetingFragment();

          bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
              @Override
              public void onTabSelected(@IdRes int tabId) {
                  FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                if (tabId == R.id.itemOne) {
                    ft.replace(R.id.PlaceHolder , searchFragment);
                    ft.commit();
                }
                else if (tabId == R.id.itemTow) {
                    ft.replace(R.id.PlaceHolder , notificationFragment);
                    ft.commit();
                }
                else if(tabId == R.id.itemThree) {
                    ft.replace(R.id.PlaceHolder ,adsFragment);
                    ft.commit();
                }
                else if(tabId == R.id.itemFour) {
                    ft.replace(R.id.PlaceHolder , requestFragment);
                    ft.commit();
                }
                else if(tabId == R.id.itemFive) {
                    ft.replace(R.id.PlaceHolder , meetingFragment);
                    ft.commit();
                }
            }
        });





}}