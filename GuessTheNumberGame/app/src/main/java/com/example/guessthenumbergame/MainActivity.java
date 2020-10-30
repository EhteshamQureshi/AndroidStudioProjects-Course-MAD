package com.example.guessthenumbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView text;
    int noOfTries=1;
    int noToGuess;
    int guessedNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GenerateNewRandomNo();

    }
    public void GenerateNewRandomNo(){
        Random rand= new Random();
        noToGuess=rand.nextInt(1000);
    }
    public void GenerateNew(View view){
        GenerateNewRandomNo();
    }
    public void Validate(View view){
        TextView guessedText= findViewById(R.id.guessBox);
        text =findViewById(R.id.textToShow);
        guessedNo=Integer.parseInt(guessedText.getText().toString());
        if(guessedNo==noToGuess)
        {
            text.setText("You Guessed Correctly");
        }
        else if (guessedNo>noToGuess){
            text.setText("Your Guessed no is too High"+" "+noOfTries++);
        }
        else {
            text.setText("Your Guessed no is too Low"+" "+noOfTries++);
        }
    }

}
