package com.karlodipetrio.shopinglist.gui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.karlodipetrio.shopinglist.R;

/**
 * Created by Pavel on 22.07.2015.
 */
public class MyListTabFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (LinearLayout)inflater.inflate(R.layout.my_list_tab, container, false);
    }
}
