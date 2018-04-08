package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bronchiolitis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bronchiolitis);

    }

    public void asthama(View view) {
        Intent i = new Intent(bronchiolitis.this, MapActivity.class);
        startActivity(i);
    }

}
