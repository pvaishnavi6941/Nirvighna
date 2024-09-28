package com.example.nirvigna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class get_started extends AppCompatActivity {

    private Button getStartedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        // Initialize the button
        getStartedButton = findViewById(R.id.dialog_button); // Make sure to set the correct ID

        // Set the onClickListener for the button
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to the Selection page
                Intent intent = new Intent(get_started.this, selection.class);
                startActivity(intent);
            }
        });
    }
}
