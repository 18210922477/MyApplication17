package com.example.administrator.myapplication.api;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;


/**
 * Created by Administrator on 2017/10/17.
 */

public class VolleyUtils {
    private static VolleyUtils utils;
    private RequestQueue queue;
    private VolleyUtils(Context context){
        queue = Volley.newRequestQueue(context);

    }

    public static VolleyUtils getInstance(Context context){
        if(utils==null){
             synchronized (VolleyUtils.class){
                 if(utils==null)
                     utils=new VolleyUtils(context);
             }
        }
        return  utils;
    }

    public void sendGet(String url, Response.Listener<String> listener, Response.ErrorListener errorListener){
        StringRequest request = new StringRequest(url, listener, errorListener);
        queue.add(request);
    }
    public void sendPost(String url, Response.Listener<String> listener, Response.ErrorListener errorListener){
        StringRequest request = new StringRequest(Request.Method.POST, url, listener, errorListener) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return super.getParams();
            }
        };
        queue.add(request);
    }

}
