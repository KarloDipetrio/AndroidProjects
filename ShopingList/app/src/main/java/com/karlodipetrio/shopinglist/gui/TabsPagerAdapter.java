package com.karlodipetrio.shopinglist.gui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Pavel on 23.07.2015.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        switch(index) {
            case 0: // return purchases tab
                return new CategoriesTabFragment();

            case 1: // return basket tab
                return new BasketTabFragment();

            case 2: // return my saved lists tab
                return new MyListTabFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // return num of tabs
        return 3;
    }
}
