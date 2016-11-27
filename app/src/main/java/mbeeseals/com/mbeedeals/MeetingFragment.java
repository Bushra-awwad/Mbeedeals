package mbeeseals.com.mbeedeals;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MeetingFragment extends Fragment {
    ViewPager viewPager;
    SampleFragmentPagerAdapter ft;

    public MeetingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_meeting, container, false);

        TextView title = (TextView) getActivity().findViewById(R.id.mytext) ;
        title.setText(R.string.meeting);

        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        ft = new SampleFragmentPagerAdapter(getChildFragmentManager(), view.getContext());
        viewPager.setAdapter(ft);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

}
