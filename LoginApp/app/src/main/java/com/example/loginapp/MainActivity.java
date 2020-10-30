package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean isfirstLogin=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("defaultFile",MODE_PRIVATE);
        boolean isAlreadyLoggedIn= preferences.getBoolean("isFirstLogin",false);
        if(isAlreadyLoggedIn){
            Intent intent=new Intent(this,Logged_In.class);
            startActivity(intent);
        }
        else {
            setContentView(R.layout.activity_main);
        }
    }


    public void onClick(View view){

        SharedPreferences preferences=getSharedPreferences("defaultFile",MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = preferences.edit();
        EditText username= (EditText) findViewById(R.id.username);
        EditText password= (EditText) findViewById(R.id.password);
        prefsEditor.putString("username",username.getText().toString());
        prefsEditor.putString("password",password.getText().toString());
        prefsEditor.putBoolean("isFirstLogin",true);
        prefsEditor.apply();

        Intent intent=new Intent(this,Logged_In.class);
        startActivity(intent);
   }
}
