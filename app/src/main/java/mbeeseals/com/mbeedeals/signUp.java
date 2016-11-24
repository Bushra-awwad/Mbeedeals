package mbeeseals.com.mbeedeals;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.google.android.gms.common.SignInButton;

public class signUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Toolbar title_bar  = (Toolbar) findViewById(R.id.title_bar);
        setSupportActionBar(title_bar);

        TextView title = (TextView) findViewById(R.id.mytext) ;
        title.setText(R.string.Register);

        SignInButton Signup = (SignInButton) findViewById(R.id.google);
        setGooglePlusButtonText(Signup , getString(R.string.google));

            }
    protected void setGooglePlusButtonText(SignInButton signInButton, String buttonText) {
        // Find the TextView that is inside of the SignInButton and set its text
        for (int i = 0; i < signInButton.getChildCount(); i++) {
            View v = signInButton.getChildAt(i);

            if (v instanceof TextView) {
                TextView tv = (TextView) v;
                tv.setText(buttonText);
                return;
            }
        }
    }
}
