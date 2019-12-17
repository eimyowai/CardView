package com.example.grammarguide;

import android.app.Application;
import com.google.android.gms.ads.MobileAds;

public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this,getString(R.string.admob_app_id));

    }
}
