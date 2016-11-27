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

    public requestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_request, container, false);

        TextView title = (TextView) getActivity().findViewById(R.id.mytext) ;
        title.setText(R.string.requests);

        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        ft = new SampleFragmentPagerAdapter(getChildFragmentManager() ,  view.getContext());
        viewPager.setAdapter(ft);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        return view;

    }


}
