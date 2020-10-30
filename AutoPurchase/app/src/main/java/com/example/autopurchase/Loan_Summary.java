package com.example.autopurchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Loan_Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan__summary);
    }
    public void onClickToReturn(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
//        Just Run the Summary Here.
    }
}
