package com.example.a1711501526_tugas_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {


    private TabLayout tablayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new fragmentExplore(),"Explore");
        adapter.AddFragment(new fragmentMakanan(),"Foods");
        adapter.AddFragment(new fragmentMinuman(),"Drinks");

        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);



    }
}
