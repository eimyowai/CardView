package com.example.grammarguide;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Lesson extends AppCompatActivity {

    WebView webView;
    Button btn;
    String title,s;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        Intent intent=getIntent();
        title=intent.getStringExtra("title");
        s=intent.getStringExtra("t");
        t=findViewById(R.id.title);
        webView=(WebView) findViewById(R.id.web);
        WebSettings ws=webView.getSettings();
        ws.setJavaScriptEnabled(true);
//        if(title.equals("Article")) {
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/like.html");
//
//        }
//        else if(title.equals("Presentsimple")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/presentS.html");
//        }
//        else if(title.equals("Presentperfect")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/presentPer.html");
//        }
//        else if(title.equals("Presentperfectcontinuous")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/presentPerC.html");
//        }
//        else if(title.equals("Presentcontinuous")){
//            t.setText(s);
//
//            webView.loadUrl("file:///android_asset/presentC.html");
//        }
//
//        else if(title.equals("Past")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/past.html");
//        }
//
//        else if(title.equals("Pastcontinuous")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/pastC.html");
//        }
//
//        else if(title.equals("Pastperfect")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/pastPer.html");
//        }
//
//        else if(title.equals("Pastperfectcontinuous")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/pastPerC.html");
//        }
//        else if(title.equals("Future")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/Future.html");
//        }
//        else if(title.equals("Futurecontinuous")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/FutureC.html");
//        }
//        else if(title.equals("Futureperfect")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/FuturePer.html");
//        }
//        else if(title.equals("Futureperfectcontinuous")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/FuturePerC.html");
//        }
//
//        else if(title.equals("Activepassive")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/active.html");
//        }
//
//        else if(title.equals("After")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/after.html");
//        }
//
//        else if(title.equals("AlthoughinspiteOf")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/although.html");
//        }
//
//        else if(title.equals("Bothand")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/both.html");
//        }
//
//        else if(title.equals("Directindirect")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/FuturePerC.html");
//        }
//
//        else if(title.equals("EitherOr")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/eior.html");
//        }
//
//        else if(title.equals("Ifunless")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/if.html");
//        }
//
//        else if(title.equals("Neithernor")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/neither.html");
//        }
//
//        else if(title.equals("Itisitwas")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/FuturePerC.html");
//        }
//
//        else if(title.equals("Nosooner")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/sooner.html");
//        }
//
//        else if(title.equals("Notonlybutalso")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/not.html");
//        }
//
//        else if(title.equals("Nouninapposition")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/FuturePerC.html");
//        }
//
//        else if(title.equals("Parallelstructure")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/parallel.html");
//        }
//
//        else if(title.equals("Relativeclause")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/relative.html");
//        }
//
//        else if(title.equals("Sothatsuchthat")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/so.html");
//        }
//
//        else if(title.equals("Whenbythetime")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/whenby.html");
//        }
//
//        else if(title.equals("Tootonotenoughtto")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/tonot.html");
//        }
//
//
//        else if(title.equals("Tootosothat")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/toso.html");
//        }
//
//        else if(title.equals("Whenving")){
//            t.setText(s);
//            webView.loadUrl("file:///android_asset/whenving.html");
//        }

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
                Intent intent = new Intent(Lesson.this, Question.class);
                intent.putExtra("tt","1");
                intent.putExtra("score","0");
                intent.putExtra("title",title);
                intent.putExtra("t",s);
                startActivity(intent);

            }
        });
    }


}
