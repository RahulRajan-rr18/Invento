package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EventsCseActivity extends AppCompatActivity {
    WebView cseEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_cse);

        cseEvents = findViewById(R.id.cse_event_page);
        cseEvents.setWebViewClient(new WebViewClient());

        cseEvents.getSettings().setJavaScriptEnabled(true);
        cseEvents.loadUrl("https://www.invento2020.com/cse");
    }
}
