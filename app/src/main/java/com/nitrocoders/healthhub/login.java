package com.nitrocoders.healthhub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    String email;
    String password;
    EditText email_txt;
    EditText pwd_txt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        email_txt=(EditText)findViewById(R.id.email);
        pwd_txt=(EditText)findViewById(R.id.pwd);
    }

    void login(View v){
        email=email_txt.getText().toString();
        password=pwd_txt.getText().toString();
        Toast.makeText( this, "Email : "+ email + "Password :"+password, Toast.LENGTH_SHORT ).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    void signup(View v){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
}
