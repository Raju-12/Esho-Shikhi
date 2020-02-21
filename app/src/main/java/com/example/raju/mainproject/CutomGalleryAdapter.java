package com.example.raju.mainproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by Raju on 28-05-18.
 */

public class CutomGalleryAdapter extends BaseAdapter{

    Context context;
    int[] image;

    public CutomGalleryAdapter(Context context, int[] image) {
        this.context = context;
        this.image = image;
    }


    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageview=new ImageView(context);
        imageview.setImageResource(image[position]);
        imageview.setLayoutParams(new Gallery.LayoutParams(100,100));
        return imageview;
    }
}
