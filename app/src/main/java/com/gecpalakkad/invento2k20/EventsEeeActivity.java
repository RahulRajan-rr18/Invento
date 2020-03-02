package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EventsEeeActivity extends AppCompatActivity {
 WebView eventsEEE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_eee);
        eventsEEE = findViewById(R.id.id_eventseee);

        eventsEEE.setWebViewClient(new WebViewClient());

        eventsEEE.getSettings().setJavaScriptEnabled(true);
        eventsEEE.loadUrl("https://www.invento2020.com/eee");


    }
}
