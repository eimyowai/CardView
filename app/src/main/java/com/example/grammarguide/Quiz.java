package com.example.grammarguide;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.grammarguide.Art;
import com.example.grammarguide.MyAdapter;
import com.example.grammarguide.R;
import com.example.grammarguide.AlertBox;
import com.example.grammarguide.RadioTest;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class Quiz extends AppCompatActivity{
    private RecyclerView recyclerView;
    private MyAdapter2 adapter;
    private List<Art> artistList;
    Art art;
    TextView timer;
    FloatingActionButton next;
    DatabaseReference dbArtists;
    public String result, ra1, ra2,correct;
    public int count = 0;
    int c;
    int score;
    String title,s;
    TextView answer,mark,recomend;
    Dialog epicDialog;
    Button retry,level;
    ImageView close;
    public Query query;
    RadioGroup gp;
    RadioButton radioButton;


    int time_play = MyAdapter2.TOTAL_TIME;
    public boolean nextClicked = false;

    protected void onDestroy() {
        if (MyAdapter2.countDownTimer != null)
            MyAdapter2.countDownTimer.cancel();
        super.onDestroy();
        // Toast.makeText(getApplicationContext(), "Game Over", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent in = getIntent();
        title=in.getStringExtra("title");
        s=in.getStringExtra("t");
        score = Integer.parseInt(in.getStringExtra("score"));
        c = Integer.parseInt(in.getStringExtra("tt"));
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_question);
        timer = findViewById(R.id.timer);
        answer=findViewById(R.id.question);
        timer.setVisibility(View.VISIBLE);
        epicDialog=new Dialog(this);


        next = (FloatingActionButton)findViewById(R.id.next);
        recyclerView = findViewById(R.id.ques);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        artistList = new ArrayList<>();

        answer.setText(new StringBuffer(String.format("%d/%d",c,10)));
        countTimer();

        adapter = new MyAdapter2(this, artistList);
        recyclerView.setAdapter(adapter);

        dbArtists = FirebaseDatabase.getInstance().getReference(title);
        query = FirebaseDatabase.getInstance().getReference(title)
                .orderByChild("Id")
                .equalTo(c + "");
        query.addListenerForSingleValueEvent(valueEventListener);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii=new Intent(getApplicationContext(),Quiz.class);
                if(result.equals(correct))
                {
                    score++;
                }
                // Toast.makeText(getApplicationContext(),score+"",Toast.LENGTH_SHORT).show();
                if(c<10){
                    ++c;

                    ii.putExtra("tt",c+"");
                    ii.putExtra("score",score+"");
                    ii.putExtra("title",title);
                    startActivity(ii);
                }
                else {

                    showResult();

                }
            }
        });

    }
    public void showResult(){

        epicDialog.setContentView(R.layout.result_page);
        mark=(TextView)epicDialog.findViewById(R.id.mark);
       recomend=(TextView)epicDialog.findViewById(R.id.recomend);
        retry=(Button)epicDialog.findViewById(R.id.retry);
        level=(Button)epicDialog.findViewById(R.id.nextLevel);
        level.setText("Learn");
        recomend.setVisibility(View.VISIBLE);
        mark.setText(new StringBuffer(String.format("%d/%d",score,10)));

        if(score>=7)
        {
            recomend.setText("You should need to learn advanced level");

        }
      else if(score>=5 && score<7){
            recomend.setText("You should need to learn intermediate level");

        }
      else{
          recomend.setText("You should need to learn basic level");

        }



        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Quiz.this,MainActivity.class);
                intent.putExtra("title",title);
                intent.putExtra("t",s);
                startActivity(intent);
            }
        });

        level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(score>=7)
                {
                    Intent intent=new Intent(Quiz.this,AdvancedActivity.class);

                    startActivity(intent);

                }
                else if(score>=5 && score<7){
                    Intent intent=new Intent(Quiz.this,IntermediateActivity.class);

                    startActivity(intent);

                }
                else{
                    Intent intent=new Intent(Quiz.this,BasicActivity.class);

                    startActivity(intent);

                }



            }
        });
        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();
    }
    private void countTimer() {

        if (MyAdapter2.countDownTimer == null) {
            MyAdapter2.countDownTimer = new CountDownTimer(MyAdapter2.TOTAL_TIME, 1000) {
                @Override
                public void onTick(long l) {
                    timer.setText(String.format("%02d:%02d",
                            TimeUnit.MILLISECONDS.toMinutes(l),
                            TimeUnit.MILLISECONDS.toSeconds(l) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l))));
                    time_play = 1000;

                }

                @Override
                public void onFinish() {

                    Intent inte=new Intent(Quiz.this,MainActivity.class);
                    startActivity(inte);
                }
            }.start();
        } else {
            MyAdapter2.countDownTimer.cancel();
            MyAdapter2.countDownTimer = new CountDownTimer(MyAdapter2.TOTAL_TIME, 60) {
                @Override
                public void onTick(long l) {
                    timer.setText(String.format("%02d:%02d",
                            TimeUnit.MILLISECONDS.toMinutes(l),
                            TimeUnit.MILLISECONDS.toSeconds(l) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l))));
                    time_play = 1000;

                }

                @Override
                public void onFinish() {

                    Intent inte=new Intent(Quiz.this,MainActivity.class);
                    startActivity(inte);

                }
            }.start();
        }


    }
    ValueEventListener valueEventListener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            artistList.clear();
            if (dataSnapshot.exists()) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Art art = snapshot.getValue(Art.class);
                    artistList.add(art);

                    ra1 = art.getRadio1();
                    ra2 = art.getRadio2();


                    correct = art.getCorrect();

                }
                adapter.notifyDataSetChanged();
            }


        }

        @Override
        public void onCancelled(DatabaseError databaseError) {

            Toast.makeText(Quiz.this, "Error", Toast.LENGTH_SHORT).show();
        }
    };

    @SuppressLint("RestrictedApi")
    public void checkButton(View view) {

        next.setVisibility(View.VISIBLE);

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.r1:
                if (checked) {
                    result = ra1;
                    break;
                }
            case R.id.r2:
                if (checked) {
                    result = ra2;
                    break;
                }




        }


    }

    public void OnBackPressed(){
        Toast.makeText(getApplicationContext(),"Exit",Toast.LENGTH_SHORT).show();
    }

    private void showAlertDialog() {
        final AlertDialog.Builder builder=new AlertDialog.Builder(getApplicationContext());
        builder.setCancelable(false);
        builder.setTitle("Exit");
        builder.setMessage("Are you sure want to leave?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                // Intent intent=new Intent(Question.this,MainActivity.class);
                //startActivity(intent);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }

}