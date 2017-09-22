package com.example.daniel.shamenun;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    private SoundPool mSoundPool;
    private int mShameID;
    private int mJustShameID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSoundPool = new SoundPool(2 , AudioManager.STREAM_MUSIC , 0 );
        mShameID = mSoundPool.load(getApplicationContext(), R.raw.gameofthrones_shame, 1);
        mJustShameID = mSoundPool.load(getApplicationContext(), R.raw.just_shame, 1);


    }

     public void PlayShameDing(View v){
         mSoundPool.stop(mShameID);
         mSoundPool.stop(mJustShameID);
         mSoundPool.play(mShameID, 1.0f, 1.0f, 0, 0, 1.0f);

     }

     public void JustPlayShame(View v){
         mSoundPool.stop(mShameID);
         mSoundPool.stop(mJustShameID);
         mSoundPool.play(mJustShameID, 1.0f, 1.0f, 0, 0, 1.0f);


     }









}







