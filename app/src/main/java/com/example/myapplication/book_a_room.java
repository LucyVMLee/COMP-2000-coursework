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
import android.widget.PopupMenu;
import android.view.MenuItem;

public class book_a_room extends AppCompatActivity {
    private Button profilebutton;
    private Button meeting1;
    private Button meeting3;
    private Button meeting4;

    private Button meeting5;
    private Button seminar2;
    private Button backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.book_a_room);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.book_a_room), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        profilebutton = findViewById(R.id.profilebutton);
        profilebutton.setOnClickListener(v ->{
            PopupMenu popup = new PopupMenu(this, v);
            popup.getMenuInflater().inflate(R.menu.user_menu, popup.getMenu());
            popup.setOnMenuItemClickListener(item -> onOptionsItemsSelected(item));
            popup.show();

        });
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(book_a_room.this, time_slot.class);
                startActivity(intent);
            }
        });
        meeting1 = findViewById(R.id.meetingroom1);
        meeting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });
        meeting3 = findViewById(R.id.meetingroom3);
        meeting3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });
        meeting4 = findViewById(R.id.metingroom4);
        meeting4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });
        meeting5 = findViewById(R.id.meeetingroom5);
        meeting5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });
        seminar2 = findViewById(R.id.seminarroom2);
        seminar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(book_a_room.this, confirm_booking_request.class);
                startActivity(intent);
            }
        });



    }
    public boolean onOptionsItemsSelected(MenuItem item){
        if(item.getItemId() == R.id.homebtn){
            Intent intent = new Intent(this, employee_home_screen.class);
            startActivity(intent);
            return true;
        }else if(item.getItemId() == R.id.pending_requests){
            Intent intent = new Intent(this, booking_requests.class);
            startActivity(intent);
            return true;
        }else if(item.getItemId() == R.id.logoutbtn){
            Intent intent = new Intent(this, logout_msg.class);
            startActivity(intent);
            return true;
        }
        else{
            return true;
        }
    }
}