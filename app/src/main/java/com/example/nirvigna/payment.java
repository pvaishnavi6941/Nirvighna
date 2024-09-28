package com.example.nirvigna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class payment extends AppCompatActivity {

    private Button proceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Initialize the proceed button
        proceedButton = findViewById(R.id.proceed_button);

        // Set up the click listener for the proceed button
        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to thank you page
                Intent intent = new Intent(payment.this, thankyou.class);
                startActivity(intent);
            }
        });
    }
}
