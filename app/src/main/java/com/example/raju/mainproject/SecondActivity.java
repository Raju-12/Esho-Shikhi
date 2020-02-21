package com.example.raju.mainproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SecondActivity extends AppCompatActivity {


    CardView cardView1,cardViewcolor;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cardView1=(CardView)findViewById(R.id.study);
        cardViewcolor=(CardView)findViewById(R.id.colorId);


    }
    public  void second(View view){
        Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
        startActivity(intent);
    }

    public void color(View view){
        Intent intent=new Intent(SecondActivity.this,ColorActivity.class);
        startActivity(intent);
    }
    public  void animalworlrd(View view){
        Intent intent=new Intent(SecondActivity.this,AnimalWorld.class);
        startActivity(intent);
    }
    public  void folmul(View view){
        Intent intent=new Intent(SecondActivity.this,FruitsActivity.class);
        startActivity(intent);
    }
    public void play(View view){
       Intent intent=new Intent(SecondActivity.this,PlayActivity.class);
        startActivity(intent);
    }

}
