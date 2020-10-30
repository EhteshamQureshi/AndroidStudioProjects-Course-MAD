package com.example.inputsudacitycoursetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         int weekday = 5;
         int weekend = 9;
         int optimalHours = 7*8;
         int actualHours = weekday*5+weekend*2;
         int solution =optimalHours-actualHours;
         display(solution);
         displayTravelTime();
    }

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();

        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
    public void display(int i){
        TextView t = (TextView) findViewById(R.id.display_text_view );
        t.setText(""+i);
    }
    public void displayTravelTime(){
        int day1 = 15 , day2 = 22 , day3 = 8;
        int averageTime = day1 + day2 + day3 / 3;
        TextView t = (TextView) findViewById(R.id.display_total_trave_time);
        t.setText(""+averageTime);
    }

   


}
