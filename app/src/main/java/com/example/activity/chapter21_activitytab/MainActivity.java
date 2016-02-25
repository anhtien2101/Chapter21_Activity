package com.example.activity.chapter21_activitytab;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
    TabHost.TabSpec spec = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TabHost tabHost = getTabHost();
        Intent i = new Intent(this, CWBrowser.class);
        i.putExtra(CWBrowser.URL, "http://www.android.com");
//        spec = tabHost.newTabSpec("tab1").setIndicator("CW").setContent(i);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Android").setContent(i));

        i = new Intent(i);
//        spec = tabHost.newTabSpec("tab2").setIndicator("Android").setContent(i);
        i.putExtra(CWBrowser.URL, "http://www.hcmus.edu.vn");
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("hcmus").setContent(i));

    }
}
