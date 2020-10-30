package com.example.setprofilepic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int CAMERA_CODE=123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)  ;
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Intent intent= new Intent();
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAMERA_CODE);

    }
    public void onActivityResult(int requestCode,int resultCode,Intent intent){
        super.onActivityResult(requestCode,resultCode,intent);
        if(requestCode==CAMERA_CODE){
            Bitmap img = (Bitmap) intent.getExtras().get("data");
            ImageView imageToSEt= (ImageView) findViewById(R.id.imageView);
            imageToSEt.setImageBitmap(img);
            Toast.makeText(this, "image Set Successfully", Toast.LENGTH_LONG).show();
        }

    }
}
