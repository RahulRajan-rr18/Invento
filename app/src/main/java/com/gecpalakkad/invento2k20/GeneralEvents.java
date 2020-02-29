package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GeneralEvents extends AppCompatActivity {

    WebView id_webview_general;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_events);

        id_webview_general = findViewById(R.id.g_event_view);
        id_webview_general.setWebViewClient(new WebViewClient());

        id_webview_general.getSettings().setJavaScriptEnabled(true);
        id_webview_general.loadUrl("https://www.invento2020.com/cse");

    }
}
