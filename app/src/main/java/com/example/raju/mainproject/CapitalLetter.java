package com.example.raju.mainproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CapitalLetter extends AppCompatActivity {

    MediaPlayer  a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_letter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        a=MediaPlayer.create(CapitalLetter.this,R.raw.a);
        b=MediaPlayer.create(CapitalLetter.this,R.raw.b);


    }
    public  void capitall(View view){
        if(view.getId()==R.id.A){
            a.start();
        }
        if(view.getId()==R.id.B){
            b.start();
        }
    }
    protected void onPause(){
        super.onPause();
        a.release();
        b.release();

    }

}
