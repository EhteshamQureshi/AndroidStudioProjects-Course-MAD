package com.example.chessboardproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase mydatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Creating Database
        mydatabase = openOrCreateDatabase("User", MODE_PRIVATE, null);
        String createTable = "CREATE TABLE IF NOT EXISTS REGISTEREDUSERS(userName VARCHAR(30) not null,password VARCHAR(20) not null)";
        mydatabase.execSQL(createTable);
//        String inserData = "INSERT INTO REGISTEREDUSERS VALUES('ehtesham','giveaccess')";
//        mydatabase.execSQL(inserData);
        String inserData = "DELETE FROM REGISTEREDUSERS WHERE USERNAME='ehtesham'";

    }
    public void fetchDatabase(View view){
        //      Fetching Data From Table
        ContentValues cv= new ContentValues();
        cv.put("username","ehtesham");
        cv.put("password","123");
        String selectData="Select * From REGISTEREDUSERS";
        Cursor getResultSet = mydatabase.rawQuery(selectData,null);
        getResultSet.moveToFirst();
        String userName = getResultSet.getString(0);
        String password = getResultSet.getString(1);
        TextView user = (TextView) findViewById(R.id.username);
        TextView pass = (TextView) findViewById(R.id.password);
        user.setText(userName);
        pass.setText(password);
    }
}
