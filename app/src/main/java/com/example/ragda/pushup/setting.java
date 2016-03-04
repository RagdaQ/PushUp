package com.example.ragda.pushup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class setting extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter4;

    Button change_color ,add_pin,daily_reminder,delete_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        change_color=(Button)findViewById(R.id.button22);
        change_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), color_theme.class);
                startActivity(i);
            }
        });
        add_pin=(Button)findViewById(R.id.button23);
        add_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),pin_code.class);
                startActivity(i);
            }
        });
        daily_reminder=(Button)findViewById(R.id.button24);
        daily_reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),reminder.class);
                startActivity(i);
            }
        });
        delete_account=(Button)findViewById(R.id.button25);
        delete_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        spinner = (Spinner) findViewById(R.id.spinner4);
        adapter4 = ArrayAdapter.createFromResource(this, R.array.language, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter4);

    }
}
