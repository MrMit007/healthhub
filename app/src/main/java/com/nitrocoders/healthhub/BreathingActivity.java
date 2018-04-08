package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BreathingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing);
    }

    public void onClickImage(View view) {
        switch (view.getId()){
            case R.id.btnasthma:
                Intent intentHead = new Intent(BreathingActivity.this,asthma.class);
                startActivity(intentHead);
                break;
            case R.id.btnbronchiolotis:
                Intent intentBack = new Intent(BreathingActivity.this,bronchiolitis.class);
                startActivity(intentBack);
                break;
            case R.id.btnpneumonia:
                Intent intentStomach = new Intent(BreathingActivity.this,pneumonia.class);
                startActivity(intentStomach);
                break;
        }
    }
}
