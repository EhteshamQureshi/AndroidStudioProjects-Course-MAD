package com.example.potatogame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox checkBox=(CheckBox) findViewById(R.id.head);
        checkBox.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                if(checkBox.isChecked()){
                    imageView.setVisibility(View.GONE);
                }
                else{
                    imageView.setVisibility(View.VISIBLE);
                }

            }
        });
    }

}
