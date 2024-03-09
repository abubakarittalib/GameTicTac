package com.example.gametictac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Intent act = getIntent();
       String name = act.getStringExtra("name");
        String title = act.getStringExtra("title");
       int rollno =  act.getIntExtra("Roll_No", 0);
        TextView show;
         show = findViewById(R.id.showdata);
         show.setText("Name is  "+name+"Roll_No is :"+rollno);

    }
}