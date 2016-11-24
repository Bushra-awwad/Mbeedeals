package mbeeseals.com.mbeedeals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

public class introActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Toolbar title_bar  = (Toolbar) findViewById(R.id.title_bar);
        setSupportActionBar(title_bar);

        TextView title = (TextView) findViewById(R.id.mytext) ;
        title.setText(R.string.app_name);

        ImageButton arrow = (ImageButton) findViewById(R.id.arrowback) ;
          arrow.setVisibility(View.GONE);
    }
}
