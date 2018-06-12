package com.example.ahmed.task1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.ahmed.task1.Adapter.PagerAdapter;

import co.ceryle.segmentedbutton.SegmentedButtonGroup;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter adapter;
    SegmentedButtonGroup sbg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbg = (SegmentedButtonGroup) findViewById(R.id.btn_segment);
        sbg.setOnClickedButtonPosition(new SegmentedButtonGroup.OnClickedButtonPosition() {
            @Override
            public void onClickedButtonPosition(int position) {
                if (position == 0)
                    viewPager.setCurrentItem(2);
                else if (position == 1)
                    viewPager.setCurrentItem(0);
            }
        });

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("قيد الانتظار"));
        tabLayout.addTab(tabLayout.newTab().setText("تم القبول"));
        tabLayout.addTab(tabLayout.newTab().setText("تم الالغاء"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}