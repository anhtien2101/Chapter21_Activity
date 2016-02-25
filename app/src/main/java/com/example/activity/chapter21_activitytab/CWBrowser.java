package com.example.activity.chapter21_activitytab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CWBrowser extends AppCompatActivity {
    public static final String URL = "com.example.activity.chapter21_activitytab";
    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        browser = new WebView(this);
        setContentView(browser);
        browser.loadUrl(getIntent().getStringExtra(URL));


    }
}
