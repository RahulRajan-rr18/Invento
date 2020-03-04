package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NatyaEvent extends AppCompatActivity {
WebView natya_event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natya_event);
        natya_event = findViewById(R.id.id_natya);

        natya_event.setWebViewClient(new WebViewClient());

        natya_event.getSettings().setJavaScriptEnabled(true);
        natya_event.loadUrl("https://www.invento2020.com/events/118/");

    }
}
