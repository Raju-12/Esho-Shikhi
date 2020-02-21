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

public class BirdActivity extends AppCompatActivity {

    ImageView duelimg,bokimg,kobutorimg,moynaimg,babuiimg,kokilimg,pechaimg,tutaimg,tiyaimg,shaamaimg,
            mayurimg,machranggaimg,kakimg, guguimg,kattukraimg,bulbuliimg,choroiimg,tuntuniimg,eigleimg;


    MediaPlayer duels,boks,kobutors,eigle,babui,pecha,tuntuni,tiya,tuta,shaama,moyna,mayur,
            machrangga,kokil,kak,gugu,kattukra,bulbuli,choroi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        duels=MediaPlayer.create(BirdActivity.this,R.raw.duel);
        boks=MediaPlayer.create(BirdActivity.this,R.raw.bok);
        kobutors=MediaPlayer.create(BirdActivity.this,R.raw.kobutor);
        babui=MediaPlayer.create(BirdActivity.this,R.raw.babui);
        eigle=MediaPlayer.create(BirdActivity.this,R.raw.eagle);
        moyna=MediaPlayer.create(BirdActivity.this,R.raw.mayna);
        pecha=MediaPlayer.create(BirdActivity.this,R.raw.pecha);
        tuntuni=MediaPlayer.create(BirdActivity.this,R.raw.tuntuni);
        tiya=MediaPlayer.create(BirdActivity.this,R.raw.tiya);
        tuta=MediaPlayer.create(BirdActivity.this,R.raw.tuta);
        shaama=MediaPlayer.create(BirdActivity.this,R.raw.shama);
        mayur=MediaPlayer.create(BirdActivity.this,R.raw.mayur);
        machrangga=MediaPlayer.create(BirdActivity.this,R.raw.machranga);
        kokil=MediaPlayer.create(BirdActivity.this,R.raw.kokil);
        kak=MediaPlayer.create(BirdActivity.this,R.raw.kak);
        gugu=MediaPlayer.create(BirdActivity.this,R.raw.ghughu);
        kattukra=MediaPlayer.create(BirdActivity.this,R.raw.kattukra);
        bulbuli=MediaPlayer.create(BirdActivity.this,R.raw.bulbuli);
        choroi=MediaPlayer.create(BirdActivity.this,R.raw.coroi);


    }
    public void bird(View view){

        duelimg=(ImageView)findViewById(R.id.duel);
        bokimg=(ImageView)findViewById(R.id.bok);
        kobutorimg=(ImageView)findViewById(R.id.kobutor);
        moynaimg=(ImageView)findViewById(R.id.moyna);
        pechaimg=(ImageView)findViewById(R.id.pecha);
        tuntuniimg=(ImageView)findViewById(R.id.tuntuni);
        tiyaimg=(ImageView)findViewById(R.id.tiya);
        tutaimg=(ImageView)findViewById(R.id.tuta);
        shaamaimg=(ImageView)findViewById(R.id.shama);
        mayurimg=(ImageView)findViewById(R.id.mayur);
        machranggaimg=(ImageView)findViewById(R.id.machranga);
        kakimg=(ImageView)findViewById(R.id.kak);
        guguimg=(ImageView)findViewById(R.id.ghughu);
        kattukraimg=(ImageView)findViewById(R.id.kattukra);
        babuiimg=(ImageView)findViewById(R.id.babui);
        choroiimg=(ImageView)findViewById(R.id.choroi);
        bulbuliimg=(ImageView)findViewById(R.id.bulbuli);
       kokilimg=(ImageView)findViewById(R.id.kokil);
       eigleimg=(ImageView)findViewById(R.id.eigle);


        final Animation MyAnim= AnimationUtils.loadAnimation(this,R.anim.bounce);
        MyBounceInterpolator interpolator=new MyBounceInterpolator(0.2,20);
        MyAnim.setInterpolator(interpolator);
        //----------------animation-------------//
        if(view.getId()==R.id.duel){
            duelimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.bok){
            bokimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.kobutor){
            kobutorimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.moyna){
            moynaimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.eigle){
            eigleimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.pecha){
            pechaimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.tuta){
            tutaimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.tiya){
            tiyaimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.shama){
            shaamaimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.mayur){
            mayurimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.machranga){
            machranggaimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.kak){
            kakimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.ghughu){
           guguimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.kattukra){
            kattukraimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.babui){
            babuiimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.choroi){
            choroiimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.tuntuni){
            tuntuniimg.startAnimation(MyAnim);
        }
        if(view.getId()==R.id.kokil){
            kokilimg.startAnimation(MyAnim);
        }

        //--------------sound-------------//

        if(view.getId()==R.id.duel){
            duels.start();
        }
        if(view.getId()==R.id.bok){
            boks.start();
        }
        if(view.getId()==R.id.kobutor){
            kobutors.start();
        }
        if(view.getId()==R.id.eigle){
            eigle.start();
        }
        if(view.getId()==R.id.babui){
            babui.start();
        }
        if(view.getId()==R.id.pecha){
            pecha.start();
        }
        if(view.getId()==R.id.tuta){
            tuta.start();
        }
        if(view.getId()==R.id.tiya){
            tiya.start();
        }
        if(view.getId()==R.id.shama){
           shaama.start();
        }
        if(view.getId()==R.id.moyna){
            moyna.start();
        }
        if(view.getId()==R.id.mayur){
            mayur.start();
        }
        if(view.getId()==R.id.machranga){
            machrangga.start();
        }
        if(view.getId()==R.id.kak){
           kak.start();
        }
        if(view.getId()==R.id.ghughu){
            gugu.start();
        }
        if(view.getId()==R.id.kattukra){
            kattukra.start();
        }
        if(view.getId()==R.id.choroi){
            choroi.start();
        }
        if(view.getId()==R.id.tuntuni){
            tuntuni.start();
        }
        if(view.getId()==R.id.bulbuli){
            bulbuli.start();
        }
        if(view.getId()==R.id.kokil){
            kokil.start();
        }

    }
    protected void onPause(){
        super.onPause();
        duels.release();
        boks.release();
        kobutors.release();
        pecha.release();
        tuta.release();
        tiya.release();
        shaama.release();
        moyna.release();
        mayur.release();
        machrangga.release();
        kak.release();
        gugu.release();
        kattukra.release();
        babui.release();
        choroi.release();
        tuntuni.release();
        bulbuli.release();
        kokil.release();
        eigle.release();
    }

}
