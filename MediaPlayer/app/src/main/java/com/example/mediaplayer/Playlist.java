package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import

public class Playlist extends AppCompatActivity {
//    ArrayList<Integer> songsList = ArrayList<Integer>(R.raw.song);
//    List<Integer> songslist = new ArrayList<Integer>(Arrays.asList(R.raw.song,R.raw.abc,R.raw.def,R.raw.jkl,R.raw.ghi));
//    Reading songs NAme



//    String[] nameArray = {"Octopus","Pig","Sheep","Rabbit","Snake","Spider" };
    String[] nameArray={" "," "," "," "," "};
    String[] infoArray = {" "," "," "," "," "};

    Integer[] imageArray = {R.drawable.play,R.drawable.play,R.drawable.play,
            R.drawable.play,R.drawable.play,R.drawable.play};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Field[] fields = R.raw.class.getFields();
        ArrayList<String> songlist=new ArrayList<String>();
        for(int count=0; count < fields.length; count++){
//            int rid = fields[count].getInt(fields[count]);
            String filename = fields[count].getName();
            nameArray[count]=filename;
            songlist.add(filename);
        }

        CustomListAdapter whatever = new CustomListAdapter(this,nameArray, infoArray, imageArray);

        ListView listView = (ListView) findViewById(R.id.listViewID);

        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                String message = nameArray[position];
                intent.putExtra("animal", message);
                startActivity(intent);
            }

        });


    };


}
