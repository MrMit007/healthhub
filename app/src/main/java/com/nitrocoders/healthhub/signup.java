package com.nitrocoders.healthhub;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class signup extends AppCompatActivity {

    SQLiteOpenHelper openHelper;
    SQLiteDatabase db ;

    String name;
    String email;
    String pwd;
    EditText name_edit;
    EditText email_edit;
    EditText pwd_edit;
    RadioGroup role_group;
    RadioButton selected_role;
    String role;
    Button reg;
    TextView gotologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        openHelper = new SQLiteDBHelper(this);
        name_edit = (EditText)findViewById(R.id.name);
        email_edit = (EditText)findViewById(R.id.email);
        pwd_edit = (EditText)findViewById(R.id.pwd);
        role_group = (RadioGroup)findViewById(R.id.role);
        reg = (Button)findViewById(R.id.register_button);
        gotologin=(TextView)findViewById(R.id.login_link);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db = openHelper.getWritableDatabase();
                name = name_edit.getText().toString();
                email = email_edit.getText().toString();
                pwd = pwd_edit.getText().toString();
                int selected = role_group.getCheckedRadioButtonId();
                selected_role = (RadioButton)findViewById(selected);
                role = selected_role.getText().toString();
                InsertData(name,email,pwd,role);
                Toast.makeText(signup.this,"Account Created Successfully",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(signup.this,login.class));
            }
        });
        gotologin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i= new Intent(signup.this,login.class);
                startActivity(i);
            }
        });

    }
    public void InsertData(String n,String e,String p,String r){
        ContentValues values = new ContentValues();
        values.put(SQLiteDBHelper.COLUMN_FULLNAME,n);
        values.put(SQLiteDBHelper.COLUMN_EMAIL,e);
        values.put(SQLiteDBHelper.COLUMN_PASSWORD,p);
        values.put(SQLiteDBHelper.COLUMN_ROLE,r);
        long id = db.insert(SQLiteDBHelper.TABLE_NAME,null,values);
    }
}