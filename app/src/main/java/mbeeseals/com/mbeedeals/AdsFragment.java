package mbeeseals.com.mbeedeals;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AdsFragment extends Fragment {

    public AdsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ads, container, false);

        TextView title = (TextView) getActivity().findViewById(R.id.mytext) ;
        title.setText(R.string.ads);

        return view;
    }


}
