package com.example.ragda.pushup;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.Toast;

public class calendar extends AppCompatActivity {
    CalendarView calendar;
ImageView setting , tool,user_profile,search,user_goal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendar = (CalendarView) findViewById(R.id.calendar);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
                Intent intent = new Intent(calendar.this, income.class);
                startActivity(intent);
            }
        });

         setting =(ImageView) findViewById(R.id.imageView4);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),setting.class);
                startActivity(i);
            }
        });
        tool =(ImageView) findViewById(R.id.imageView5);
        tool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),tool.class);
                startActivity(i);
            }
        });
        user_profile =(ImageView) findViewById(R.id.imageView19);
        user_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),user_profile.class);
                startActivity(i);
            }
        });
        search =(ImageView) findViewById(R.id.imageView20);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),search.class);
                startActivity(i);
            }
        });
        user_goal =(ImageView) findViewById(R.id.imageView21);
        user_goal.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(),user_goal.class);
        startActivity(i);
    }
});

    }
}
