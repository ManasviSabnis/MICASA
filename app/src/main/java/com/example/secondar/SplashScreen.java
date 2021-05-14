package com.example.secondar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler;
import android.widget.VideoView;

public class SplashScreen extends AppCompatActivity {
    VideoView videoView;
    private long delayMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        videoView = (VideoView) findViewById(R.id.videoView);
        String videoPath = new StringBuilder("android.resource://")
                .append(getPackageName())
                .append("/raw/splash")
                .toString();
        videoView.setVideoPath(videoPath);

        //Event

        videoView.setOnCompletionListener((mediaPlayer) -> {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(SplashScreen.this, Screen.class));
                    finish();
                }
            },delayMillis); // Wait 500miliseconds before start new activity
        });

        videoView.start();
    }
}

