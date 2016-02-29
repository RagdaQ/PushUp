package com.example.ragda.pushup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class signin extends AppCompatActivity implements View.OnClickListener {
    Button signIn ,signUp ;
    EditText password , Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


        Email = (EditText) findViewById(R.id.Email);
        password = (EditText) findViewById(R.id.password);
        signIn = (Button) findViewById(R.id.button2);
        signUp = (Button) findViewById(R.id.button3);

        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                startActivity(new Intent(this, calendar.class));
                break;

            case R.id.button3:
                startActivity(new Intent(this, signup.class));
                break;
        }
    }
}