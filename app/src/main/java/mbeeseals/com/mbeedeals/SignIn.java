package mbeeseals.com.mbeedeals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.common.SignInButton;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Toolbar title_bar  = (Toolbar) findViewById(R.id.title_bar);
        setSupportActionBar(title_bar);

        TextView title = (TextView) findViewById(R.id.mytext) ;
        title.setText(R.string.Sign_in);

        SignInButton Signup = (SignInButton) findViewById(R.id.google);
        setGooglePlusButtonText(Signup , getString(R.string.google_sign_in));
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
    }}