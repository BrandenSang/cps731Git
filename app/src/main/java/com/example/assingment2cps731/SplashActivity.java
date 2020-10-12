package com.example.assingment2cps731;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 5000;
    MediaPlayer mySong;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);

            mySong = new MediaPlayer();
            mySong = MediaPlayer.create(this, R.raw.splashintro);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                mySong.start();

                Intent mainIntent = new Intent(SplashActivity.this,ItemListActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();

                mySong.stop();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}

