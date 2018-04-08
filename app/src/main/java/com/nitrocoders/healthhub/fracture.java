package com.nitrocoders.healthhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fracture extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fracture);
    }

    public void map(View view) {
        Intent i = new Intent(fracture.this, MapActivity.class);
        startActivity(i);
    }

}
