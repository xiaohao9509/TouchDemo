package com.nick.touchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2016/4/15.
 * User: Nick
 * Date: 2016/4/15
 * Email: 305812387@qq.com
 * Project: TouchDemo
 */
public class Layout_2 extends FrameLayout {

    private static final String TAG = Layout_2.class.getSimpleName();

    public Layout_2(Context context) {
        super(context);
    }

    public Layout_2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Layout_2(Context context, AttributeSet attrs, int defStyleAttr) {
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
     * 打断的是本次触摸事件的传递
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG, "onInterceptTouchEvent: ");
        return super.onInterceptTouchEvent(ev);
    }

    //处理

    /**
     * 触摸事件的处理(属于View)
     *
     * @param event
     * @return 是否处理, 只在action_down时有效,如果返回值为true,那么就要处理一个完整的触摸事件
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: ");
        /*if (event.getAction() != MotionEvent.ACTION_DOWN) {
            return false;

        }*/
        //返回ture时,即使上面返回false,也不会影响处理
        return true;
    }
}
