package com.example.ehteshamqureshifinalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Q1. Develop an android application which read all Jokes from the “com.jokeslist.jokes” content provider and loads them in ListView. [Java Code Only]
        Cursor mycursor = getContentResolver().query(com.jokeslist.jokes.ContentURI,
        new  String[]{com.jokeslist.jokes.title,
                com.jokeslist.jokes.joke}null,null,null);
        /*
//        Q2. Write the code snippets for the following:
//        i.                     Create Notification Manager
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//
//        ii.                   Create Notification Builder (Add icon, Title, Text)
        NotificationBuilder builder = new NotificationBuilder()
//
//        iii.                  Add pending intent to “com.action.myBrowser”
        Intent intent = new Intent(com.action.myBrowser);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);
//
//        iv.                 Create action and attach it into the builder
            builder.addAction(anybitmap,"Action",pendingIntent);
//        v.                   Issue the notification
        Manager.notify(NOTIFICATION_ID,builder.build());
*/

    }
}
