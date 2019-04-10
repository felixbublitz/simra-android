package de.tuberlin.mcc.simra.app;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView myWebView = new WebView(getBaseContext());
        setContentView(myWebView);
        String URL = getString(R.string.mccPage);
        URL = getIntent().getStringExtra("URL");
        myWebView.loadUrl(URL);
    }
}