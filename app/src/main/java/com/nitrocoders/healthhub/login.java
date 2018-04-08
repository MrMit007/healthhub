package com.nitrocoders.healthhub;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

public class login extends AppCompatActivity {

    String email;
    String password;
    EditText email_txt;
    EditText pwd_txt;
    Button login;
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase db;
    Cursor cursor;
    TextView regis;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        email_txt=(EditText)findViewById(R.id.email);
        pwd_txt=(EditText)findViewById(R.id.pwd);
        login = (Button)findViewById(R.id.login_button);
        regis = (TextView)findViewById(R.id.register_link);
        dbhelper = new SQLiteDBHelper(this);
        db = dbhelper.getReadableDatabase();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=email_txt.getText().toString();
                password=pwd_txt.getText().toString();

                cursor = db.rawQuery("SELECT * FROM " +SQLiteDBHelper.TABLE_NAME +" WHERE "+SQLiteDBHelper.COLUMN_EMAIL +" = ?"+" AND "+ SQLiteDBHelper.COLUMN_PASSWORD+"=?",new String[]{email,password});
                if (cursor != null) {
                    if(cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        //Retrieving User FullName and Email after successfull login and passing to LoginSucessActivity
                        String _fname = cursor.getString(cursor.getColumnIndex(SQLiteDBHelper.COLUMN_FULLNAME));
                        String _email = cursor.getString(cursor.getColumnIndex(SQLiteDBHelper.COLUMN_EMAIL));
                        String _role = cursor.getString(cursor.getColumnIndex(SQLiteDBHelper.COLUMN_ROLE));
                        Toast.makeText(login.this, "Login Success", Toast.LENGTH_SHORT).show();
                        if(_role.equals("Patient")) {
                            Intent intent = new Intent(login.this, MainActivity.class);
                            intent.putExtra("fullname", _fname);
                            intent.putExtra("email", _email);
                            startActivity(intent);
                        }
                        else{
                            Intent intent = new Intent(login.this,DoctorActivity.class);
                            intent.putExtra("fullname", _fname);
                            intent.putExtra("email", _email);
                            startActivity(intent);
                        }
                        //Removing MainActivity[Login Screen] from the stack for preventing back button press.
                        finish();
                    }
                    else {
                        Toast.makeText(login.this, "Username or Password is wrong.", Toast.LENGTH_SHORT).show();
                        email_txt.setText("");
                        pwd_txt.setText("");
                    }
                }
        }});
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login.this,signup.class);
                startActivity(i);
            }
        });
      }

}
