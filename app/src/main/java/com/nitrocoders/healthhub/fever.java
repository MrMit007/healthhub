package com.nitrocoders.healthhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fever extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever);
    }

    public void map(View view) {
        Intent i = new Intent(fever.this, MapActivity.class);
        startActivity(i);
    }
}
