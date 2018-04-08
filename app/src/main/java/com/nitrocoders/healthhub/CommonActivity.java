package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CommonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
    }

    public void onClickImage(View view) {
        switch (view.getId()){
            case R.id.btncold:
                Intent intentHead = new Intent(CommonActivity.this,cold_cough.class);
                startActivity(intentHead);
                break;
            case R.id.btnfever:
                Intent intentBack = new Intent(CommonActivity.this,fever.class);
                startActivity(intentBack);
                break;
        }
    }
}
