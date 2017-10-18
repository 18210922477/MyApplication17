package com.example.administrator.myapplication.model;


import com.example.administrator.myapplication.Entity.Bean;

/**                                              kl
 * Created by Administrator on 2017/9/15.
 */

public interface Calls {
    void success(Bean bean);
    void failure(Exception e);
}
