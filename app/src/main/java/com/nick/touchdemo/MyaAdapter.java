package com.nick.touchdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/4/15.
 * User: Nick
 * Date: 2016/4/15
 * Email: 305812387@qq.com
 * Project: TouchDemo
 */
public class MyaAdapter extends PagerAdapter {

    private Context mContext;
    private List<String> mList;

    public MyaAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList!=null?mList.size():0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        TextView textView = new TextView(mContext);

        textView.setText(mList.get(position));

        container.addView(textView);


        return textView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
