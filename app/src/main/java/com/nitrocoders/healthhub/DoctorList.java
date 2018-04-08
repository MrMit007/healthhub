package com.nitrocoders.healthhub;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.location.Location.convert;

/**
 * Created by Mit Patel on 08-Apr-18.
 */

public class DoctorList extends AppCompatActivity {
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase db;
    ArrayList<String> list = new ArrayList<String>();
    Cursor cursor;
    String doc = "Doctor";
    ListView lst;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctorlist);
        dbhelper = new SQLiteDBHelper(this);
        db = dbhelper.getReadableDatabase();
        lst = (ListView)  findViewById(R.id.list_doctor);
        cursor = db.rawQuery("SELECT * FROM " + SQLiteDBHelper.TABLE_NAME + " WHERE " + SQLiteDBHelper.COLUMN_ROLE + " = ? ", new String[]{doc});

        if (cursor != null) {
            while (cursor.getCount() > 0) {
                cursor.moveToFirst();
                //Retrieving User FullName and Email after successfull login and passing to LoginSucessActivity
                String _fname = cursor.getString(cursor.getColumnIndex(SQLiteDBHelper.COLUMN_FULLNAME));
                cursor.moveToNext();
                list.add(_fname);
            }
            finish();
        }
        String arr[] = list.toArray(new String[list.size()]);
        lst.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr));
    }

}