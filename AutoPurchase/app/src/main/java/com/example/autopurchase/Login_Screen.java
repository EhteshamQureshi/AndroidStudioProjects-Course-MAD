package com.example.autopurchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);
    }
    public void goToDataEntry(View view){
        Intent myintent = new Intent(this,MainActivity.class);
        startActivity(myintent);
    }
    public void whenLoggedIN(View view){
            String username,password;

    }
     public void calculateSummary(){
        int a,b,c,d,e,f;


    }
}
