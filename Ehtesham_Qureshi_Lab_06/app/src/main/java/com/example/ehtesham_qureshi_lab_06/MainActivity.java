package com.example.ehtesham_qureshi_lab_06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button mButton1;
    private Intent mIntent1;

    private String story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIntent1 = new Intent(this, PlayActivity.class);
    }

    public void getStarted(View view) {
        startActivity(mIntent1);
    }
}