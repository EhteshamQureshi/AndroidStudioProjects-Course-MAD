package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int CAMERA_CODE =124;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override



    public void openCamera(View view){
        Intent intent=new Intent();
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA_CODE);

    }
    public void openSecondActivity(View view){
        Intent i=new Intent(this,Act_2.class);
        startActivity(i);
    }
    public void onActivityResult(int requestCode,int RESULT_CODE,Intent data){
        super.onActivityResult(requestCode,RESULT_CODE,data);
        if(requestCode==CAMERA_CODE){
            Bitmap img = (Bitmap) data.getExtras().get("data");
            ImageView profilePic= (ImageView) findViewById(R.id.profilePic);
            profilePic.setImageBitmap(img);
            Toast.makeText(this, "Camera Result is here", Toast.LENGTH_LONG).show();
        }
    }
//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
//        super.onSaveInstanceState(outState, outPersistentState);
//        outPersistentState.putInt("value1",123);
//        outPersistentState.putString("name","subhan");
//    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("name",23);
        outState.putString("key","jahsdflkj");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getInt("name");
        savedInstanceState.getString("key");
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);

    }

}
