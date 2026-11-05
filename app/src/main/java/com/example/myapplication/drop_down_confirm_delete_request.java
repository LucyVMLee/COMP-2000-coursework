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

public class drop_down_confirm_delete_request extends AppCompatActivity {
    private Button changeBtn;
    private Button confirmBtn;
    private Button profilebtn;
    private Button backbtn;
    private Button homebtn;
    private Button pendingrequestsbtn;
    private Button logoutbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.dd_confirm_delete_request);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.dd_confirm_delete_request), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_delete_request.this, employee_home_screen.class);
                startActivity(intent);
            }
        });

        pendingrequestsbtn = findViewById(R.id.pending_requests);
        pendingrequestsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_delete_request.this, booking_requests.class);
                startActivity(intent);
            }
        });

        logoutbtn = findViewById(R.id.logout);
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_delete_request.this, logout_msg.class);
                startActivity(intent);
            }
        });
        changeBtn = findViewById(R.id.cancel_button);
        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_delete_request.this, booking_requests.class);
                startActivity(intent);
            }
        });

        confirmBtn = findViewById(R.id.confirm_button);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_delete_request.this, employee_home_screen.class);
                startActivity(intent);
            }
        });
        profilebtn = findViewById(R.id.profilebutton_main);
        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_delete_request.this, confirm_delete_request.class);
                startActivity(intent);
            }
        });
        backbtn  = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drop_down_confirm_delete_request.this, booking_requests.class);
                startActivity(intent);
            }
        });


    }}