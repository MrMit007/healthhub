package com.nitrocoders.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DoctorActivity extends AppCompatActivity {

    String name;
    String email;
    TextView name_txt;
    TextView email_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        Intent get = getIntent();
        name = get.getStringExtra("fullname");
        email = get.getStringExtra("email");
        name_txt= (TextView)findViewById(R.id.name);
        name_txt.setText("Name : "+name);
        email_txt=(TextView)findViewById(R.id.email);
        email_txt.setText("Email : "+email);
    }

    void takeappo(View v){
        DoctorList dl = new DoctorList();

    }
}
