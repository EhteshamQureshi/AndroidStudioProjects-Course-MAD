package com.example.methods;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView greetings = new TextView(this);
        greetings.setText("Welocme to the Methods");
        greetings.setTextColor(Color.BLUE);
        greetings.setTextSize(20);

        setContentView(greetings);


        setContentView(R.layout.activity_main);
    }
}
