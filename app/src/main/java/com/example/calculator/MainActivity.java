package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bt1=(Button) findViewById(R.id.but1);
        bt2=(Button) findViewById(R.id.but2);
        bt3=(Button) findViewById(R.id.but3);
        bt4=(Button) findViewById(R.id.but4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent ob1 = new Intent(getApplicationContext(), Addition.class);
                startActivity(ob1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent ob2 = new Intent(getApplicationContext(), Subtraction.class);
                startActivity(ob2);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                Intent ob3 = new Intent(getApplicationContext(), Multiplication.class);
                startActivity(ob3);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                Intent ob4 = new Intent(getApplicationContext(), Division.class);
                startActivity(ob4);
            }
        });

    }
}