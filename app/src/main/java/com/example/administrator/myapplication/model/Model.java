package com.example.administrator.myapplication.model;

import android.os.Handler;


import com.example.administrator.myapplication.Entity.Bean;
import com.example.administrator.myapplication.api.Utills;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/9/15.
 */

public class Model implements Imodel {
    private String string;
    private Handler handler=new Handler();

    @Override
    public void getData(String url, final Calls calls) {
        Utills.getInstance().sendGent(url, new Callback() {



            @Override
            public void onFailure(Call call, IOException e) {
                calls.failure(e);

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                string = response.body().string();

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Gson gson = new Gson();
                                Bean bean = gson.fromJson(string, Bean.class);
                                calls.success(bean);
                            }
                        },500) ;
            }
        });
    }
}
