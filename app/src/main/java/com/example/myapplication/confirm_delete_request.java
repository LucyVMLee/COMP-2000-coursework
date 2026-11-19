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

public class confirm_delete_request extends AppCompatActivity {
    private Button changeBtn;
    private Button confirmBtn;
    private Button profilebtn;
    private Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.confirm_delete_request);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.confirm_delete_request), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        changeBtn = findViewById(R.id.cancel_button);
        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm_delete_request.this, booking_requests.class);
                startActivity(intent);
            }
        });

        confirmBtn = findViewById(R.id.confirm_button);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm_delete_request.this, employee_home_screen.class);
                startActivity(intent);
            }
        });
        profilebtn = findViewById(R.id.profilebutton_main);
        profilebtn.setOnClickListener(v ->{
            PopupMenu popup = new PopupMenu(this, v);
            popup.getMenuInflater().inflate(R.menu.user_menu, popup.getMenu());
            popup.setOnMenuItemClickListener(item -> onOptionsItemsSelected(item));
            popup.show();

        });
        backbutton = findViewById(R.id.backbtn);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm_delete_request.this, booking_requests.class);
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