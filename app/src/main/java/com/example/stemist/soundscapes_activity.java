package com.example.stemist;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class soundscapes_activity extends AppCompatActivity {
    MediaPlayer player1;
    MediaPlayer player2;
    MediaPlayer player3;
    MediaPlayer player4;
    MediaPlayer player5;
    MediaPlayer player6;
    MediaPlayer player7;
    MediaPlayer player8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundscapes);
    }
    public void play1(View v) {
        if(player1 == null){
            System.out.println("if works");
            player1 = MediaPlayer.create(this, R.raw.whitenoise1);
            player1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer1();
                }
            });
        }
        player1.start();
        System.out.println("Click works");
    }

    public void play2(View v) {
        if(player2 == null){
            player2 = MediaPlayer.create(this, R.raw.stream1);
            player2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer2();
                }
            });
        }
        player2.start();
    }
    public void play3(View v) {
        if(player3 == null){
            player3 = MediaPlayer.create(this, R.raw.birdnoise);
            player3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer3();
                }
            });
        }
        player3.start();
    }

    public void play4(View v) {
        if(player4 == null){
            player4 = MediaPlayer.create(this, R.raw.waves1);
            player4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer4();
                }
            });
        }
        player4.start();
    }

    public void play5(View v) {
        if(player5 == null){
            player5 = MediaPlayer.create(this, R.raw.firenoise);
            player5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer5();
                }
            });
        }
        player5.start();
    }

    public void play6(View v) {
        if(player6 == null){
            player6 = MediaPlayer.create(this, R.raw.citynoise);
            player6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer6();
                }
            });
        }
        player6.start();
    }

    public void play7(View v) {
        if(player7 == null){
            player7 = MediaPlayer.create(this, R.raw.wind);
            player7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer7();
                }
            });
        }
        player7.start();
    }

    public void play8(View v) {
        if(player8 == null){
            player8 = MediaPlayer.create(this, R.raw.underwater);
            player8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer8();
                }
            });
        }
        player8.start();
    }

    public void stop1(View v){
        stopPlayer1();
    }
    public void stop2(View v){
        stopPlayer2();
    }
    public void stop3(View v){ stopPlayer3(); }
    public void stop4(View v){ stopPlayer4(); }
    public void stop5(View v){ stopPlayer5(); }
    public void stop6(View v){ stopPlayer6(); }
    public void stop7(View v){ stopPlayer7(); }
    public void stop8(View v){ stopPlayer8(); }

    private void stopPlayer1() {
        if(player1 != null){
            player1.release();
            player1 = null;
        }
    }
    private void stopPlayer2() {
        if(player2 != null){
            player2.release();
            player2 = null;
        }
    }
    private void stopPlayer3() {
        if(player3 != null){
            player3.release();
            player3 = null;
        }
    }
    private void stopPlayer4() {
        if(player4 != null){
            player4.release();
            player4 = null;
        }
    }
    private void stopPlayer5() {
        if(player5 != null){
            player5.release();
            player5 = null;
        }
    }
    private void stopPlayer6() {
        if(player6 != null){
            player6.release();
            player6 = null;
        }
    }
    private void stopPlayer7() {
        if(player7 != null){
            player7.release();
            player7 = null;
        }
    }
    private void stopPlayer8() {
        if(player8 != null){
            player8.release();
            player8 = null;
        }
    }
    @Override
    protected void onStop(){
        super.onStop();
        stopPlayer1();
        stopPlayer2();
        stopPlayer3();
        stopPlayer4();
        stopPlayer5();
        stopPlayer6();
        stopPlayer7();
        stopPlayer8();
    }
}