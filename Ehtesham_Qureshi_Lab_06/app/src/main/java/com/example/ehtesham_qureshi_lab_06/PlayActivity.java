package com.example.ehtesham_qureshi_lab_06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayActivity extends AppCompatActivity {

    private TextView tvWordsLeft, tvWordHint;
    private EditText etTypeWord;
    private Intent mIntent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        this.tvWordsLeft = findViewById(R.id.tvWordsLeft);
        this.tvWordHint = findViewById(R.id.tvWordHint);
        this.etTypeWord = findViewById(R.id.etTypeWord);
        this.mIntent1 = new Intent(this,ResultActivity.class);
    }

    public void enterWord(View view) {
        startActivity(mIntent1);

    }
}