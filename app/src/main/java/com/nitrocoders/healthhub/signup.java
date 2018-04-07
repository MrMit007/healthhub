package com.nitrocoders.healthhub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    String name;
    String email;
    String pwd;
    EditText name_edit;
    EditText email_edit;
    EditText pwd_edit;
    RadioGroup role_group;
    RadioButton selected_role;
    String role;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        name_edit = (EditText)findViewById(R.id.name);
        email_edit = (EditText)findViewById(R.id.email);
        pwd_edit = (EditText)findViewById(R.id.pwd);
        role_group = (RadioGroup)findViewById(R.id.role);
    }
    void register(View view){
        name = name_edit.getText().toString();
        email = email_edit.getText().toString();
        pwd = pwd_edit.getText().toString();

        int selectedid = role_group.getCheckedRadioButtonId();
        selected_role = (RadioButton)findViewById(selectedid);
        role = selected_role.getText().toString();

        Toast.makeText( this, "role : "+ role + "Password :"+pwd, Toast.LENGTH_SHORT ).show();
    }
    void login(View v){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
}