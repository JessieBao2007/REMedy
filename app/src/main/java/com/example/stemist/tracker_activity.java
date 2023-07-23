package com.example.stemist;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.graphics.Color;
import android.os.Bundle;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

import android.os.Bundle;

public class tracker_activity extends AppCompatActivity {
    private Button button;
    private TableLayout tableLayout;
    private EditText userInputhoursstart;
    private EditText userInputhoursend;
    private LinearLayout DayTables;
    private Button daybutton;
    private int DayCount = 1;
    int Hourscalc=0;
    private ArrayList<Entry> entries = new ArrayList<>();
    private LineChart lineChart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        lineChart = findViewById(R.id.lineChart);



        DayTables = findViewById(R.id.DayTables);
        daybutton=(Button)findViewById(R.id.finalday);
        daybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewTable();
            }
        });
        userInputhoursstart = findViewById(R.id.userInpuths);
        userInputhoursend = findViewById(R.id.userInputhe);
        tableLayout = findViewById(R.id.tableinput);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });



    }



    public void openActivity2(){
        if (tableLayout.getVisibility() == View.VISIBLE) {
            tableLayout.setVisibility(View.GONE);
        }
        else {
            tableLayout.setVisibility(View.VISIBLE);
        }
    }

    //DONE BUTTON
    public void openNewTable() {
        createNewTable();
        tableLayout.setVisibility(View.GONE);
    }



    //USER INPUT
    public void userInputTable(View view) {
        String hoursstart = userInputhoursstart.getText().toString();
        TableRow row = new TableRow(this);
        TextView textView = new TextView(this);
        textView.setText(hoursstart);
        row.addView(textView);


        tableLayout.addView(row);


        String hoursend = userInputhoursend.getText().toString();
        TableRow row2 = new TableRow(this);
        TextView textView2 = new TextView(this);
        textView.setText(hoursend);
        row.addView(textView);


        tableLayout.addView(row);

       /*try{
           int hoursstartint = Integer.parseInt(hoursstart);
           int hoursendint = Integer.parseInt(hoursend);
           int totalHours = Math.abs(hoursendint-hoursstartint);
           Hourscalc=totalHours;
       }
       catch (NumberFormatException e) {
           // Handle any invalid input (e.g., non-numeric characters)
           Toast.makeText(this, "Invalid input. Please enter valid integers.", Toast.LENGTH_SHORT).show();
       }*/
    }



    //CALC NEW NUM


    //ADD NEW TABLE
    private void createNewTable() {
        long hours = 0;
        long leftovermin = 0;

        long min;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date starting = sdf.parse(userInputhoursstart.getText().toString());
            Date ending = sdf.parse(userInputhoursend.getText().toString());

            if (starting.after(ending)) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(ending);
                calendar.add(Calendar.HOUR_OF_DAY, 24);
                ending = calendar.getTime();
            }

            long totalDifference = Math.abs(ending.getTime() - starting.getTime());
            min = totalDifference / (60 * 1000);

            hours = min / 60;
            leftovermin = min % 60;

        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error parsing time.", Toast.LENGTH_SHORT).show();
            return;
        }

        TableLayout newTableLayout = new TableLayout(this);
        newTableLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        TableRow row1 = new TableRow(this);
        row1.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT

        ));

        TextView dayText = new TextView(this);
        dayText.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));
        dayText.setHint("Day " + Integer.toString(DayCount));
        row1.addView(dayText);
        newTableLayout.addView(row1);

        TableRow row2 = new TableRow(this);
        row2.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));

        TextView startingTime = new TextView(this);
        startingTime.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));
        startingTime.setHint("Slept At: " + userInputhoursstart.getText().toString());
        row2.addView(startingTime);
        newTableLayout.addView(row2);

        TableRow row3 = new TableRow(this);
        row3.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));

        TextView endingTime = new TextView(this);
        endingTime.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));
        endingTime.setHint("Woke Up: " + userInputhoursend.getText().toString());
        row3.addView(endingTime);
        newTableLayout.addView(row3);


        TableRow row4 = new TableRow(this);
        row4.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));

        TextView editTime = new TextView(this);
        editTime.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));
        editTime.setHint(String.valueOf(hours) + " hours and " + String.valueOf(leftovermin) + " minutes");
        row4.addView(editTime);
        newTableLayout.addView(row4);


        TableRow row5 = new TableRow(this);
        row5.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));

        TextView calculatedamount = new TextView(this);
        calculatedamount.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));
        double intValue = ((int) min) * 0.20;
        calculatedamount.setHint("Deep Sleep Minutes: " +  String.valueOf(Math.round(intValue)));
        row5.addView(calculatedamount);
        newTableLayout.addView(row5);





        TableRow blank = new TableRow(this);
        blank.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));

        TextView blanktext = new TextView(this);
        blanktext.setLayoutParams(new TableRow.LayoutParams(
                0,
                TableRow.LayoutParams.WRAP_CONTENT,
                1.0f
        ));

        blank.addView(blanktext);
        newTableLayout.addView(blank);




        DayTables.addView(newTableLayout);
        DayCount++;
        entries.add(new Entry(DayCount-1, hours));
        LineDataSet dataSet = new LineDataSet(entries, "Minutes Slept");

        dataSet.setColor(Color.BLUE);
        dataSet.setValueTextColor(Color.RED);

        LineData lineData = new LineData(dataSet);

        lineChart.setData(lineData);
        lineChart.invalidate();



    }
}
