package com.example.grammarguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Lesson2 extends AppCompatActivity {

    WebView webView;
    Button btn;
    String title,s;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        Intent intent=getIntent();
        title=intent.getStringExtra("title");
        s=intent.getStringExtra("t");
        t=findViewById(R.id.title);
        webView=(WebView) findViewById(R.id.web);
        WebSettings ws=webView.getSettings();
        ws.setJavaScriptEnabled(true);

        if(title.equals("Countable")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/countable.html");
        }

        else if(title.equals("Adjectiveending")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/adj.html");
        }

        else if(title.equals("Unrealpf")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/unreal.html");
        }

        else if(title.equals("inginfinitive")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/ing.html");
        }

        else if(title.equals("Phrasal")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/phrasal.html");
        }
        else if(title.equals("Modelverb")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/model.html");
        }
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lesson2.this, Question2.class);
                intent.putExtra("tt","1");
                intent.putExtra("score","0");
                intent.putExtra("title",title);
                intent.putExtra("t",s);
                startActivity(intent);

            }
        });

    }
}
