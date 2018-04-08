package com.nitrocoders.healthhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class headache extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headache);
    }


    public void map(View view) {
        Intent i = new Intent(headache.this, MapActivity.class);
        startActivity(i);
    }
}
