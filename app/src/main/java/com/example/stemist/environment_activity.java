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
    CheckBox Q1O2;
    CheckBox Q1O3;

    TextView Feedback2;
    CheckBox Q2O1;
    CheckBox Q2O2;
    CheckBox Q2O3;

    TextView Feedback3;
    CheckBox Q3O1;
    CheckBox Q3O2;
    CheckBox Q3O3;

    TextView Feedback4;
    CheckBox Q4O1;
    CheckBox Q4O2;
    CheckBox Q4O3;

    TextView Feedback5;
    CheckBox Q5O1;
    CheckBox Q5O2;
    CheckBox Q5O3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environment);

        //Question 1
        Feedback1 = (TextView)findViewById(R.id.fb1);
        Feedback1.setVisibility(View.GONE);
        Q1O1 = (CheckBox) findViewById(R.id.checkBox2);
        Q1O2 = (CheckBox) findViewById(R.id.checkBox3);
        Q1O3 = (CheckBox) findViewById(R.id.checkBox4);

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

        Q1O2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q1O2.isChecked()) {
                    Feedback1.setVisibility(View.VISIBLE);
                }
                if(Q1O2.isChecked() == false) {
                    Feedback1.setVisibility(View.GONE);
                }
            }
        });

        Q1O3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q1O3.isChecked()) {
                    Feedback1.setVisibility(View.VISIBLE);
                }
                if(Q1O3.isChecked() == false) {
                    Feedback1.setVisibility(View.GONE);
                }
            }
        });


        //Question 2
        Feedback2 = (TextView)findViewById(R.id.fb2);
        Feedback2.setVisibility(View.GONE);
        Q2O1 = (CheckBox) findViewById(R.id.checkBox8);
        Q2O2 = (CheckBox) findViewById(R.id.checkBox10);
        Q2O3 = (CheckBox) findViewById(R.id.checkBox11);

        Q2O1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q2O1.isChecked()) {
                    Feedback2.setVisibility(View.VISIBLE);
                }
                if(Q2O1.isChecked() == false) {
                    Feedback2.setVisibility(View.GONE);
                }
            }
        });

        Q2O2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q2O2.isChecked()) {
                    Feedback2.setVisibility(View.VISIBLE);
                }
                if(Q2O2.isChecked() == false) {
                    Feedback2.setVisibility(View.GONE);
                }
            }
        });

        Q2O3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q2O3.isChecked()) {
                    Feedback2.setVisibility(View.VISIBLE);
                }
                if(Q2O3.isChecked() == false) {
                    Feedback2.setVisibility(View.GONE);
                }
            }
        });

        //Question 3
        Feedback3 = (TextView)findViewById(R.id.fb3);
        Feedback3.setVisibility(View.GONE);
        Q3O1 = (CheckBox) findViewById(R.id.checkBox12);
        Q3O2 = (CheckBox) findViewById(R.id.checkBox13);
        Q3O3 = (CheckBox) findViewById(R.id.checkBox14);

        Q3O1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q3O1.isChecked()) {
                    Feedback3.setVisibility(View.VISIBLE);
                }
                if(Q3O1.isChecked() == false) {
                    Feedback3.setVisibility(View.GONE);
                }
            }
        });

        Q3O2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q3O2.isChecked()) {
                    Feedback3.setVisibility(View.VISIBLE);
                }
                if(Q3O2.isChecked() == false) {
                    Feedback3.setVisibility(View.GONE);
                }
            }
        });

        Q3O3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q3O3.isChecked()) {
                    Feedback3.setVisibility(View.VISIBLE);
                }
                if(Q3O3.isChecked() == false) {
                    Feedback3.setVisibility(View.GONE);
                }
            }
        });


        //Question 4
        Feedback4 = (TextView)findViewById(R.id.fb4);
        Feedback4.setVisibility(View.GONE);
        Q4O1 = (CheckBox) findViewById(R.id.checkBox15);
        Q4O2 = (CheckBox) findViewById(R.id.checkBox16);
        Q4O3 = (CheckBox) findViewById(R.id.checkBox17);

        Q4O1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q4O1.isChecked()) {
                    Feedback4.setVisibility(View.VISIBLE);
                }
                if(Q4O1.isChecked() == false) {
                    Feedback4.setVisibility(View.GONE);
                }
            }
        });

        Q4O2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q4O2.isChecked()) {
                    Feedback4.setVisibility(View.VISIBLE);
                }
                if(Q4O2.isChecked() == false) {
                    Feedback4.setVisibility(View.GONE);
                }
            }
        });

        Q4O3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q4O3.isChecked()) {
                    Feedback4.setVisibility(View.VISIBLE);
                }
                if(Q4O3.isChecked() == false) {
                    Feedback4.setVisibility(View.GONE);
                }
            }
        });


        //Question 5
        Feedback5 = (TextView)findViewById(R.id.fb5);
        Feedback5.setVisibility(View.GONE);
        Q5O1 = (CheckBox) findViewById(R.id.checkBox18);
        Q5O2 = (CheckBox) findViewById(R.id.checkBox19);
        Q5O3 = (CheckBox) findViewById(R.id.checkBox20);

        Q5O1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q5O1.isChecked()) {
                    Feedback5.setVisibility(View.VISIBLE);
                }
                if(Q5O1.isChecked() == false) {
                    Feedback5.setVisibility(View.GONE);
                }
            }
        });

        Q5O2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q5O2.isChecked()) {
                    Feedback5.setVisibility(View.VISIBLE);
                }
                if(Q5O2.isChecked() == false) {
                    Feedback5.setVisibility(View.GONE);
                }
            }
        });

        Q5O3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Q5O3.isChecked()) {
                    Feedback5.setVisibility(View.VISIBLE);
                }
                if(Q5O3.isChecked() == false) {
                    Feedback5.setVisibility(View.GONE);
                }
            }
        });

    }
}