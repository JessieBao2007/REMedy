package com.example.stemist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ChallengeButton;
    private Button LeaderboardButton;
    private Button TrackerButton;
    private Button EnvironmentButton;
    private Button SoundscapesButton;
    private Button TipsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChallengeButton = (Button) findViewById(R.id.ChallengeButton);
        ChallengeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChallenge();
            }
        });

        LeaderboardButton = (Button) findViewById(R.id.LeaderboardButton);
        LeaderboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLeaderboard();
            }
        });

        TrackerButton = (Button) findViewById(R.id.TrackerButton);
        TrackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTracker();
            }
        });

        EnvironmentButton = (Button) findViewById(R.id.EnvironmentButton);
        EnvironmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEnvironment();
            }
        });

        SoundscapesButton = (Button) findViewById(R.id.SoundscapesButton);
        SoundscapesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSoundscapes();
            }
        });

        TipsButton = (Button) findViewById(R.id.TipsButton);
        TipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTips();
            }
        });
    }

    public void openChallenge() {
        Intent intent = new Intent(this, challenge_activity2.class);
        startActivity(intent);
    }

    public void openLeaderboard() {
        Intent intent = new Intent(this, leaderboard_activity.class);
        startActivity(intent);
    }

    public void openTracker() {
        Intent intent = new Intent(this, tracker_activity.class);
        startActivity(intent);
    }

    public void openEnvironment() {
        Intent intent = new Intent(this, environment_activity.class);
        startActivity(intent);
    }

    public void openSoundscapes() {
        Intent intent = new Intent(this, soundscapes_activity.class);
        startActivity(intent);
    }

    public void openTips() {
        Intent intent = new Intent(this, tips_activities.class);
        startActivity(intent);
    }
}