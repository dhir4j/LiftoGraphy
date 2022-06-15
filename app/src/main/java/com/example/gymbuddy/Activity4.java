package com.example.gymbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.*;

public class Activity4 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        TextView txt1 = findViewById(R.id.txtCC);
        TextView txtAge = findViewById(R.id.txtAge);
        TextView txtHeight = findViewById(R.id.txtHeight);
        TextView txtWeight = findViewById(R.id.txtWeight);
        TextView txtGender = findViewById(R.id.txtGender);
        TextView txtExercise = findViewById(R.id.txtExercise);
        Spinner inpExercise = (Spinner) findViewById(R.id.inpExercise);
        Button calCalorie = findViewById(R.id.calCalorie);


        txt1.setText("Calorie Calculator");
        txt1.setTextSize(30);

        txtAge.setText("Age");
        txtAge.setTextSize(20);

        txtHeight.setText("Height");
        txtHeight.setTextSize(20);

        txtWeight.setText("Weight");
        txtWeight.setTextSize(20);

        txtGender.setText("Gender");
        txtGender.setTextSize(20);

        txtExercise.setText("Exercise");
        txtExercise.setTextSize(20);

        ArrayAdapter<String> myadapter=new ArrayAdapter<String>(Activity4.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.exerciseSelect));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inpExercise.setAdapter(myadapter);


    }
}