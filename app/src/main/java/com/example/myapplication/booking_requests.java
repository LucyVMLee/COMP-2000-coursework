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
        profilebutton.setOnClickListener(v ->{
            PopupMenu popup = new PopupMenu(this, v);
            popup.getMenuInflater().inflate(R.menu.user_menu, popup.getMenu());
            popup.setOnMenuItemClickListener(item -> onOptionsItemsSelected(item));
            popup.show();

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