package com.nitrocoders.healthhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class fever extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever);

        WebView webViewdip = (WebView)findViewById(R.id.webVideoViewdip);
        webViewdip.setVisibility(View.VISIBLE);
        String html ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Qo6OHoVJl-Y\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";

        webViewdip.getSettings().setJavaScriptEnabled(true);
        webViewdip.setWebChromeClient(new WebChromeClient() {
        });

        webViewdip.loadData(html, "text/html", "utf-8");
    }

    public void map(View view) {
        Intent i = new Intent(fever.this, MapActivity.class);
        startActivity(i);
    }
}
