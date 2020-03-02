package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EventsItActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_it);
        WebView eventsIt = findViewById(R.id.ideventsit);
        eventsIt.setWebViewClient(new WebViewClient());

        eventsIt.getSettings().setJavaScriptEnabled(true);
        eventsIt.loadUrl("https://www.invento2020.com/it");
    }
}
