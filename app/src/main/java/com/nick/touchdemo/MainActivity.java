package com.nick.touchdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final ViewPager pager = (ViewPager) findViewById(R.id.main_pager);

        ArrayList<String> list = new ArrayList<>();

        list.add("光明顶");
        list.add("藏书阁");
        list.add("昆仑山");
        list.add("哈哈哈");


        MyaAdapter adapter = new MyaAdapter(this, list);
        pager.setAdapter(adapter);*/

        /*pager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ViewGroup parent = (ViewGroup) v.getParent();
                float x = event.getX();
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if (x < parent.getWidth() / 5) {
                        //是否允许打断  用于个数比较少的时候使用
                        parent.requestDisallowInterceptTouchEvent(false);
                    } else {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }

                }
                return false;
            }
        });*/

    }
}
