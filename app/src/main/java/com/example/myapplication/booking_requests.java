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

public class booking_requests extends AppCompatActivity {

    private Button profilebutton;
    private Button delete1;
    private Button delete2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.booking_requests);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.my_bookings), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        profilebutton = findViewById(R.id.profilebutton);
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent profileIntent = new Intent(booking_requests.this, drop_down_booking_requests.class);
                startActivity(profileIntent);
            }
        });
        delete1 = findViewById(R.id.deletebtn1);
        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent profileIntent = new Intent(booking_requests.this, confirm_delete_request.class);
                startActivity(profileIntent);
            }
        });
        delete2 = findViewById(R.id.deletebtn2);
        delete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent profileIntent = new Intent(booking_requests.this, confirm_delete_request.class);
                startActivity(profileIntent);
            }
        });
    }}