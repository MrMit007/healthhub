package com.nitrocoders.healthhub;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "DBName.db";
    public static final String TABLE_NAME = "users";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASSWORD = "password";
    private static final String CREATE_TABLE_QUERY =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_EMAIL + " TEXT, " +
                    COLUMN_PASSWORD + " TEXT)";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_QUERY);
        String insert = "insert into users values(11,\"h\",\"l\",\"password\")";
        db.execSQL(insert);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(db);
    }

    public void insertUser(String name, String email,String password){
        SQLiteDatabase db = this.getWritableDatabase();

       /* ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NAME,name);
        contentValues.put(COLUMN_EMAIL,email);
        contentValues.put(COLUMN_PASSWORD,password);
        db.insert(TABLE_NAME,null,contentValues);
    */
       db.rawQuery("delete from users",null);
       //String insert = "insert into users values(10,\"h\",\"l\",\"password\")";
       //db.execSQL(insert);

    }

    public boolean UserExist(String email,String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select "+COLUMN_PASSWORD+" from users where "+ COLUMN_EMAIL + " ="+"\""+email+"\"",null);
        String got_password= new String();
        if(cursor.moveToFirst()){
            got_password = cursor.getString(cursor.getColumnIndex("password"));
        }
        if(password==got_password){
            return true;
        }
        return false;
    }
}
