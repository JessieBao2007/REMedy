package com.example.stemist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class environment_activity extends AppCompatActivity {

    TextView Feedback1;
    CheckBox Q1O1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environment);

        Feedback1 = (TextView)findViewById(R.id.fb1);
        Feedback1.setVisibility(View.GONE);
        Q1O1 = (CheckBox) findViewById(R.id.checkBox2);

        Q1O1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q1O1.isChecked()) {
                    Feedback1.setVisibility(View.VISIBLE);
                }
                if(Q1O1.isChecked() == false) {
                    Feedback1.setVisibility(View.GONE);
                }
            }
        });
    }
}