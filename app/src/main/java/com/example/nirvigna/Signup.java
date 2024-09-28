package com.example.nirvigna;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    // Define the EditText and Button variables
    private EditText fullNameEditText, emailEditText, passwordEditText;
    private Button proceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);  // Link to the XML layout file

        // Initialize the views
        fullNameEditText = findViewById(R.id.full_name);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        proceedButton = findViewById(R.id.proceed_button);

        // Set up the Proceed button click listener
        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input from EditText fields
                String fullName = fullNameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Validate the input
                if (TextUtils.isEmpty(fullName)) {
                    fullNameEditText.setError("Full Name is required");
                    return;
                }

                if (TextUtils.isEmpty(email) || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    emailEditText.setError("Valid Email ID is required");
                    return;
                }

                if (TextUtils.isEmpty(password) || password.length() < 6) {
                    passwordEditText.setError("Password must be at least 6 characters");
                    return;
                }

                // If all input is valid, proceed to the next page
                Toast.makeText(Signup.this, "Proceeding...", Toast.LENGTH_SHORT).show();

                // Create an Intent to navigate to get_started activity
                Intent intent = new Intent(Signup.this, get_started.class);
                startActivity(intent);  // Start the next activity
            }
        });
    }
}
