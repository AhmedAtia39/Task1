package com.example.ahmed.task1.Fragment;

/**
 * Created by AHMED on 10/06/2018.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ahmed.task1.Adapter.ListviewAdapter;
import com.example.ahmed.task1.ListItem;
import com.example.ahmed.task1.R;

import java.util.ArrayList;

public class TabFragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_3, container, false);
        ArrayList<ListItem> items = GetlistItems();
        ListView lv = rootView.findViewById(R.id.listView3);
        lv.setAdapter(new ListviewAdapter(getActivity(), items, 1));

        return rootView;
    }

    private ArrayList<ListItem> GetlistItems() {
        ArrayList<ListItem> contactlist = new ArrayList<ListItem>();

        ListItem item = new ListItem("ابي اروح الهايبر وما عندي سياره ممكن حد يوديني", "منذ ساعه", "رجال"
                , "فزعه سياره", "2 فزعوا", R.drawable.type_car, R.drawable.my_list_help_accepted_time
                , R.drawable.my_list_help_accepted_info_attendance, R.drawable.my_list_help_accepted_info_help_type
                , R.drawable.my_list_help_accepted_accept);
        contactlist.add(item);

        item = new ListItem("بنات ضروري عندي عزومه وابي حد يساعدني", "منذ ساعه", "سيدات"
                , "فزعه اكل", "3 فزعوا", R.drawable.type_food, R.drawable.my_list_help_accepted_time
                , R.drawable.my_list_help_accepted_info_attendance, R.drawable.my_list_help_accepted_info_help_type
                , R.drawable.my_list_help_accepted_accept);
        contactlist.add(item);

        return contactlist;
    }
}