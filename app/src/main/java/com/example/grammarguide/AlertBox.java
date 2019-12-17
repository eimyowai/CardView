package com.example.grammarguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AlertBox extends AppCompatActivity {
 ImageView img;
private int currentImage;
public  int[] images={R.drawable.ex,R.drawable.fan,R.drawable.sad};
int score;
Button again,nt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent in = getIntent();
        score = Integer.parseInt(in.getStringExtra("score"));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_box);
        img = (ImageView) findViewById(R.id.image);
again=(Button)findViewById(R.id.again);
nt=(Button)findViewById(R.id.nt);


        if (score > 7) {

            img.setImageResource(images[1]);
        } else if (score > 5 || score < 7) {


            img.setImageResource(images[0]);
        } else {

            // img=(ImageView)findViewById(R.id.image);
            img.setImageResource(images[2]);
        }

        nt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(AlertBox.this,BasicActivity.class);
                startActivity(n);
            }
        });

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(AlertBox.this,ArticleLessonActivity.class);

                startActivity(in);
            }
        });
    }
}
