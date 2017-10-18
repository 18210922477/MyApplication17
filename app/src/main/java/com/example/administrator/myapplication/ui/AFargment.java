package com.example.administrator.myapplication.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.model.FragmentAdapterText;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/10/17.
 */

public class AFargment extends Fragment {

    private TabLayout mTab;
    private ViewPager vp_title;
    private Fragment_01 fragment_01;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.titlepagefargment, null);
        initView(view);
        initData();




        return view;
    }

    private void initData() {
        FragmentManager manager = getChildFragmentManager();



        ArrayList<String> strings = new ArrayList<>();
        strings.add("头条");
        strings.add("社会");
        strings.add("国内");
        strings.add("国际");
        strings.add("娱乐");
        strings.add("体育");
        strings.add("军事");
        strings.add("科技");
        strings.add("财经");
        strings.add("时尚");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("top");
        list1.add("shehui");
        list1.add("gui nei");
        list1.add("guoji");
        list1.add("yule");
        list1.add("tiyu");
        list1.add("junshi");
        list1.add("keji");
        list1.add("caijing");
        list1.add("shishang");
        ArrayList<Fragment> fragments = new ArrayList<>();


        for (int i = 0; i <list1.size() ; i++) {
            fragment_01 = new Fragment_01(list1.get(i));
            fragments.add(fragment_01);
        }

        FragmentAdapterText text = new FragmentAdapterText(fragments,manager,strings);
        vp_title.setAdapter(text);
        mTab.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTab.setupWithViewPager(vp_title);
    }

    private void initView(View view) {

        mTab = (TabLayout) view.findViewById(R.id.mTab);
        vp_title = (ViewPager) view.findViewById(R.id.vp_title);


    }


}
