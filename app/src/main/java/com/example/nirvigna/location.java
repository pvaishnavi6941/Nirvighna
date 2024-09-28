package com.example.nirvigna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class location extends AppCompatActivity {

    private Button proceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        // Initialize the proceed button
        proceedButton = findViewById(R.id.button8);

        // Set up the click listener for the proceed button
        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to payment page
                Intent intent = new Intent(location.this, payment.class);
                startActivity(intent);
            }
        });
    }
}
