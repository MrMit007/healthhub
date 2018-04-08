package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PhysioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physio);
    }

    public void onClickImage(View view) {
        switch (view.getId()){
            case R.id.btnfracture:
                Intent intentHead = new Intent(PhysioActivity.this,fracture.class);
                startActivity(intentHead);
                break;
            case R.id.btnother:
                Intent intentBack = new Intent(PhysioActivity.this,other.class);
                startActivity(intentBack);
                break;
        }
    }
}
