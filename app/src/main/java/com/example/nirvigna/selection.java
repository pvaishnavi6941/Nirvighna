package com.example.nirvigna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class selection extends AppCompatActivity {

    private Button buttonPlastic, buttonMetal, buttonGlass, buttonPaper, buttonOrganicWaste, buttonRags, buttonSyroFoamPacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        // Initialize buttons
        buttonPlastic = findViewById(R.id.button1);
        buttonMetal = findViewById(R.id.button2);
        buttonGlass = findViewById(R.id.button3);
        buttonPaper = findViewById(R.id.button4);
        buttonOrganicWaste = findViewById(R.id.button5);
        buttonRags = findViewById(R.id.button6);
        buttonSyroFoamPacks = findViewById(R.id.button7);

        // Set up click listeners
        View.OnClickListener redirectListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to location page
                Intent intent = new Intent(selection.this, location.class);
                startActivity(intent);
            }
        };

        // Attach listeners to each button
        buttonPlastic.setOnClickListener(redirectListener);
        buttonMetal.setOnClickListener(redirectListener);
        buttonGlass.setOnClickListener(redirectListener);
        buttonPaper.setOnClickListener(redirectListener);
        buttonOrganicWaste.setOnClickListener(redirectListener);
        buttonRags.setOnClickListener(redirectListener);
        buttonSyroFoamPacks.setOnClickListener(redirectListener);
    }
}
