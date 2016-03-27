package com.example.matt.audiotest;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AudioPlayer extends AppCompatActivity {

    MediaPlayer mySound;

    @Override
    protected void onPause() {
        super.onPause();
        mySound.release();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_player);
        mySound = MediaPlayer.create(this, R.raw.topbottem);
    }

    public void playSound(View view) {
        mySound.start();
    }
}
