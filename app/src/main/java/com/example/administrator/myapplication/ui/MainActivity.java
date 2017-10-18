package com.example.administrator.myapplication.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Entity.Bean;
import com.example.administrator.myapplication.model.PageVedioAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Iview {

    private TabLayout mTab;
    private ViewPager vp_title;
    private AFargment aFargment;
    private BFargment bFargment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
       initData();

    }

    private void initData() {
        ArrayList<String> pagelist = new ArrayList<>();
        pagelist.add("新闻");
        pagelist.add("视频");
        ArrayList<Fragment> fragments = new ArrayList<>();
        aFargment = new AFargment();
        fragments.add(aFargment);
        bFargment = new BFargment();
        fragments.add(bFargment);

        FragmentManager manager = getSupportFragmentManager();

        PageVedioAdapter pageVedioAdapter = new PageVedioAdapter(manager,pagelist,fragments);
        vp_title.setAdapter(pageVedioAdapter);
        mTab.setupWithViewPager(vp_title);

    }

    private void initView() {
        mTab = (TabLayout) findViewById(R.id.mTab);
        vp_title = (ViewPager) findViewById(R.id.vp_title);
    }

    @Override
    public void success(Bean bean) {
        Toast.makeText(this, "QAQ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failure(Exception e) {

        Toast.makeText(this, "网络请求失败", Toast.LENGTH_SHORT).show();

    }


}
