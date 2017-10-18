package com.example.administrator.myapplication.model;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Entity.Bean;


import java.util.List;

/**
 * Created by Administrator on 2017/9/15.
 */

public class MyAdapter extends BaseAdapter {
    private List<Bean.ResultBean.DataBean> data;
    private Context activity;

    public MyAdapter(List<Bean.ResultBean.DataBean> data, FragmentActivity activity) {
        this.data = data;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(activity).inflate(R.layout.item, null);
            holder.iv_title = convertView.findViewById(R.id.iv_title);
            holder.tv_title = convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);


        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_title.setText(data.get(position).getTitle());
        Glide.with(activity).load(data.get(position).getThumbnail_pic_s02()).into(holder.iv_title);


        return convertView;
    }

    class ViewHolder {
        TextView tv_title;
        ImageView iv_title;

    }
}
