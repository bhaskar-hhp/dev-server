package com.example.webviewapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView wv = new WebView(this);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("http://161.118.189.168:8082/");
        setContentView(wv);
    }
}
