package com.example.stemist;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class challenge_activity2 extends AppCompatActivity {

    /* Hydration: 5 points
     * Caffeine: 8 points
     * Electronics: 10 points
     * Snacks: 5 points
     * Environment: 3 points
     * Walk: 10 points
     * Journal: 3 points
     * Audiobook: 3 points
     *
     */

    public int score;
    TextView displayscore;
    Button water,caffeine,electro, snack, space, walk, journal, audiobook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge2);


        displayscore=(TextView)findViewById(R.id.testingtexts);
        water=(Button)findViewById(R.id.waterbtn);
        caffeine=(Button)findViewById(R.id.caffeinebtn);
        electro=(Button)findViewById(R.id.digitalbtn);
        snack=(Button)findViewById(R.id.snackbtn);
        space=(Button)findViewById(R.id.spacebtn);
        walk=(Button)findViewById(R.id.walkbtn);
        journal=(Button)findViewById(R.id.journalbtn);
        audiobook=(Button)findViewById(R.id.audiobookbtn);

        water.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                score+=5;
                displayscore.setText(Integer.toString(score));
            }
        });

        caffeine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                score+=8;
                displayscore.setText(Integer.toString(score));
            }
        });

        electro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                score+=10;
                displayscore.setText(Integer.toString(score));
            }
        });


        snack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                score+=5;
                displayscore.setText(Integer.toString(score));
            }
        });

        space.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                score+=3;
                displayscore.setText(Integer.toString(score));
            }
        });

        walk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                score+=10;
                displayscore.setText(Integer.toString(score));
            }
        });

        journal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                score+=3;
                displayscore.setText(Integer.toString(score));
            }
        });

        audiobook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                score+=3;
                displayscore.setText(Integer.toString(score));
            }
        });


    }
}