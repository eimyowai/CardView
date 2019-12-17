package com.example.grammarguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class IntermediateActivity extends AppCompatActivity {

TextView t;
    String s;
    CardView active,after,although,bothAnd,directindirect,eitherOr,ifUnless,ItIsItWas,neitherNor,NoSooner,NotOnly,NoInAppo,ParallelStructure,RelativeClause,sothatSuchthat,whenBy,tootoNot,tooToso,whenVing,phrasal;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);

        getSupportActionBar().setTitle("Intermediate");
        active=(CardView)findViewById(R.id.active);
        after=(CardView)findViewById(R.id.after);
        although=(CardView)findViewById(R.id.although);
        bothAnd=(CardView)findViewById(R.id.bothAnd);
        directindirect=(CardView)findViewById(R.id.directindirect);
        eitherOr=(CardView)findViewById(R.id.eitherOr);
        ifUnless=(CardView)findViewById(R.id.ifUnless);
        ItIsItWas=(CardView)findViewById(R.id.ItIsItWas);
        neitherNor=(CardView)findViewById(R.id.neitherNor);
        NoSooner=(CardView)findViewById(R.id.NoSooner);
        NotOnly=(CardView)findViewById(R.id.NotOnly);
        NoInAppo=(CardView)findViewById(R.id.NoInAppo);
        ParallelStructure=(CardView)findViewById(R.id.ParallelStructure);
        RelativeClause=(CardView)findViewById(R.id.RelativeClause);
        sothatSuchthat=(CardView)findViewById(R.id.sothatSuchthat);
        whenBy=(CardView)findViewById(R.id.whenBy);
        tootoNot=(CardView)findViewById(R.id.tootoNot);
        tooToso=(CardView)findViewById(R.id.tooToso);
        whenVing=(CardView)findViewById(R.id.whenVing);
       // whenVing=(CardView)findViewById(R.id.phrasal);

        active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ap);
                s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Activepassive");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });


        after.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.af);
               s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","After");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        although.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.al);
                 s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","AlthoughinspiteOf");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        bothAnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.bn);
               s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Bothand");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        directindirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.di);
               s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Directindirect");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        eitherOr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.eo);
                 s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","EitherOr");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        ifUnless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.iu);
                s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Ifunless");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });



        neitherNor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.nn);
                s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Neithernor");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        NoSooner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.nt);
              s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Nosooner");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });
        NotOnly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.nb);
               s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Notonlybutalso");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        NoInAppo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.nia);
               s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Nouninapposition");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

     RelativeClause.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        t=findViewById(R.id.rc);
         s=t.getText().toString();
        Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
        intent.putExtra("title","Relativeclause");
        intent.putExtra("t",s);
        startActivity(intent);
    }
    });

        ParallelStructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ps);
              s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Parallelstructure");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });
        ItIsItWas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.it);
                 s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Itisitwas");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });



        sothatSuchthat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.ss);
                s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Sothatsuchthat");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        whenBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.wb);
               s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Whenbythetime");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        tootoNot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.tnt);
                s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Tootonotenoughtto");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        tooToso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.tst);
              s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Tootosothat");
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        whenVing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.wv);
                s=t.getText().toString();
                Intent intent = new Intent(IntermediateActivity.this, Lesson3.class);
                intent.putExtra("title","Whenving");
                intent.putExtra("t",s);
                startActivity(intent);
            }});
    }
}
