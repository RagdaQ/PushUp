package com.example.ragda.pushup;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class signup extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner , spinnerStatus ;
    Button signUp;
    EditText Email , password , Name , Location  ;

    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Email = (EditText) findViewById(R.id.Email);
        password = (EditText) findViewById(R.id.password);
        Name = (EditText) findViewById(R.id.Name);
        Location = (EditText) findViewById(R.id.Location);


        spinnerStatus = (Spinner) findViewById(R.id.spinnerStatus);
        adapter2 = ArrayAdapter.createFromResource(this, R.array.martial_status, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStatus.setAdapter(adapter2);


        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.Gender_name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);




        signUp=(Button)findViewById(R.id.NEXT);


        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.NEXT:
                startActivity(new Intent(this,signupII.class));
                break;
        }}
    }

