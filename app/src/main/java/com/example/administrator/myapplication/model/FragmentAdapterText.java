package com.example.administrator.myapplication.model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/9/15.
 */

public class FragmentAdapterText extends FragmentPagerAdapter {
    private  ArrayList<Fragment> fragments;
    private  ArrayList<String> strings;

    public FragmentAdapterText(ArrayList<Fragment> fragments, FragmentManager fm, ArrayList<String> strings) {
        super(fm);
        this.fragments=fragments;
        this.strings=strings;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }
}
