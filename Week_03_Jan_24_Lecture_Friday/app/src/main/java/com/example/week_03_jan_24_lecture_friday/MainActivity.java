package com.example.week_03_jan_24_lecture_friday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("OnCreateTag","Successfully launched");
        //Activity based data Availble only to the current activity Only one mode is present
        SharedPreferences preferences=getPreferences(MODE_PRIVATE);

        //Application based Data availble for the whole application
        SharedPreferences sharedPreferences= getSharedPreferences("myPrefes",MODE_PRIVATE);

        //First of all we need to make editor
        SharedPreferences.Editor editor=preferences.edit();
        editor.putBoolean("IsLogin",false);
        editor.commit();

    }

    protected void onResume(){
        super.onResume();
//        Context context = getApplicationContext();
//        CharSequence text = "Hello toast!";
    //        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();
        Toast.makeText(this,"in OnResoume Method",Toast.LENGTH_SHORT).show();
    }

    protected void OnStop() {

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
