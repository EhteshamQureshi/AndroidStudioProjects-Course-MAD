package com.example.friendsratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToSecondActivity(View view)
    {
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);
        ImageView imageView=findViewById(R.id.A);
    }
}
