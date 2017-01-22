package com.example.administrator.viewscrolldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button Scroll;
    private Button Animation;
    private Button LayoutParams;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scroll = (Button) findViewById(R.id.Scroll);
        Animation = (Button) findViewById(R.id.Animation);
        LayoutParams = (Button) findViewById(R.id.LayoutParams);

        Scroll.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, ScrollActivity.class);
                startActivity(intent);
            }
        });

        Animation.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(intent);
            }
        });

        LayoutParams.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, LayoutParamsActivity.class);
                startActivity(intent);
            }
        });
    }
}
