package com.example.administrator.viewscrolldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

/**
 * Created by ChuPeng on 2017/1/18.
 * 通过ScrollTo/ScrollBy对View进行移动
 * 这个方法只能移动View的内容，不能将View整体移动
 */

public class ScrollActivity extends Activity
{

    private Button ScrollTo;
    private Button ScrollBy;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        ScrollTo = (Button) findViewById(R.id.ScrollTo);
        ScrollBy = (Button) findViewById(R.id.ScrollBy);

        ScrollTo.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //TranslateAnimation translateAnimation = new TranslateAnimation(ScrollActivity.this);
            }
        });

        ScrollBy.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

            }
        });
    }
}
