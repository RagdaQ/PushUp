package com.example.ragda.pushup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class incomecat extends AppCompatActivity implements View.OnClickListener {

    Button button3 , button4 , button5;
    ImageView imageView , imageView2 ,imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incomecat);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);

        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.button3:
                startActivity(new Intent(this,addincome.class));
                break;

            case R.id.button4:
                startActivity(new Intent(this,addincome.class));
                break;

            case R.id.button5:
                startActivity(new Intent(this,addincome.class));
                break;
        }

    }
}
