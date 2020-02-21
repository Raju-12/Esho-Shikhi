package com.example.raju.mainproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimalActivity extends AppCompatActivity {

    ImageView tigerimg,lionimg,foximg,bearimg,dogimg,elephantimg,catimg,cowimg,henimg,frogimg,monkeyimg,goatimg,mouseimg,gonderimg,
            duckimg,snakeimg,hyenaimg,zebraimg,mohishimg,veraimg,horseimg,nekreimg;
    MediaPlayer tiger,lion,fox,bear,dog,elephant,cat,cow,hen,frog,monkey,goat,mouse,gonder,duck,snake,hyena,zebra,mohish,
            vera,nekre,horse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //---------- sound-----------//
        tiger=MediaPlayer.create(AnimalActivity.this,R.raw.tiger);
        lion=MediaPlayer.create(AnimalActivity.this,R.raw.lion);
        fox=MediaPlayer.create(AnimalActivity.this,R.raw.fox);
        bear=MediaPlayer.create(AnimalActivity.this,R.raw.bear);
        dog=MediaPlayer.create(AnimalActivity.this,R.raw.dog);
        elephant=MediaPlayer.create(AnimalActivity.this,R.raw.elephant);
        hen=MediaPlayer.create(AnimalActivity.this,R.raw.hen);
        frog=MediaPlayer.create(AnimalActivity.this,R.raw.frog);
        monkey=MediaPlayer.create(AnimalActivity.this,R.raw.monkey);
        goat=MediaPlayer.create(AnimalActivity.this,R.raw.goat);
        mouse=MediaPlayer.create(AnimalActivity.this,R.raw.mouse);
        duck=MediaPlayer.create(AnimalActivity.this,R.raw.duck);
        snake=MediaPlayer.create(AnimalActivity.this,R.raw.snake);
        hyena=MediaPlayer.create(AnimalActivity.this,R.raw.hyena);
        zebra=MediaPlayer.create(AnimalActivity.this,R.raw.zebra);
        mohish=MediaPlayer.create(AnimalActivity.this,R.raw.buffalo);
        vera=MediaPlayer.create(AnimalActivity.this,R.raw.vera);
        gonder=MediaPlayer.create(AnimalActivity.this,R.raw.rhinoceros);
        nekre=MediaPlayer.create(AnimalActivity.this,R.raw.wolf);
        horse=MediaPlayer.create(AnimalActivity.this,R.raw.horse);
        cow=MediaPlayer.create(AnimalActivity.this,R.raw.cow);
        cat=MediaPlayer.create(AnimalActivity.this,R.raw.cat);

    }
    public void hunt(View view){

        //-------------animation start--------------//
        tigerimg=(ImageView)findViewById(R.id.tiger);
        nekreimg=(ImageView)findViewById(R.id.nekre);
        lionimg=(ImageView)findViewById(R.id.lion);
        foximg=(ImageView)findViewById(R.id.fox);
        bearimg=(ImageView)findViewById(R.id.bear);
        dogimg=(ImageView)findViewById(R.id.dog);
        elephantimg=(ImageView)findViewById(R.id.hati);
        catimg=(ImageView)findViewById(R.id.biral);
        cowimg=(ImageView)findViewById(R.id.garu);
        henimg=(ImageView)findViewById(R.id.murgi);
        frogimg=(ImageView)findViewById(R.id.bang);
        monkeyimg=(ImageView)findViewById(R.id.banor);
        goatimg=(ImageView)findViewById(R.id.chagol);
        mouseimg=(ImageView)findViewById(R.id.eidur);
        gonderimg=(ImageView)findViewById(R.id.gonder);
        duckimg=(ImageView)findViewById(R.id.hash);
        snakeimg=(ImageView)findViewById(R.id.sap);
        hyenaimg=(ImageView)findViewById(R.id.hyena);
        zebraimg=(ImageView)findViewById(R.id.zebra);
        mohishimg=(ImageView)findViewById(R.id.mohish);
        veraimg=(ImageView)findViewById(R.id.vera);
        horseimg=(ImageView)findViewById(R.id.horse);

        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);


        if(view.getId()==R.id.horse){
            horseimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.tiger){
            tigerimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.lion){
            lionimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.bear){
            bearimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.fox){
            foximg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.chagol){
            goatimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.vera){
            veraimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.gonder){
            gonderimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.hyena){
            hyenaimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.garu){
            cowimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.mohish){
            mohishimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.biral){
            catimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.hash){
            duckimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.murgi){
            henimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.zebra){
            zebraimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.hati){
            elephantimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.eidur){
            mouseimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.sap){
            snakeimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.bang){
            frogimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.dog){
            dogimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.nekre){
            nekreimg.startAnimation(myAnim);
        }
        if(view.getId()==R.id.banor){
            monkeyimg.startAnimation(myAnim);
        }

//-------------animation end---------------//



    //--------------sound--------------//

        if(view.getId()==R.id.tiger){
            tiger.start();
        }
        if(view.getId()==R.id.lion){
            lion.start();
        }
        if(view.getId()==R.id.bear){
            bear.start();
        }
        if(view.getId()==R.id.hati){
            elephant.start();
        }
        if(view.getId()==R.id.nekre){
            nekre.start();
        }
        if(view.getId()==R.id.hyena){
            hyena.start();
        }
        if(view.getId()==R.id.gonder){
            gonder.start();
        }
        if(view.getId()==R.id.mohish){
            mohish.start();
        }
        if(view.getId()==R.id.banor){
            monkey.start();
        }
        if(view.getId()==R.id.biral){
            cat.start();
        }
        if(view.getId()==R.id.garu){
            cow.start();
        }
        if(view.getId()==R.id.chagol){
            goat.start();
        }
        if(view.getId()==R.id.murgi){
            hen.start();
        }
        if(view.getId()==R.id.sap){
            snake.start();
        }
        if(view.getId()==R.id.vera){
            vera.start();
        }
        if(view.getId()==R.id.dog){
            dog.start();
        }
        if(view.getId()==R.id.fox){
            fox.start();
        }
        if(view.getId()==R.id.eidur){
            mouse.start();
        }
        if(view.getId()==R.id.bang){
            frog.start();
        }
        if(view.getId()==R.id.zebra){
            zebra.start();
        }
        if(view.getId()==R.id.horse){
            horse.start();
        }
        if(view.getId()==R.id.hash){
            duck.start();
        }
    }
    protected void onPause(){
        super.onPause();
        tiger.release();
        lion.release();
        zebra.release();
        elephant.release();
        hyena.release();
        gonder.release();
        nekre.release();
        goat.release();
        vera.release();
        bear.release();
        horse.release();
        zebra.release();
        monkey.release();
        frog.release();
        cow.release();
        mohish.release();
        mouse.release();
        fox.release();
        snake.release();
        dog.release();
        cat.release();
        duck.release();
        hen.release();
    }

}
