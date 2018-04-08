package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cold_cough extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_cough);
    }

    public void map(View view) {
        Intent i = new Intent(cold_cough.this, MapActivity.class);
        startActivity(i);
    }
}
