package com.example.mission03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView1;
    ScrollView scrollView2;
    ImageView imageView1;
    ImageView imageView2;
    BitmapDrawable bitmap;

    int index = 0;
    // up = 0, down = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView1 = findViewById(R.id.scrollView1);
        scrollView2 = findViewById(R.id.scrollView2);
        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        scrollView1.setHorizontalScrollBarEnabled(true);
        scrollView1.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView1.setImageDrawable(bitmap);
        imageView1.getLayoutParams().width = bitmapWidth;
        imageView1.getLayoutParams().height = bitmapHeight;

        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);
        int bitmap2Width = bitmap.getIntrinsicWidth();
        int bitmap2Height = bitmap.getIntrinsicHeight();

        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width = bitmap2Width;
        imageView2.getLayoutParams().height = bitmap2Height;

    }

    public void upbtn(View v){
        changeUP();
    }

    public void downbtn(View v){
        changeDONW();
    }

    private void changeUP() {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
    }

    private void changeDONW() {
        imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);
    }

}
