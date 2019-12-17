package com.example.grammarguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Lesson3 extends AppCompatActivity {

    WebView webView;
    Button btn;
    String title, s;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        s = intent.getStringExtra("t");
        t = findViewById(R.id.title);
        webView = (WebView) findViewById(R.id.web);
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);

        if (title.equals("Activepassive")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/active.html");
        } else if (title.equals("After")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/after.html");
        } else if (title.equals("AlthoughinspiteOf")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/although.html");
        } else if (title.equals("Bothand")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/both.html");
        } else if (title.equals("Directindirect")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/direct.html");
        } else if (title.equals("EitherOr")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/eior.html");
        } else if (title.equals("Ifunless")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/if.html");
        } else if (title.equals("Neithernor")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/neither.html");
        } else if (title.equals("Itisitwas")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/it.html");
        } else if (title.equals("Nosooner")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/sooner.html");
        } else if (title.equals("Notonlybutalso")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/not.html");
        } else if (title.equals("Nouninapposition")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/now.html");
        } else if (title.equals("Parallelstructure")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/parallel.html");
        } else if (title.equals("Relativeclause")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/relative.html");
        } else if (title.equals("Sothatsuchthat")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/so.html");
        } else if (title.equals("Whenbythetime")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/whenby.html");
        } else if (title.equals("Tootonotenoughtto")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/tonot.html");
        } else if (title.equals("Tootosothat")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/toso.html");
        } else if (title.equals("Whenving")) {
            t.setText(s);
            webView.loadUrl("file:///android_asset/whenving.html");
        }


        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lesson3.this, Question3.class);
                intent.putExtra("tt", "1");
                intent.putExtra("score", "0");
                intent.putExtra("title", title);
                intent.putExtra("t", s);
                startActivity(intent);

            }
        });

    }
}

