package com.example.gymbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
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

        EditText inpAge = findViewById(R.id.inpAge);
        EditText inpHeightCM = findViewById(R.id.inpHeightCM);
        EditText inpHeightFT = findViewById(R.id.inpHeightFT);
        EditText inpWeightKG = findViewById(R.id.inpWeightKG);
        EditText inpWeightLBS = findViewById(R.id.inpWeightLBS);
        RadioButton inpMale = findViewById(R.id.inpMale);
        RadioButton inpFemale = findViewById(R.id.inpFemale);


        txt1.setText("Calorie Requirement");
        txt1.setTextSize(30);
        txt1.setTextColor(Color.BLACK);

        txtAge.setText("Age");
        txtAge.setTextSize(20);
        txtAge.setTextColor(Color.BLACK);

        txtHeight.setText("Height");
        txtHeight.setTextSize(20);
        txtHeight.setTextColor(Color.BLACK);

        txtWeight.setText("Weight");
        txtWeight.setTextSize(20);
        txtWeight.setTextColor(Color.BLACK);

        txtGender.setText("Gender");
        txtGender.setTextSize(20);
        txtGender.setTextColor(Color.BLACK);

        txtExercise.setText("Exercise");
        txtExercise.setTextSize(20);
        txtExercise.setTextColor(Color.BLACK);


        ArrayAdapter<String> myadapter=new ArrayAdapter<String>(Activity4.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.exerciseSelect));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inpExercise.setAdapter(myadapter);

        inpAge.setHint("Years");

        inpHeightCM.setHint("Cm");

        inpHeightFT.setHint("Ft");

        inpWeightKG.setHint("Kg");

        inpWeightLBS.setHint("Lbs");

        inpMale.setText("Male");
        inpMale.setTextSize(15);

        inpFemale.setText("Female");
        inpFemale.setTextSize(15);

        calCalorie.setText("Calculate");
        calCalorie.setTextSize(20);

    }
}