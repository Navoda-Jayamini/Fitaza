package com.example.fitazafitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutBurntActivity extends AppCompatActivity {

    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_burnt);

        btnHome = findViewById(R.id.btn_go_to_home);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutBurntActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}