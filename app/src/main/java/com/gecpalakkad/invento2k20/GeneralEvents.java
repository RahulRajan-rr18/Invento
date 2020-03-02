package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GeneralEvents extends AppCompatActivity {

    WebView cseEvents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_events);
        cseEvents = findViewById(R.id.ideventGeneral);

        cseEvents.setWebViewClient(new WebViewClient());

        cseEvents.getSettings().setJavaScriptEnabled(true);
        cseEvents.loadUrl("https://www.invento2020.com/general");

    }
}
