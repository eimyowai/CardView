package com.example.grammarguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BasicActivity extends AppCompatActivity {
    CardView article, presentS, pCon, presentPerfect, presentPerfectCon, pastSimple, pastCon, pastPerfect, pastPerfectCon, futureTense, futureCon, futurePerfect, futurePerfectCon;
    public int i = 1;
    TextView t;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);


        article = (CardView) findViewById(R.id.article);
        presentS = (CardView) findViewById(R.id.presentS);
        pCon = (CardView) findViewById(R.id.pCon);
        presentPerfect = (CardView) findViewById(R.id.presentPerfect);
        presentPerfectCon = (CardView) findViewById(R.id.presentPerfectCon);
        pastSimple = (CardView) findViewById(R.id.pastSimple);
        pastCon = (CardView) findViewById(R.id.pastCon);
        pastPerfect = (CardView) findViewById(R.id.pastPerfect);
        pastPerfectCon = (CardView) findViewById(R.id.pastPerfectCon);
        futureTense = (CardView) findViewById(R.id.futureTense);
        futureCon = (CardView) findViewById(R.id.futureCon);
        futurePerfect = (CardView) findViewById(R.id.futurePerfect);
        futurePerfectCon = (CardView) findViewById(R.id.futurePerfectCon);


        article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.a);
                s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Article");
                intent.putExtra("t",s);
                startActivity(intent);

            }
        });

        presentS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ps);
               s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Presentsimple");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });


        pCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.pc);
              s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Presentcontinuous");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        presentPerfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.pp);
                 s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Presentperfect");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        presentPerfectCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ppc);
                s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Presentperfectcontinuous");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        pastSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.pt);
                s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Past");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        pastCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ptc);
                s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Pastcontinuous");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        pastPerfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ptp);
                 s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Pastperfect");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        pastPerfectCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ptpc);
                s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Pastperfectcontinuous");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        futureTense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.f);
                 s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Future");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        futureCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.fc);
                s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Futurecontinuous");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        futurePerfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.fp);
                s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Futureperfect");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        futurePerfectCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.fpc);
                 s=t.getText().toString();
                Intent intent = new Intent(BasicActivity.this, ArticleLessonActivity.class);
                intent.putExtra("title","Futureperfectcontinuous");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

    }
    }

