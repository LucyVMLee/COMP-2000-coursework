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

public class employee_drop_down extends AppCompatActivity {
    private Button profilebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.employee_drop_down);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.employee_drop_down), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        profilebutton = findViewById(R.id.profilebutton);
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(employee_drop_down.this, employee_home_screen.class);
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
        Button b4 = findViewById(R.id.button9);
        Button b5 = findViewById(R.id.button10);
        Button b6 = findViewById(R.id.button11);
        Button b7 = findViewById(R.id.button12);
        Button b8 = findViewById(R.id.button13);
        Button b9 = findViewById(R.id.button14);
        Button b10 = findViewById(R.id.button15);
        Button b11 = findViewById(R.id.button16);
        Button b12 = findViewById(R.id.button17);
        Button b13 = findViewById(R.id.button19);
        Button b14 = findViewById(R.id.button20);
        Button b15 = findViewById(R.id.button21);
        Button b16= findViewById(R.id.button22);
        Button b17 = findViewById(R.id.button23);
        Button b18 = findViewById(R.id.button24);
        Button b19 = findViewById(R.id.button25);
        Button b20 = findViewById(R.id.button26);
        Button b21 = findViewById(R.id.button27);
        Button b22 = findViewById(R.id.button28);
        Button b23 = findViewById(R.id.button29);
        Button b24 = findViewById(R.id.button31);
        Button b25 = findViewById(R.id.button32);
        Button b26 = findViewById(R.id.button33);
        Button b27 = findViewById(R.id.button34);
        Button b28 = findViewById(R.id.button35);
        Button b29 = findViewById(R.id.button36);
        Button b30 = findViewById(R.id.button37);
        Button b31 = findViewById(R.id.button38);

        if(ID == b1.getId()) {
            workwithButton = b1;
        }else if (ID== b2.getId()) {
            workwithButton = b2;
        }else if(ID == b3.getId()){
            workwithButton = b3;
        }else if(ID == b4.getId()){
            workwithButton = b4;
        }else if(ID == b5.getId()){
            workwithButton = b5;
        }else if(ID == b6.getId()){
            workwithButton = b6;
        }else if(ID == b7.getId()){
            workwithButton = b7;
        }else if(ID == b8.getId()){
            workwithButton = b8;
        }else if(ID == b9.getId()){
            workwithButton = b9;
        }else if(ID == b10.getId()){
            workwithButton = b10;
        }else if(ID == b11.getId()){
            workwithButton = b11;
        }else if(ID == b12.getId()){
            workwithButton = b12;
        }else if(ID == b13.getId()){
            workwithButton = b13;
        }else if(ID == b14.getId()){
            workwithButton = b14;
        }else if(ID == b15.getId()){
            workwithButton = b15;
        }else if(ID == b16.getId()){
            workwithButton = b16;
        }else if(ID == b17.getId()){
            workwithButton = b17;
        }else if(ID == b18.getId()){
            workwithButton = b18;
        }else if(ID == b19.getId()){
            workwithButton = b19;
        }else if(ID == b20.getId()){
            workwithButton = b20;
        }else if(ID == b21.getId()){
            workwithButton = b21;
        }else if(ID == b22.getId()){
            workwithButton = b22;
        }else if(ID == b23.getId()){
            workwithButton = b23;
        }else if(ID == b24.getId()){
            workwithButton = b24;
        }else if(ID == b25.getId()){
            workwithButton = b25;
        }else if(ID == b26.getId()){
            workwithButton = b26;
        }else if(ID == b27.getId()){
            workwithButton = b27;
        }else if(ID == b28.getId()){
            workwithButton = b28;
        }else if(ID == b29.getId()){
            workwithButton = b29;
        }else if(ID == b30.getId()){
            workwithButton = b30;
        }else if(ID == b31.getId()){
            workwithButton = b31;
        }

        //final Button button=findViewById(R.id.);
        ColorStateList custom = getResources().getColorStateList(R.color.pearly_pink);

        ColorStateList original = getResources().getColorStateList(R.color.original_purple);

        b1.setBackgroundTintList(original);
        b2.setBackgroundTintList(original);
        b3.setBackgroundTintList(original);
        b4.setBackgroundTintList(original);
        b5.setBackgroundTintList(original);
        b6.setBackgroundTintList(original);
        b7.setBackgroundTintList(original);
        b8.setBackgroundTintList(original);
        b9.setBackgroundTintList(original);
        b10.setBackgroundTintList(original);
        b11.setBackgroundTintList(original);
        b12.setBackgroundTintList(original);
        b13.setBackgroundTintList(original);
        b14.setBackgroundTintList(original);
        b15.setBackgroundTintList(original);
        b16.setBackgroundTintList(original);
        b17.setBackgroundTintList(original);
        b18.setBackgroundTintList(original);
        b19.setBackgroundTintList(original);
        b20.setBackgroundTintList(original);
        b21.setBackgroundTintList(original);
        b22.setBackgroundTintList(original);
        b23.setBackgroundTintList(original);
        b24.setBackgroundTintList(original);
        b25.setBackgroundTintList(original);
        b26.setBackgroundTintList(original);
        b27.setBackgroundTintList(original);
        b28.setBackgroundTintList(original);
        b29.setBackgroundTintList(original);
        b30.setBackgroundTintList(original);
        b31.setBackgroundTintList(original);



        if(workwithButton.getBackgroundTintList()== custom){
            workwithButton.setBackgroundTintList(original);
        }else{
            workwithButton.setBackgroundTintList(custom);
        }
        Intent timeintent = new Intent(employee_drop_down.this, time_slot.class);
        startActivity(timeintent);

    }
}


