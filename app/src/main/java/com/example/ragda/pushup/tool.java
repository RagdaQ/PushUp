package com.example.ragda.pushup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tool extends AppCompatActivity {

    Button search , staticly,excel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool);

        search=(Button)findViewById(R.id.button29);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),search_income_expense.class);
                startActivity(i);
            }
        });
        staticly=(Button)findViewById(R.id.button30);
        staticly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),staticlly.class);
                startActivity(i);
            }
        });
        excel=(Button)findViewById(R.id.button31);
        excel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),excle.class);
                startActivity(i);
            }
        });
    }
}
