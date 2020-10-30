package com.example.ehtesham_qureshi_lab_06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView tvStoryPara;
    private Intent mIntent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvStoryPara = findViewById(R.id.tvStoryPara);

        mIntent1 = new Intent(this, MainActivity.class);
    }

    public void makeAnotherStory(View view) {
        startActivity(mIntent1);
    }
}