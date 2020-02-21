package com.example.raju.mainproject;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Raju on 04-06-18.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images={R.drawable.cricketbat,R.drawable.criketball,R.drawable.caram,R.drawable.football,R.drawable.badminton,
    R.drawable.tenis,R.drawable.kanamachi,R.drawable.daba,R.drawable.ludhu};
    //---------extra--------//
    private String[] name={"এিকেটব্যাট","এিকেটবল","কেরাম","ফুটবল","বেডমিন্টন","টেনিস","কানামাছি","দাবা","লুডু"};

    public ViewPagerAdapter(Context context) {
        this.context = context;
        this.layoutInflater = layoutInflater;
        this.images = images;
        this.name = name;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.custom_layout,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageviewv);

        //-----extra start---------//
        TextView textView=(TextView)view.findViewById(R.id.textviewv);
        textView.setText(name[position]);
        //------extra end --------//

        imageView.setImageResource(images[position]);
        ViewPager vp=(ViewPager)container;
        vp.addView(view, 0);
        return  view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp=(ViewPager)container;
        View view=(View)object;
        vp.removeView(view);
    }
}
