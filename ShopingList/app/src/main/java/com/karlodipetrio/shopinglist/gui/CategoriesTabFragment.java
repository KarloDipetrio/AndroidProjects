package com.karlodipetrio.shopinglist.gui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.karlodipetrio.shopinglist.R;

/**
 * Created by Pavel on 22.07.2015.
 */
public class CategoriesTabFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.categories_tab, container, false);
        GridView gridView = (GridView)view.findViewById(R.id.grid_view);
        gridView.setAdapter(new CategoriesImageAdapter(view.getContext()));
        return view;
    }
}
