package com.nitrocoders.healthhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SkinActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);
    }

    public void onClickImage(View view) {
        switch (view.getId()){
            case R.id.btnsunburn:
                Intent intentHead = new Intent(SkinActivity.this,sunburn.class);
                startActivity(intentHead);
                break;
            case R.id.btnrash:
                Intent intentBack = new Intent(SkinActivity.this,rash.class);
                startActivity(intentBack);
                break;
            case R.id.btnacne:
                Intent intentStomach = new Intent(SkinActivity.this,acne.class);
                startActivity(intentStomach);
                break;
        }
    }
}
