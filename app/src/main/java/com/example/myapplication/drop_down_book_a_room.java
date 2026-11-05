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

public class drop_down_book_a_room extends AppCompatActivity {
    private Button profileButton;
    private Button meeting1;
    private Button meeting3;
    private Button meeting4;
    private Button meeting5;
    private Button seminar2;
    private Button backbtn;
    private Button homebtn;
    private Button pendingrequestsbtn;
    private Button logoutbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.dd_book_a_room);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.drop_down_book_a_room), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, employee_home_screen.class);
                startActivity(intent);
            }
        });

        pendingrequestsbtn = findViewById(R.id.pending_requests);
        pendingrequestsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, booking_requests.class);
                startActivity(intent);
            }
        });

        logoutbtn = findViewById(R.id.logout);
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, logout_msg.class);
                startActivity(intent);
            }
        });

        profileButton = findViewById(R.id.profilebutton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, book_a_room.class);
                startActivity(intent);
            }
        });
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, time_slot.class);
                startActivity(intent);
            }
        });
        meeting1 = findViewById(R.id.meetingroom1);
        meeting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });
        meeting3 = findViewById(R.id.meetingroom3);
        meeting3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });
        meeting4 = findViewById(R.id.metingroom4);
        meeting4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });
        meeting5 = findViewById(R.id.meeetingroom5);
        meeting5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });
        seminar2 = findViewById(R.id.seminarroom2);
        seminar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });

    }}