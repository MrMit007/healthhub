package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class earache extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earache);
    }

    public void map(View view) {
        Intent i = new Intent(earache.this, MapActivity.class);
        startActivity(i);
    }
}
