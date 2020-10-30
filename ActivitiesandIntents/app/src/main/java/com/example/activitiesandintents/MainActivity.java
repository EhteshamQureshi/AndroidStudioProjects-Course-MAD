package com.example.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ClickMe(View view){
//        Intent intent= new Intent(this,Activity_2.class);
//
        EditText et = (EditText) findViewById(R.id.editText);
//        EditText ps = (EditText) findViewById(R.id.editText2);
//        String userName=et.getEditableText().toString();
//        String password=ps.getEditableText().toString();
//        intent.putExtra(userName,userName);
//        intent.putExtra(password,password);
//        startActivity(intent);
    }
    public void openCamera(View view){
        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }
}
