package com.karlodipetrio.shopinglist.gui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;


import com.karlodipetrio.shopinglist.R;

import java.util.ArrayList;

/**
 * Created by Pavel on 01.08.2015.
 */
public class CategoriesImageAdapter extends BaseAdapter {

    private Context mContext;
   // private ArrayList<Integer> mImageIdArr;

    // Keep all Images in array
    public Integer[] mImageIdArr = {R.drawable.ph1, R.drawable.ph2, R.drawable.ph3,
                                  R.drawable.ph4, R.drawable.ph5, R.drawable.ph6,
                                  R.drawable.ph7, R.drawable.ph8, R.drawable.ph9};

    public CategoriesImageAdapter(Context ctx) {
        mContext = ctx;
    }

    @Override
    public int getCount() {
        return mImageIdArr.length; // num of categories dump
    }

    @Override
    public Object getItem(int position) {
        return mImageIdArr[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mImageIdArr[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(120, 110));
        return imageView;
    }
}
