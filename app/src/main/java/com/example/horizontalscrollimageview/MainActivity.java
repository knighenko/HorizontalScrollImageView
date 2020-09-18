package com.example.horizontalscrollimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.a);
        LinearLayout linearLayout1 = (LinearLayout) findViewById(R.id.b);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.c);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.d);

        for (int i = 0; i < 10; i++) {

            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.mipmap.ic_launcher);
            linearLayout.addView(imageView);

            ImageView imageView1 = new ImageView(this);
            imageView1.setImageResource(R.mipmap.ic_launcher);
            linearLayout1.addView(imageView1);

            ImageView imageView2 = new ImageView(this);
            imageView2.setImageResource(R.mipmap.ic_launcher);
            linearLayout2.addView(imageView2);

            ImageView imageView3 = new ImageView(this);
            imageView3.setImageResource(R.mipmap.ic_launcher);
            linearLayout3.addView(imageView3);
        }
    }
}