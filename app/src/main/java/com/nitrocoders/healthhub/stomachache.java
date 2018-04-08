package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class stomachache extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stomachache);
    }


    public void map(View view) {
        Intent i = new Intent(stomachache.this, MapActivity.class);
        startActivity(i);
    }
}
