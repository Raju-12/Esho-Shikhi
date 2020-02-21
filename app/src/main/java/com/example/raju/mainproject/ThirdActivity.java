package com.example.raju.mainproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       // cardView=(CardView)findViewById(R.id.banglaId);

    }
    public void pora(View view){
        Intent intent=new Intent(ThirdActivity.this,BanglaActivity.class);
        startActivity(intent);
    }
    public  void english(View view){
        Intent intent=new Intent(ThirdActivity.this,EnglishLearn.class);
        startActivity(intent);
    }
    public void math(View view){
        Intent intent=new Intent(ThirdActivity.this,MathActivity.class);
        startActivity(intent);
    }

}
