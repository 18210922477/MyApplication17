package com.example.administrator.myapplication.model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/10/17.
 */

public class PageVedioAdapter extends FragmentPagerAdapter {
    private ArrayList<String> pagelist;
    private ArrayList<Fragment> fragments;

    public PageVedioAdapter(FragmentManager fm, ArrayList<String> pagelist, ArrayList<Fragment> fragments) {
        super(fm);
        this.pagelist=pagelist;
        this.fragments=fragments;
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
        return pagelist.get(position);
    }
}
