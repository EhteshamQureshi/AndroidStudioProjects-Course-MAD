package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    public void displayForTeamA(int score){
        TextView t = (TextView) findViewById(R.id.team_a_score);
        t.setText(String.valueOf(scoreTeamA));
    }
    public void addThreePoints(View view){
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA+3);
    }
    public void addTwoPoints(View view){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }
    public void addOnePoints(View view){
        ++scoreTeamA;
        displayForTeamA(scoreTeamA);
    }
    /*
    * Methods for Team B*/

    public void displayForTeamB(int score){
        TextView t = (TextView) findViewById(R.id.team_b_score);
        t.setText(String.valueOf(scoreTeamB));
    }
    public void addThreePointsB(View view){
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB+3);
    }
    public void addTwoPointsB(View view){
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }
    public void addOnePointsB(View view){
        ++scoreTeamB;
        displayForTeamB(scoreTeamB);
    }
/*
* Reset Score*/
public void resetScore(View view){
    scoreTeamA=0;
    scoreTeamB=0;
    displayForTeamA(scoreTeamA);
    displayForTeamB(scoreTeamB);
}
}
