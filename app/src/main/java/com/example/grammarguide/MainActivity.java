package com.example.grammarguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    CardView basic,intermediate,advanced,quiz;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        basic=(CardView)findViewById(R.id.basic);
        intermediate=(CardView)findViewById(R.id.intermediate);
        advanced=(CardView)findViewById(R.id.advanced);
        quiz=(CardView)findViewById(R.id.quiz);

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,BasicActivity.class);
                startActivity(intent);

            }
        });

        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,IntermediateActivity.class);

                startActivity(intent);

            }
        });

        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,AdvancedActivity.class);
                startActivity(intent);

            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,Quiz.class);
                intent.putExtra("tt","1");
                intent.putExtra("score","0");
                intent.putExtra("title","Quiz");
                startActivity(intent);

            }
        });
    }
}
