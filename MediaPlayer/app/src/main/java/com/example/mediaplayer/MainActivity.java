package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton playButton,nextButton,previousButton;
    SeekBar positionBar;
    TextView elapsedTimeTextView;
    TextView remainingTimeTextView;
    MediaPlayer mediaPlayer;
    int totalTime;
    //Array of songs
    ArrayList<Integer> songsList;
    int current_song=0;
//    ArrayList<String> songsList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songsList = new ArrayList<Integer>();

        songsList.add(R.raw.song);
        songsList.add(R.raw.abc);
        songsList.add(R.raw.def);
        songsList.add(R.raw.ghi);
        songsList.add(R.raw.jkl);



        playButton = (ImageButton) findViewById(R.id.play_button);
        nextButton = (ImageButton) findViewById(R.id.next_button);
        previousButton = (ImageButton) findViewById(R.id.back_button);
//Time
        elapsedTimeTextView = (TextView) findViewById(R.id.ElaspedTimeLabel);
        remainingTimeTextView = (TextView) findViewById(R.id.RemainingTimeLabel);

//Media Player
        mediaPlayer = MediaPlayer.create(this, songsList.get(current_song));
        totalTime = mediaPlayer.getDuration();
//Event on Play Button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mediaPlayer.isPlaying()){
                    mediaPlayer.start();
                    // Changing button image to play button
                    playButton.setImageResource(R.drawable.pause);
                }
                else {
                    mediaPlayer.pause();
                    playButton.setImageResource(R.drawable.play);
                }

            }
        });
        //Event on Next Button
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                current_song++;
                if(current_song>songsList.size()-1){
                    current_song=0;
                }
                mediaPlayer.stop();

                mediaPlayer = MediaPlayer.create(getApplicationContext(),songsList.get(current_song));
                mediaPlayer.start();
                totalTime = mediaPlayer.getDuration();
            }
        });
        //Event on Previous Button
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_song--;
                if(current_song<0){
                    current_song = songsList.size()-1;
                }

                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getApplicationContext(),songsList.get(current_song));
                mediaPlayer.start();
                totalTime = mediaPlayer.getDuration();

            }
        });
        //Position BAr
        positionBar = (SeekBar) findViewById(R.id.seekBar);
        positionBar.setMax(totalTime);
        positionBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if(fromUser){
                            mediaPlayer.seekTo(progress);
                            positionBar.setProgress(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
//        Thread to update position bar and time label
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mediaPlayer != null ){
                    try {
                        Message msg = new Message();
                    msg.what = mediaPlayer.getCurrentPosition();
                    handler.sendMessage(msg);
                    Thread.sleep(1000);

                    } catch (InterruptedException e){}

                }
            }
        }).start();



    }
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            int currentPosition= msg.what;
//            Updating Position bar
            positionBar.setProgress(currentPosition);

//            Updating Labels
            String elaspedTime  = createTimeLabel(currentPosition);
            elapsedTimeTextView.setText(elaspedTime);

            String remainingTime  = createTimeLabel(totalTime-currentPosition);
            remainingTimeTextView.setText("-" + remainingTime);

        }
    };
//Calculating the time variables
    public String createTimeLabel(int time){
        String timeLabel = "";
        int min = time/1000/60;
        int sec = time /1000%60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

    return timeLabel;
    }
}

