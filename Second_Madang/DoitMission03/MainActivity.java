package com.example.frame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ScrollView scrollView1;
    ImageView imageView;
    ImageView imageView1;
    BitmapDrawable bitmap;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        scrollView1 = findViewById(R.id.scrollView1);
        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView1);

        Resources res  = getResources();
        bitmap = (BitmapDrawable)res.getDrawable(R.drawable.image01);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;

        imageView1.setImageDrawable(bitmap);
        imageView1.getLayoutParams().width = bitmapWidth;
        imageView1.getLayoutParams().height = bitmapHeight;
    }

    public void upClick(View v){
        imageView.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.INVISIBLE);
    }

    public void downClick(View v){
        imageView.setVisibility(View.INVISIBLE);
        imageView1.setVisibility(View.VISIBLE);

    }

}
