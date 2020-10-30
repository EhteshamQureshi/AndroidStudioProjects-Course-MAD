package com.example.myfirstapp_lab_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random;
    Button bt1,bt2;
    int bt1Value,bt2Value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        bt1Value=random.nextInt()%100;
        bt2Value=random.nextInt()%100;

        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);

        bt1.setText(""+bt1Value);
        bt2.setText(""+bt2Value);


    }
//    button function on event
    public void click(View view){
//        if (bt1Value>bt2Value)



    }
}
