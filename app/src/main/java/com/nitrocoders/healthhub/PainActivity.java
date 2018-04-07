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
                Intent intentComp = new Intent(this,ComputerEng.class);
                startActivity(intentComp);
                break;
            case R.id.btnbackpain:
                Intent intentMech = new Intent(this,MechanicalEng.class);
                startActivity(intentMech);
                break;
            case R.id.btnstomachache:
                Intent intentCivil = new Intent(this,CivilEng.class);
                startActivity(intentCivil);
                break;
            case R.id.btntoot:
                Intent intentEc = new Intent(this,EcEng.class);
                startActivity(intentEc);
                break;
        }
    }
}
