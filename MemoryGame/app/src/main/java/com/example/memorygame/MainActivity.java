package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean alreadyClicked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onFlip(View view){
        if(!alreadyClicked) {
            ImageView image = (ImageView) findViewById(R.id.image1);
            image.setImageResource(R.drawable.one);
            alreadyClicked=true;
        }
        else{
            ImageView image = (ImageView) findViewById(R.id.image1);
            image.setImageResource(R.drawable.guessicon);
            alreadyClicked=false;
        }


    }

}
