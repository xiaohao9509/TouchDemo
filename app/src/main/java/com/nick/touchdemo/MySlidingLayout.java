package com.nick.touchdemo;

import android.content.Context;
import android.support.v4.widget.SlidingPaneLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Administrator on 2016/4/15.
 * User: Nick
 * Date: 2016/4/15
 * Email: 305812387@qq.com
 * Project: TouchDemo
 */
public class MySlidingLayout extends SlidingPaneLayout {
    private boolean mflag;

    public MySlidingLayout(Context context) {
        super(context);
    }

    public MySlidingLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public MySlidingLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            //如果打开就直接打断
            System.out.println("呵呵");
            mflag = isOpen() || ev.getX() < getWidth() / 5;
        }
        return mflag && super.onInterceptTouchEvent(ev);
    }
}
