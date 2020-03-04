package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mudrace extends AppCompatActivity {
WebView MudRace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudrace);
        MudRace = findViewById(R.id.id_mudrace);

        MudRace.setWebViewClient(new WebViewClient());

        MudRace.getSettings().setJavaScriptEnabled(true);
        MudRace.loadUrl("https://www.invento2020.com/events/117/");
    }
}
