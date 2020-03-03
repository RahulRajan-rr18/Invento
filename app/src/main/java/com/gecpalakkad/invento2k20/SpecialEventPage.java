package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SpecialEventPage extends AppCompatActivity {
    WebView specialEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_event_page);
        specialEvent = findViewById(R.id.idSpecialEvent);

        specialEvent.setWebViewClient(new WebViewClient());

        specialEvent.getSettings().setJavaScriptEnabled(true);
        specialEvent.loadUrl("https://www.invento2020.com/events/4/");

    }
}
