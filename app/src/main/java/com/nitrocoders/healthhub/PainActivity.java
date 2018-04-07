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
                Intent intentComp = new Intent(PainActivity.this,headacheActivity.class);
                startActivity(intentComp);
                break;
            case R.id.btnbackpain:
                Intent intentMech = new Intent(PainActivity.this,headacheActivity.class);
                startActivity(intentMech);
                break;
            case R.id.btnstomachache:
                Intent intentCivil = new Intent(PainActivity.this,headacheActivity.class);
                startActivity(intentCivil);
                break;
            case R.id.btntoothache:
                Intent intentEc = new Intent(PainActivity.this,headacheActivity.class);
                startActivity(intentEc);
                break;

            case R.id.btnear:
                Intent intentit = new Intent(PainActivity.this,headacheActivity.class);
                startActivity(intentit);
                break;
            case R.id.btnsorethroat:
                Intent intentee = new Intent(PainActivity.this,headacheActivity.class);
                startActivity(intentee);
                break;
        }
    }
}
