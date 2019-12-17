package com.example.grammarguide;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RadioTest extends AppCompatActivity {


    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Art> artistList;
    Art art;
    TextView timer;
    Button next;
    DatabaseReference dbArtists;
    public String result,ra1,ra2,ra3,ra4,correct;
    public int count=0;

    RadioGroup gp;
    RadioButton radioButton;

    int time_play=MyAdapter.TOTAL_TIME;

    @Override
    protected void onDestroy() {
        if(MyAdapter.countDownTimer !=null)
            MyAdapter.countDownTimer.cancel();
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_test);

        gp = findViewById(R.id.ans);

//getSupportActionBar().setDisplayShowHomeEnabled(true);
//getSupportActionBar().setLogo(R.drawable.ic_launcher_background);
//
//getSupportActionBar().setDisplayUseLogoEnabled(true);
//getSupportActionBar().setDisplayShowTitleEnabled(true);
//setContentView(R.layout.activity_main);
//
//        ActionBar actionBar=getActionBar();
//        actionBar.setIcon(R.drawable.ic_launcher_background);
////        recycler_menu = (RecyclerView) findViewById(R.id.ques);
//        recycler_menu.setHasFixedSize(false);
//        recycler_menu.setLayoutManager(new LinearLayoutManager(this));
//
//
//        database = FirebaseDatabase.getInstance();
//        reference = database.getReference("Article");
        timer=findViewById(R.id.timer);
        timer.setVisibility(View.VISIBLE);


        next=findViewById(R.id.next);
        recyclerView = findViewById(R.id.ques);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        artistList = new ArrayList<>();


        countTimer();



        adapter = new MyAdapter(this, artistList);
        recyclerView.setAdapter(adapter);

        dbArtists = FirebaseDatabase.getInstance().getReference("Article");
        Query query = FirebaseDatabase.getInstance().getReference("Article")
                .orderByChild("Id")
                .equalTo("1");



        query.addListenerForSingleValueEvent(valueEventListener);

        //gp.setOnCheckedChangeListener(this);


    }

    private void countTimer() {

        if(MyAdapter.countDownTimer==null)
        {
            MyAdapter.countDownTimer=new CountDownTimer(MyAdapter.TOTAL_TIME,1000) {
                @Override
                public void onTick(long l) {
                    timer.setText(String.format("%01d:%02d",
                            TimeUnit.MILLISECONDS.toMinutes(l),
                            TimeUnit.MILLISECONDS.toSeconds(l)-
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l))));
                    time_play=1000;

                }

                @Override
                public void onFinish() {


                }
            }.start();
        }
        else
        {
            MyAdapter.countDownTimer.cancel();
            MyAdapter.countDownTimer=new CountDownTimer(MyAdapter.TOTAL_TIME,60) {
                @Override
                public void onTick(long l) {
                    timer.setText(String.format("%01d:%02d",
                            TimeUnit.MILLISECONDS.toMinutes(l),
                            TimeUnit.MILLISECONDS.toSeconds(l)-
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l))));
                    time_play=1000;

                }

                @Override
                public void onFinish() {


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

                    ra1=art.getRadio1();
                    ra2=art.getRadio2();
                    ra3=art.getRadio3();
                    ra4=art.getRadio4();

                    correct=art.getCorrect();

                }
                adapter.notifyDataSetChanged();
            }


        }

        @Override
        public void onCancelled(DatabaseError databaseError) {

            Toast.makeText(RadioTest.this, "Error", Toast.LENGTH_SHORT).show();
        }
    };


//    public String  d;
//    protected void populateViewHolder(MyAdapter myAdapter, Art art, int i) {
//
//                   d=art.getId();
//                  if(d.equals("1")) {
//                      myAdapter.q.setText(art.getQuestion());
//                       myAdapter.r1.setText(art.getRadio1());
//                       myAdapter.r2.setText(art.getRadio2());
//                       myAdapter.r3.setText(art.getRadio3());
//                       myAdapter.r4.setText(art.getRadio4());
//                   //}
//
//
//


    // }


    public void checkButton(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.r1:
                if (checked) {
                    result =ra1;
                    break;
                }
            case R.id.r2:
                if(checked) {
                    result = ra2;
                    break;
                }

            case R.id.r3:
                if(checked) {
                    result = ra3;
                    break;
                }
            case R.id.r4:
                if(checked) {
                    result = ra4;
                    break;
                }




        }


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.equals(correct))
                {
                    count++;
                }


                Toast.makeText(RadioTest.this, String.valueOf(count),Toast.LENGTH_SHORT).show();
            }
        });
    }



}
