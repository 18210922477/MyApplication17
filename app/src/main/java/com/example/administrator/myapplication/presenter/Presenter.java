package com.example.administrator.myapplication.presenter;


import com.example.administrator.myapplication.Entity.Bean;
import com.example.administrator.myapplication.model.Calls;
import com.example.administrator.myapplication.model.Model;
import com.example.administrator.myapplication.ui.Iview;

/**
 * Created by Administrator on 2017/9/15.
 */

public class Presenter {
    private Model model;
    private Iview iview;

    public Presenter(Iview iview){
        this.iview=iview;
         model = new Model();
    }

    public void initData(String url){
        model.getData(url, new Calls() {
            @Override
            public void success(Bean bean) {
                     iview.success(bean);
            }

            @Override
            public void failure(Exception e) {
                        iview.failure(e);
            }
        });
    }

}
