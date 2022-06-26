package com.example.gymbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CardView cardWorkoutPlan, cardDietPlan, cardExercises, cardTools;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardWorkoutPlan = (CardView) findViewById(R.id.cardWorkoutPlan);
        cardDietPlan = (CardView) findViewById(R.id.cardDietPlan);
        cardExercises = (CardView) findViewById(R.id.cardExercises);
        cardTools = (CardView) findViewById(R.id.cardTools);

        cardWorkoutPlan.setOnClickListener(this);
        cardDietPlan.setOnClickListener(this);
        cardExercises.setOnClickListener(this);
        cardTools.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.cardWorkoutPlan:
                i = new Intent(this, Activity1.class);
                startActivity(i);
                break;

            case R.id.cardDietPlan:
                i = new Intent(this, Activity2.class);
                startActivity(i);
                break;
            case R.id.cardExercises:
                i = new Intent(this, Activity3.class);
                startActivity(i);
                break;
            case R.id.cardTools:
                i = new Intent(this, Activity4.class);
                startActivity(i);
                break;
        }
    }
}