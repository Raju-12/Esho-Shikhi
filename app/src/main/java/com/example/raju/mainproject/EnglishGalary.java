package com.example.raju.mainproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class EnglishGalary extends AppCompatActivity {
    ImageView imageView;
    Gallery gallery;
    int image[]={R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.dd,R.drawable.ee,R.drawable.ff,R.drawable.gg,R.drawable.hh,
            R.drawable.ii,R.drawable.jj,R.drawable.kk,
            R.drawable.ll,R.drawable.mm,R.drawable.nn,R.drawable.oo,R.drawable.pp,R.drawable.qq,R.drawable.rr,
            R.drawable.ss,R.drawable.tt,R.drawable.uu,R.drawable.vv,R.drawable.ww,R.drawable.xx,R.drawable.yy,R.drawable.zz,};
    int alphabet[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,
            R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,
            R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z};

    MediaPlayer apple,ball,cat,dog,elephant,fox,girl,house,ink,jam,kitchen,lion,monkey,nose,orange,pineapple,quine,rabbit,sweet,train,
    umbrella,vase,women,xmas,yout,zebra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_galary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        apple=MediaPlayer.create(EnglishGalary.this,R.raw.apple);
        ball=MediaPlayer.create(EnglishGalary.this,R.raw.ball);

        imageView=(ImageView)findViewById(R.id.simpleimageview);
        gallery=(Gallery) findViewById(R.id.simplegallary);

        CutomGalleryAdapter cutomGalleryAdapter=new CutomGalleryAdapter(getApplicationContext(),alphabet);
        gallery.setAdapter(cutomGalleryAdapter);
        gallery.setSpacing(5);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imageView.setImageResource(image[position]);
                if(alphabet[position]==R.drawable.a){
                    apple.start();
                }
                if(alphabet[position]==R.drawable.b){
                    ball.start();
                }

            }
        });




    }


}
