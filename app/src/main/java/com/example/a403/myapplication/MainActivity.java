package com.example.a403.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Chronometer chro1;
    Button start,finish;
    RadioButton calen,time;
    FrameLayout l1;
    CalendarView date;
    TimePicker timeview;
    TextView result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chro1=(Chronometer)findViewById(R.id.chronometer1);
        start=(Button) findViewById(R.id.button);
        finish=(Button) findViewById(R.id.button2);
        calen=(RadioButton)findViewById(R.id.radioButton);
        time=(RadioButton)findViewById(R.id.radioButton2);
        l1=(FrameLayout)findViewById(R.id.l1);
        date=(CalendarView)findViewById(R.id.calendarView);
        timeview=(TimePicker)findViewById(R.id.timePicker);
        result=( TextView)findViewById(R.id.textView);



        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chro1.start();
            }
        });

          calen.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  l1.setVisibility(View.VISIBLE);
                  date.setVisibility(View.VISIBLE);
                  timeview.setVisibility(View.INVISIBLE);

              }
          });

          time.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  l1.setVisibility(View.VISIBLE);
                  date.setVisibility(View.INVISIBLE);
                  timeview.setVisibility(View.VISIBLE);
              }
          });


    }
}
