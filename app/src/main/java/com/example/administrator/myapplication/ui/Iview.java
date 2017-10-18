package com.example.administrator.myapplication.ui;


import com.example.administrator.myapplication.Entity.Bean;

/**
 * Created by Administrator on 2017/9/15.
 */

public interface Iview {
    void success(Bean bean);
    void failure(Exception e);

}
