package com.example.nirvigna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Handle "JOIN US NOW" button click
        Button joinButton = findViewById(R.id.join_button);
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Signup.class);
                startActivity(intent);
            }
        });

        // Handle "LOGIN" text click
        TextView loginText = findViewById(R.id.login_text);
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Redirecting to Login page...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });
    }
}
