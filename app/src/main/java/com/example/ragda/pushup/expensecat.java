package com.example.ragda.pushup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class expensecat extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView5 , imageView6 ,imageView7 ,imageView8 , imageView9 , imageView10 , imageView11 ,
            imageView12 , imageView13 , imageView14 , imageView15 , imageView16 , imageView17 , imageView18;

    Button button6 , button7 , button8 ,button9 , button10 , button11 , button12 , button13 , button14 ,
            button15 , button16 , button17 , button18 , button19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expensecat);

        imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView7 = (ImageView)findViewById(R.id.imageView7);
        imageView8= (ImageView)findViewById(R.id.imageView8);
        imageView9 = (ImageView)findViewById(R.id.imageView9);
        imageView10 = (ImageView)findViewById(R.id.imageView10);
        imageView11 = (ImageView)findViewById(R.id.imageView11);
        imageView12 = (ImageView)findViewById(R.id.imageView12);
        imageView13 = (ImageView)findViewById(R.id.imageView13);
        imageView14 = (ImageView)findViewById(R.id.imageView14);
        imageView15 = (ImageView)findViewById(R.id.imageView15);
        imageView16 = (ImageView)findViewById(R.id.imageView16);
        imageView17 = (ImageView)findViewById(R.id.imageView17);
        imageView18 = (ImageView)findViewById(R.id.imageView18);

        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11= (Button)findViewById(R.id.button11);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button)findViewById(R.id.button14);
        button15 = (Button)findViewById(R.id.button15);
        button16 = (Button)findViewById(R.id.button16);
        button17 = (Button)findViewById(R.id.button17);
        button18 = (Button)findViewById(R.id.button18);
        button19 = (Button)findViewById(R.id.button19);

        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button6:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button7:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button8:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button9:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button10:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button11:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button12:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button13:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button14:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button15:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button16:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button17:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button18:
                startActivity(new Intent(this,addexpense.class));
                break;

            case R.id.button19:
                startActivity(new Intent(this,addexpense.class));
                break;

        }


    }

}
