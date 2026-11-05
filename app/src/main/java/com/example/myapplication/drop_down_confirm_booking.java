package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class drop_down_confirm_booking extends AppCompatActivity {
    private Button changeBtn;
    private Button confirmBtn;
    private Button profilebtn;
    private Button homebtn;
    private Button pendingrequestsbtn;
    private Button logoutbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.drop_down_confirm_booking);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.dd_confirm_booking_request), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_booking.this, employee_home_screen.class);
                startActivity(intent);
            }
        });

        pendingrequestsbtn = findViewById(R.id.pending_requests);
        pendingrequestsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_booking.this, booking_requests.class);
                startActivity(intent);
            }
        });

        logoutbtn = findViewById(R.id.logout);
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_booking.this, logout_msg.class);
                startActivity(intent);
            }
        });
        changeBtn = findViewById(R.id.change_booking);
        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_booking.this, book_a_room.class);
                startActivity(intent);
            }
        });

        confirmBtn = findViewById(R.id.confirm_btn);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_booking.this, booking_successful.class);
                startActivity(intent);
            }
        });
        profilebtn = findViewById(R.id.profilebutton);
        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_booking.this, drop_down_confirm_booking.class);
                startActivity(intent);
            }
        });
    }}