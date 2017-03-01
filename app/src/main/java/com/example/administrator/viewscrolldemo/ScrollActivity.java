package com.example.administrator.viewscrolldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ChuPeng on 2017/1/18.
 * 通过ScrollTo/ScrollBy对View进行移动
 * 这个方法只能移动View的内容，不能将View整体移动
 */

public class ScrollActivity extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        final Button ScrollToBtn = (Button) findViewById(R.id.ScrollTo);
        final Button ScrollByBtn = (Button) findViewById(R.id.ScrollBy);

        ScrollToBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ScrollToBtn.scrollTo(100, 100);
            }
        });

        ScrollByBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ScrollByBtn.scrollBy(100, 100);
            }
        });
    }
}
