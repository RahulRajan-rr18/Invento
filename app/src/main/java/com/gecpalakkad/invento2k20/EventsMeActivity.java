package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EventsMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_me);
        WebView eventsMe = findViewById(R.id.ideventsme);

        eventsMe.setWebViewClient(new WebViewClient());

        eventsMe.getSettings().setJavaScriptEnabled(true);
        eventsMe.loadUrl("https://www.invento2020.com/me");

    }
}
