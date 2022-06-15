package com.example.gymbuddy;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.widget.*;
import android.view.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView txt1;
    Button btn1,btn2,btn3,btn4;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt1.setText("G Y M  B U D D Y");
        txt1.setTextSize(35);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setText("Weekly Routine");
        btn1.setTextColor(Color.WHITE);
        btn1.setTextSize(25);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setText("Exercises");
        btn2.setTextColor(Color.WHITE);
        btn2.setTextSize(25);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setText("Diet");
        btn3.setTextColor(Color.WHITE);
        btn3.setTextSize(25);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setText("Tools");
        btn4.setTextColor(Color.WHITE);
        btn4.setTextSize(25);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

    }

    public void openActivity1(){
        Intent intent1 = new Intent(this, Activity1.class);
        startActivity(intent1);
    }
    public void openActivity2(){
        Intent intent2 = new Intent(this, Activity2.class);
        startActivity(intent2);
    }
    public void openActivity3(){
        Intent intent3 = new Intent(this, Activity3.class);
        startActivity(intent3);
    }
    public void openActivity4(){
        Intent intent3 = new Intent(this, Activity4.class);
        startActivity(intent3);
    }
}