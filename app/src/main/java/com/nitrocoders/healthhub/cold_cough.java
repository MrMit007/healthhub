package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
import android.webkit.WebChromeClient;
import android.webkit.WebView;
=======
>>>>>>> 172417a4cc4eb06239ae382dcab4c95374bb7bfa

public class cold_cough extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_cough);

        WebView webViewdip = (WebView)findViewById(R.id.webVideoViewdip);
        webViewdip.setVisibility(View.VISIBLE);
        String html ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/g43J0g6q2Gg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";

        webViewdip.getSettings().setJavaScriptEnabled(true);
        webViewdip.setWebChromeClient(new WebChromeClient() {
        });

        webViewdip.loadData(html, "text/html", "utf-8");
    }

    public void map(View view) {
        Intent i = new Intent(cold_cough.this, MapActivity.class);
        startActivity(i);
    }
}
