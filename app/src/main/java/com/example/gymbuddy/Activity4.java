package com.example.gymbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Activity4 extends AppCompatActivity {

    String[] exercises = { "BMR: Basal Metabolic Rate", "Light: 1-3 Days/Week", "Moderate: 3-5 Days/Week", "Intense: 6-7 Days/Week"};
    public static double mulBmr = 1;
    public static String valBmr = "dhir4j";
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
        EditText inpHeight = findViewById(R.id.inpHeight);
        EditText inpWeight = findViewById(R.id.inpWeight);
        RadioButton inpMale = findViewById(R.id.inpMale);
        RadioButton inpFemale = findViewById(R.id.inpFemale);

        txt1.setText("Calorie Calculator");
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

        inpAge.setHint("Years");

        inpHeight.setHint("Cm");

        inpWeight.setHint("Kg");

        inpMale.setText("Male");
        inpMale.setTextSize(15);

        inpFemale.setText("Female");
        inpFemale.setTextSize(15);

        calCalorie.setText("Calculate");
        calCalorie.setTextSize(20);


        //Spinner or DropDown list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,exercises);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inpExercise.setAdapter(aa);

        inpExercise.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg, View view, int position, long id) {
                if (arg.getItemAtPosition(position) == exercises[0]){
                    mulBmr = 1;
                    valBmr = exercises[0];
                }
                else if (arg.getItemAtPosition(position) == exercises[1]){
                    mulBmr = 1.375;
                    valBmr = exercises[1];
                }
                else if (arg.getItemAtPosition(position) == exercises[2]){
                    mulBmr = 1.47;
                    valBmr = exercises[2];
                }
                else {
                    mulBmr = 1.725;
                    valBmr = exercises[3];
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //On Calculate Button Click
        calCalorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inpAge.getText().toString().trim().length() <= 0) {
                    Toast.makeText(getApplicationContext(), "Enter Age", Toast.LENGTH_SHORT).show();
                }
                else if (inpHeight.getText().toString().trim().length() <= 0){
                    Toast.makeText(getApplicationContext(), "Enter Height", Toast.LENGTH_SHORT).show();
                }
                else if (inpWeight.getText().toString().trim().length() <= 0) {
                    Toast.makeText(getApplicationContext(), "Enter Weight", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (inpMale.isChecked()) {
                        double age = Double.parseDouble(inpAge.getText().toString());
                        double height = Double.parseDouble(inpHeight.getText().toString());
                        double weight = Double.parseDouble(inpWeight.getText().toString());
                        double BMR;
                        BMR = ((10 * weight) + (6.25 * height) - (5 * age) + 5);
                        BMR = BMR * mulBmr;
                        int bmrInt = ((int) BMR);
                        String bmr = String.valueOf(bmrInt);
                        Toast.makeText(getApplicationContext(),valBmr +" = "+ bmr, Toast.LENGTH_SHORT).show();


                    } else if (inpFemale.isChecked()) {
                        double age = Double.parseDouble(inpAge.getText().toString());
                        double heightcm = Double.parseDouble(inpHeight.getText().toString());
                        double weightkg = Double.parseDouble(inpWeight.getText().toString());
                        double BMR;
                        BMR = ((10 * weightkg) + (6.25 * heightcm) - (5 * age) - 161);
                        BMR = BMR * mulBmr;
                        int bmrInt = ((int) BMR);
                        String bmr = String.valueOf(bmrInt);
                        Toast.makeText(getApplicationContext(),valBmr +" = "+ bmr, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Gender Not Selected", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}