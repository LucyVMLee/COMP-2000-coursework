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

public class drop_down_booking_requests extends AppCompatActivity {

    private Button profilebutton;
    private Button delete1;
    private Button delete2;
    private Button homebtn;
    private Button pendingrequestsbtn;
    private Button logoutbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.dd_bookingrequests);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.dd_my_bookings), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_booking_requests.this, employee_home_screen.class);
                startActivity(intent);
            }
        });

        pendingrequestsbtn = findViewById(R.id.pending_requests);
        pendingrequestsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_booking_requests.this, booking_requests.class);
                startActivity(intent);
            }
        });

        logoutbtn = findViewById(R.id.logout);
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_booking_requests.this, logout_msg.class);
                startActivity(intent);
            }
        });
        profilebutton = findViewById(R.id.profilebutton);
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_booking_requests.this, booking_requests.class);
                startActivity(intent);
            }
        });
        delete1 = findViewById(R.id.deletebtn1);
        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent profileIntent = new Intent(drop_down_booking_requests.this, confirm_delete_request.class);
                startActivity(profileIntent);
            }
        });
        delete2 = findViewById(R.id.deletebtn2);
        delete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent profileIntent = new Intent(drop_down_booking_requests.this, confirm_delete_request.class);
                startActivity(profileIntent);
            }
        });
    }}