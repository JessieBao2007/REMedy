package com.example.stemist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;
import android.content.SharedPreferences;

public class leaderboard_activity extends AppCompatActivity {

    TextView plantscore, infotext, statement;
    ImageView plant;
    int min=0;
    Button home;
    SharedPreferences sharing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);


        home=(Button)findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHome();
            }
        });

        sharing = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        min = sharing.getInt("MIN_VALUE", 0);

        int hours = min / 60;
        int minutes = min % 60;
        int score =challenge_activity2.getScore();

        infotext=(TextView)findViewById(R.id.infotext);
        infotext.setText("Over "+Integer.toString(tracker_activity.getDay())+" days, you have slept "+ Integer.toString(hours)+" hours and "+ Integer.toString(minutes)+" minutes");
        plantscore=(TextView)findViewById(R.id.scoretext);
        plantscore.setText("Score: "+ Integer.toString(challenge_activity2.getScore()));
        plant=(ImageView)findViewById(R.id.plantimg);
        statement=(TextView)findViewById(R.id.statement);
        statement.setText("Your plant has just sprouted, it needs more energy!");

        if (score>=13 && score<26 ){
            plant.setImageResource(R.drawable.plant2);
            statement.setText("Your plant is slowly growing, perhaps it needs a better enviroment...");
        }
        else if(score>=26&& score<39){
            plant.setImageResource(R.drawable.plant3);
            statement.setText("Your plant is growing more and more leaves, it's growing quicker than ever!");
        }
        else if(score>=39&&score<52){
            plant.setImageResource(R.drawable.plant4);
            statement.setText("Your plant is looking better and better! Keep up the good work!");
        }
        else if(score>=52){
            plant.setImageResource(R.drawable.plant5);
            statement.setText("Congratulations! Your hard work has payed off and your plant has finally blossomed!");
        }
    }

    public void openHome(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}