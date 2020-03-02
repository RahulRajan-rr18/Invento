package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EventsEceActivity extends AppCompatActivity {
 WebView eventsEce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_ece);
        eventsEce = findViewById(R.id.ideventece);

        eventsEce.setWebViewClient(new WebViewClient());

        eventsEce.getSettings().setJavaScriptEnabled(true);
        eventsEce.loadUrl("https://www.invento2020.com/ece");
    }
}
