package com.example.qiangwang.adrlessoniii.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qiangwang.adrlessoniii.R;

/**
 * Created by qiangwang on 2015/3/1.
 */
public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String[] objects) {
        //TextView的id有时候可以不用指定
        super(context, R.layout.list_view_2, R.id.list_view_item_2, objects);
    }

    @Override
    //这个方法可以不重写
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.list_view_2, parent, false);
        String itemShow = getItem(position);

        TextView textView = (TextView)view.findViewById(R.id.list_view_item_2);
        //这个设置将优先于构造方法的设置
        //并且这个设置只是影响界面的展现，不影响select到的具体值
        textView.setText(itemShow);

        ImageView imageView = (ImageView)view.findViewById(R.id.list_view_image_2);
        imageView.setImageResource(R.drawable.list_dot);

        return view;
    }
}
