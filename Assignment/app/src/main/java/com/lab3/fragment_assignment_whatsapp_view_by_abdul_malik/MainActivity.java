package com.lab3.fragment_assignment_whatsapp_view_by_abdul_malik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private PageSwiper ps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp=findViewById(R.id.pager);
        ps= new PageSwiper(getSupportFragmentManager());
        vp.setAdapter(ps);
        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show();
    }
}
