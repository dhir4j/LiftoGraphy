package com.example.gymbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
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
        Spinner inpExercise = findViewById(R.id.inpExercise);
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


        ArrayAdapter<String> myAdapter=new ArrayAdapter<>(Activity4.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.exerciseSelect));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inpExercise.setAdapter(myAdapter);

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

        calCalorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double age = Double.parseDouble(inpAge.getText().toString());
                double heightcm = Double.parseDouble(inpHeightCM.getText().toString());
                double weightkg = Double.parseDouble(inpWeightKG.getText().toString());
                double BMR;

                //BMR = (88.362 + (13.397* weightkg) + (4.799 *heightcm) -(5.677*age));
                BMR = ((10* weightkg) + (6.25 *heightcm) -(5*age) + 5);
                int bmrInt = ((int) BMR);
                String bmr = String.valueOf(bmrInt);
                txt1.setText(bmr);
            }
        });

    }
}