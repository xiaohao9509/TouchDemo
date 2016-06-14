package com.nick.touchdemo;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2016/4/15.
 * User: Nick
 * Date: 2016/4/15
 * Email: 305812387@qq.com
 * Project: TouchDemo
 */
public class Layout_1 extends FrameLayout {

    private static final String TAG = Layout_1.class.getSimpleName();

    public Layout_1(Context context) {
        super(context);
    }

    public Layout_1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Layout_1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //分发

    /**
     * 触摸事件的分发(属于View),定义在View中
     *
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "dispatchTouchEvent: ");
        boolean b = super.dispatchTouchEvent(ev);
        Log.d(TAG, "dispatchTouchEvent: " + b);
        return b;
    }
    //打断

    /**
     * 触摸事件的打断(属于ViewGroup),定义在ViewGroup中
     *打断本次触摸事件的传递
     * 当打断子控件的触摸事件时,子控件会受到一个action_cancel事件
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG, "onInterceptTouchEvent: ");
        View child = getChildAt(0);
        Rect rect = new Rect(child.getLeft(), child.getTop(), child.getRight(), getBottom());
        if (!rect.contains((int) ev.getX(), (int) ev.getX())) {
            return true;
        }

        return super.onInterceptTouchEvent(ev);
    }

    //处理

    /**
     * 触摸事件的处理(属于View)
     *
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: ");
        return super.onTouchEvent(event);
    }
}
