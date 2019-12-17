package com.example.grammarguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class ArticleLessonActivity extends AppCompatActivity {

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

        if(title.equals("Article")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/like.html");

        }
        else if(title.equals("Presentsimple")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/presentS.html");
        }
        else if(title.equals("Presentperfect")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/presentPer.html");
        }
        else if(title.equals("Presentperfectcontinuous")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/presentPerC.html");
        }
        else if(title.equals("Presentcontinuous")){
            t.setText(s);

            webView.loadUrl("file:///android_asset/presentC.html");
        }

        else if(title.equals("Past")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/past.html");
        }

        else if(title.equals("Pastcontinuous")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/pastC.html");
        }

        else if(title.equals("Pastperfect")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/pastPer.html");
        }

        else if(title.equals("Pastperfectcontinuous")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/pastPerC.html");
        }
        else if(title.equals("Future")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/Future.html");
        }
        else if(title.equals("Futurecontinuous")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/FutureC.html");
        }
        else if(title.equals("Futureperfect")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/FuturePer.html");
        }
        else if(title.equals("Futureperfectcontinuous")){
            t.setText(s);
            webView.loadUrl("file:///android_asset/FuturePerC.html");
        }


        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArticleLessonActivity.this, Question.class);
                intent.putExtra("tt","1");
                intent.putExtra("score","0");
                intent.putExtra("title",title);
                intent.putExtra("t",s);
                startActivity(intent);

            }
        });

    }
}

