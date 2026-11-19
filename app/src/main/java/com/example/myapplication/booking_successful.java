package com.example.myapplication;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.PopupMenu;

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
        profilebutton.setOnClickListener(v ->{
            PopupMenu popup = new PopupMenu(this, v);
            popup.getMenuInflater().inflate(R.menu.user_menu, popup.getMenu());
            popup.setOnMenuItemClickListener(item -> onOptionsItemsSelected(item));
            popup.show();

        });
        requestsBtn = findViewById(R.id.requestsbtn);
        requestsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(booking_successful.this, booking_requests.class);
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