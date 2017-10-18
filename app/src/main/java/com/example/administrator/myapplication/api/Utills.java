package com.example.administrator.myapplication.api;

import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by Administrator on 2017/9/15.
 */

public class Utills {
    private static Utills utills;
    private OkHttpClient okHttpClient;
    private Utills(){
        okHttpClient =new OkHttpClient.Builder().build();
    }
    public static synchronized Utills getInstance(){
        if(utills==null)
            utills=new Utills();
        return  utills;
    }
    public void sendGent(String url , Callback callback){
        Request build = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(build);
        call.enqueue(callback);
    }

    public void sengPost(String url, RequestBody body, Callback callback){
        Request post = new Request.Builder().url(url).method("POST", body).build();
        Call call = okHttpClient.newCall(post);
        call.enqueue(callback);

    }


}
