package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_clicker;
    TextView TextView_Counter;

    int clicks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_clicker=findViewById(R.id.button_clicker);
        TextView_Counter = findViewById(R.id.TextView_Counter);

        button_clicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                TextView_Counter.setText(Integer.toString(clicks));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.getInt("clickerValue",clicks);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        clicks=savedInstanceState.getInt("clickerValue");
        TextView_Counter=findViewById(R.id.TextView_Counter);
        TextView_Counter.setText(Integer.toString(clicks));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("App_Lifecycle","App is start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("App_Lifecycle","App is Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("App_Lifecycle","App is Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("App_Lifecycle","App is Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("App_Lifecycle","App is Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("App_Lifecycle","App is Destroyed");
    }



}
