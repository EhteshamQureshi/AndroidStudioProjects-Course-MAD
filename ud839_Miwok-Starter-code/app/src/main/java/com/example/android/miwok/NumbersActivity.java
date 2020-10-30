package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("one");
        wordList.add("two");
        wordList.add("three");
        wordList.add("four");
        wordList.add("five");
        wordList.add("six");



        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        int index=0;

        for( int index = 0; index < wordList.size(); index++){
            TextView addWord = new TextView(this);
            addWord.setText(wordList.get(index).toString());
            rootView.addView(addWord);
        }.
    }
}
