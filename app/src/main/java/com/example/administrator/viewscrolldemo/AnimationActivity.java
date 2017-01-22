package com.example.administrator.viewscrolldemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by ChuPeng on 2017/1/18.
 * 通过动画对View进行移动
 */

public class AnimationActivity extends Activity
{
    private ImageView imageView;
    private WindowManager manager;
    private int screenWidth;
    private int screenHeight;
    private int imageViewWidth;
    private int imageViewHeight;
    private int translationX;
    private int translationY;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        imageView = (ImageView) findViewById(R.id.imageView);
        manager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        screenWidth = manager.getDefaultDisplay().getWidth();
        screenHeight = manager.getDefaultDisplay().getHeight();


        imageView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                imageViewWidth = v.getWidth();
                imageViewHeight = v.getHeight();
                translationX = screenWidth - imageViewWidth;
                translationY = screenHeight - imageViewHeight;
                AnimatorSet animatorTransactionSet = new AnimatorSet();
                //对集合中定义的动画依次播放
                animatorTransactionSet.playSequentially(
                        ObjectAnimator.ofFloat(imageView, "translationX", 0, translationX),
                        ObjectAnimator.ofFloat(imageView, "translationY", 0, translationY),
                        ObjectAnimator.ofFloat(imageView, "translationX", translationX, 0),
                        ObjectAnimator.ofFloat(imageView, "translationY", translationY, 0)
                );
                animatorTransactionSet.setDuration(2000).start();

                AnimatorSet animatorRotateSet = new AnimatorSet();
                animatorRotateSet.playTogether(
                        ObjectAnimator.ofFloat(imageView, "rotationX", 0, 360),
                        ObjectAnimator.ofFloat(imageView, "rotationY", 0, 360)
                );
                animatorRotateSet.setDuration(2000*4).start();
            }
        });
    }
}
