package com.example.ragda.pushup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class addincome extends AppCompatActivity {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addincome);

        EditText Amount =(EditText)findViewById(R.id.editText3);
        EditText Date =(EditText)findViewById(R.id.editText4);
        Button Done = (Button)findViewById(R.id.button20);

        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.ragda.pushup.income.class);
                startActivity(i);
            }
        });
        Switch switch1 = (Switch)findViewById(R.id.switch1);
        final Spinner repet_every = (Spinner)findViewById(R.id.spinner);
        spinner=(Spinner)findViewById(R.id.spinner);

        adapter = ArrayAdapter.createFromResource(this, R.array.repet_every, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked) {
                    Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(getApplicationContext(),"OFF",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
