package mbeeseals.com.mbeedeals;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.

 */
public class requestFragment  extends Fragment {
    ViewPager viewPager;
    SampleFragmentPagerAdapter ft;
    private FragmentActivity myContext;

    public requestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      /*  TextView title = (TextView) getView().findViewById(R.id.mytext) ;
        title.setText(R.string.requests);
        viewPager = (ViewPager) getView().findViewById(R.id.viewpager);
        ft = new SampleFragmentPagerAdapter(getActivity().getSupportFragmentManager() , getContext());
        viewPager.setAdapter(ft);
        TabLayout tabLayout = (TabLayout) getView().findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);*/

        return inflater.inflate(R.layout.fragment_request, container, false);

    }


}
