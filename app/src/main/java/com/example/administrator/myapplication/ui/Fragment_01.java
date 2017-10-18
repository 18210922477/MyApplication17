package com.example.administrator.myapplication.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Entity.Bean;
import com.example.administrator.myapplication.model.MyAdapter;
import com.example.administrator.myapplication.presenter.Presenter;

import java.util.List;

/**
 * Created by Administrator on 2017/9/15.
 */

public class Fragment_01 extends Fragment implements Iview {

    private ListView lv_title;
    private String s;
    public Fragment_01(String s) {
                 this.s=s;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment, null);

        lv_title = view.findViewById(R.id.lv_title);
        Presenter presenter = new Presenter(this);
        String url="http://v.juhe.cn/toutiao/index?type=";
        String key="&key=097060266650f67b2cebd2a06aded587";
       // http://v.juhe.cn/toutiao/index?type=1
        presenter.initData(url+s+key);

        return view;
    }

    @Override
    public void success(Bean bean) {
        List<Bean.ResultBean.DataBean> data = bean.getResult().getData();
        MyAdapter myAdapter = new MyAdapter(data,getActivity());
        lv_title.setAdapter(myAdapter);
    }

    @Override
    public void failure(Exception e) {

    }
}
