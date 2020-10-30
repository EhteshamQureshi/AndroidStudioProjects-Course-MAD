package com.example.autopurchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        int price,cash,loanTermYears;
        EditText inputPrice= (EditText) findViewById(R.id.editText);
        price= Integer.parseInt(inputPrice.toString());
        EditText inputCashDown= (EditText) findViewById(R.id.editText2);
        cash= Integer.parseInt(inputCashDown.toString());
        RadioButton r2Years= (RadioButton) findViewById(R.id.radioButton);
        RadioButton r3Years= (RadioButton) findViewById(R.id.radioButton2);
        RadioButton r4Years= (RadioButton) findViewById(R.id.radioButton3);
        if(r2Years.isChecked()){
          loanTermYears=2;
        }
        else if(r3Years.isChecked()) {
            loanTermYears=2;
        }
        else if (r4Years.isChecked()){
            loanTermYears=2;
        }

        Intent intent = new Intent(this,Loan_Summary.class);
//        intent.putExtra("price",price);
//        intent.putExtra("cash",cash);
       startActivity(intent);

    }
}
