package com.example.myapplication;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;

public class booking_successful extends AppCompatActivity {
    private Button homebtn;
    private Button profilebutton;
    private Button requestsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.booking_success);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.booking_success), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(booking_successful.this, employee_home_screen.class);
                startActivity(intent);
            }
        });
        profilebutton = findViewById(R.id.profilebutton);
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(booking_successful.this, drop_down_booking_success.class);
                startActivity(profileIntent);
            }
        });
        requestsBtn = findViewById(R.id.requestsbtn);
        requestsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(booking_successful.this, booking_requests.class);
                startActivity(intent);
            }
        });
    }}