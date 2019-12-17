package com.example.grammarguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AdvancedActivity extends AppCompatActivity {
    CardView count,adj,ing,unreal,phrasal,model;
    TextView t;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

//


        count=(CardView)findViewById(R.id.count);
        adj=(CardView)findViewById(R.id.adj);
        unreal=(CardView)findViewById(R.id.unreal);
        ing=(CardView)findViewById(R.id.ing);
        phrasal=(CardView)findViewById(R.id.phrasal);
        model=(CardView)findViewById(R.id.model);


        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t=findViewById(R.id.cu);
                s=t.getText().toString();
                Intent intent = new Intent(AdvancedActivity.this, Lesson2.class);
                intent.putExtra("title","Countable");
                intent.putExtra("t",s);
                startActivity(intent);



            }
        });

        adj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ae);
                s=t.getText().toString();
                Intent intent = new Intent(AdvancedActivity.this, Lesson2.class);
                intent.putExtra("title","Adjectiveending");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });


        unreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.up);
               s=t.getText().toString();
                Intent intent = new Intent(AdvancedActivity.this, Lesson2.class);
                intent.putExtra("title","Unrealpf");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        ing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ifn);
             s=t.getText().toString();
                Intent intent = new Intent(AdvancedActivity.this, Lesson2.class);
                intent.putExtra("title","inginfinitive");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        phrasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.pv);
                 s=t.getText().toString();
                Intent intent = new Intent(AdvancedActivity.this, Lesson2.class);
                intent.putExtra("title","Phrasal");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.mv);
                s=t.getText().toString();
                Intent intent = new Intent(AdvancedActivity.this, Lesson2.class);
                intent.putExtra("title","Modelverb");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });



    }
}

