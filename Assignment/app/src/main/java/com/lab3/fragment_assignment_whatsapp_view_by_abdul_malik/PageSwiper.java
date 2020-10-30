package com.lab3.fragment_assignment_whatsapp_view_by_abdul_malik;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageSwiper extends FragmentStatePagerAdapter {

    public PageSwiper(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                Page1 pg1= new Page1();
                return pg1;
            case 1:
                Page2 pg2 = new Page2();
                return pg2;
            case 2:
                Page3 pg3 = new Page3();
                return pg3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 100;
    }
}
