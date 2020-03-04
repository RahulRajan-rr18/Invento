package com.gecpalakkad.invento2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FasionShow extends AppCompatActivity {
WebView Fasion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasion_show);
        Fasion = findViewById(R.id.id_fasion);

        Fasion.setWebViewClient(new WebViewClient());

        Fasion.getSettings().setJavaScriptEnabled(true);
        Fasion.loadUrl("https://www.invento2020.com/events/120/");
    }
}
