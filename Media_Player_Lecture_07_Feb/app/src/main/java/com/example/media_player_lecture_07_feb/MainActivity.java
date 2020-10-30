package com.example.media_player_lecture_07_feb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextToSpeech textToSpeech;
    boolean textToSpeech_ready=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mediaPlayer = MediaPlayer.create(this, R.raw.friends_theme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Text to speech
        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });


    }
    public void speechToText(){
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,Locale.getDefault());
        //How we want to listen "model"
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
    }

    public void onSpeakThis(View view){
        if (textToSpeech_ready){
            textToSpeech.speak("hehahahahhahahehehehe ha ha    ha ha  hahahahahhahahhaah ",TextToSpeech.QUEUE_FLUSH,null);
        }
    }
    public void Start(View view){
        mediaPlayer.start();
        Toast toast = Toast.makeText(this, "Playing Audio Yeah !!!!",Toast.LENGTH_LONG);
        toast.show();
    }
    public void Pause(View view){
        Toast toast = Toast.makeText(this, "Audio Paused Yeah !!!!",Toast.LENGTH_LONG);
        toast.show();
        mediaPlayer.pause();
    }
}
