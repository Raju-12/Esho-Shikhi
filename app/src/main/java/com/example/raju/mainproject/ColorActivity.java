package com.example.raju.mainproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;

public class ColorActivity extends AppCompatActivity {
    ImageView redImageview,blueimageview,navyblueimageview,blackimageview,whiteimageview,grayimageview,yellowimageview,greenimageview,brownimageview,indigoimageview,violetimageview,orangeimageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void coloranimation(View view){
        redImageview=(ImageView)findViewById(R.id.red);
        blueimageview=(ImageView)findViewById(R.id.blue);
        navyblueimageview=(ImageView)findViewById(R.id.navyblue);
        blackimageview=(ImageView)findViewById(R.id.black);
        whiteimageview=(ImageView)findViewById(R.id.white);
        grayimageview=(ImageView)findViewById(R.id.gray);
        yellowimageview=(ImageView)findViewById(R.id.yellow);
        greenimageview=(ImageView)findViewById(R.id.green);
        brownimageview=(ImageView)findViewById(R.id.brown);
        indigoimageview=(ImageView)findViewById(R.id.indigo);
        violetimageview=(ImageView)findViewById(R.id.violet);
        orangeimageview=(ImageView)findViewById(R.id.orange);

        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        if(view.getId()==R.id.red){
            redImageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.blue){
            blueimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.violet){
            violetimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.yellow){
            yellowimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.navyblue){
            navyblueimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.gray){
            grayimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.orange){
            orangeimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.black){
            blackimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.white){
            whiteimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.brown){
            brownimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.green){
            greenimageview.startAnimation(myAnim);
        }
        if(view.getId()==R.id.indigo){
            indigoimageview.startAnimation(myAnim);
        }
    }

    public void music(View view){
        Intent intent=new Intent(ColorActivity.this,ColorSecondActivity.class);
        startActivity(intent);
    }

}
