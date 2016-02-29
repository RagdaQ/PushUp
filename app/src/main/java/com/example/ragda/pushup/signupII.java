package com.example.ragda.pushup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class signupII extends AppCompatActivity implements View.OnClickListener {
    Spinner spinnerHouse , spinnerTenure;
    Button signUp;
    EditText  numHouse ;

    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapter2;
    ArrayAdapter<CharSequence> adapter3;
    ArrayAdapter<CharSequence> adapter4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_ii);

        numHouse = (EditText) findViewById(R.id.numHouse);


        spinnerHouse = (Spinner) findViewById(R.id.spinnerHouse);
        adapter3 = ArrayAdapter.createFromResource(this, R.array.type_housing, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHouse.setAdapter(adapter3);


        spinnerTenure = (Spinner) findViewById(R.id.spinnerTenure);
        adapter4 = ArrayAdapter.createFromResource(this, R.array.tenure_housing, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTenure.setAdapter(adapter4);
        signUp=(Button)findViewById(R.id.SignUp);


        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.SignUp:
                startActivity(new Intent(this,signin.class));
                break;
        }}
    }

