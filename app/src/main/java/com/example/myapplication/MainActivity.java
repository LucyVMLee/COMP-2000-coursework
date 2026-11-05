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

public class MainActivity extends AppCompatActivity {
    private Button employeeloginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        employeeloginbtn = findViewById(R.id.employeelog);
        employeeloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, employee_login_screen.class);
                startActivity(intent);
            }
        });
    }

    public void boldenMe(View view){
        int ID = view.getId();
        Button workwithButton = findViewById(R.id.button6);
        Button b1 = findViewById(R.id.button6);
        Button b2 = findViewById(R.id.button7);
        Button b3 = findViewById(R.id.button8);
        if(ID == b1.getId()) {
            workwithButton = b1;
        }else if (ID== b2.getId()) {
            workwithButton = b2;
        }else if(ID == b3.getId()){
            workwithButton = b3;
        }
        //final Button button=findViewById(R.id.);
        ColorStateList custom = getResources().getColorStateList(R.color.pearly_pink);

        ColorStateList original = getResources().getColorStateList(R.color.original_purple);
        if(workwithButton.getBackgroundTintList()== custom){
            workwithButton.setBackgroundTintList(original);
        }else{
            workwithButton.setBackgroundTintList(custom);
        }

    }


}