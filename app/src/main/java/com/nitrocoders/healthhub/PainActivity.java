package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain);
    }

    public void onClickImage(View view) {
        switch (view.getId()){
            case R.id.btmheadche:
                Intent intentHead = new Intent(PainActivity.this,headache.class);
                startActivity(intentHead);
                break;
            case R.id.btnbackpain:
                Intent intentBack = new Intent(PainActivity.this,backpain.class);
                startActivity(intentBack);
                break;
            case R.id.btnstomachache:
                Intent intentStomach = new Intent(PainActivity.this,stomachache.class);
                startActivity(intentStomach);
                break;
            case R.id.btntoothache:
                Intent intentTooth = new Intent(PainActivity.this,toothache.class);
                startActivity(intentTooth);
                break;

            case R.id.btnear:
                Intent intentEar = new Intent(PainActivity.this,earache.class);
                startActivity(intentEar);
                break;
            case R.id.btnsorethroat:
                Intent intentThroat = new Intent(PainActivity.this,soreThroat.class);
                startActivity(intentThroat);
                break;
        }
    }
}
