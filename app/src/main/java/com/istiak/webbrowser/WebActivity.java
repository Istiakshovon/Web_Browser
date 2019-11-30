package com.istiak.webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {


    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        web=findViewById(R.id.web);

        String getURL=getIntent().getExtras().getString("url");

        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);//for enable js in web page
        web.getSettings().setBuiltInZoomControls(true); //for zoom

        web.loadUrl("http://"+getURL);

    }



    //for backpress in webview

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
            web.goBack();
            return true;
        } else {
            finish();
        }

        return super.onKeyDown(keyCode,event);
    }
}
