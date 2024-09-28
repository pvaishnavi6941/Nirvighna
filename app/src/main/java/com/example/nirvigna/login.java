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

public class login extends AppCompatActivity {

    private EditText emailEditText, passwordEditText, confirmPasswordEditText;
    private Button proceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize the views
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        confirmPasswordEditText = findViewById(R.id.password_confirm);
        proceedButton = findViewById(R.id.proceed_button);

        // Set up the proceed button click listener
        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                String confirmPassword = confirmPasswordEditText.getText().toString().trim();

                // Validate the input
                if (TextUtils.isEmpty(email) || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    emailEditText.setError("Valid Email ID is required");
                    return;
                }

                if (TextUtils.isEmpty(password) || password.length() < 6) {
                    passwordEditText.setError("Password must be at least 6 characters");
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    confirmPasswordEditText.setError("Passwords do not match");
                    return;
                }

                // If input is valid, proceed to the next page
                Intent intent = new Intent(login.this, get_started.class);
                startActivity(intent);
            }
        });
    }
}
