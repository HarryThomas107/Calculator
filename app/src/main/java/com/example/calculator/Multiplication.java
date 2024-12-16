package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Multiplication extends AppCompatActivity {

    EditText e5,e6;
    Button bn5,bn6;
    String getNum5,getNum6,result3;
    int num5,num6,pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);

        e5=(EditText) findViewById(R.id.et5);
        e6=(EditText) findViewById(R.id.et6);
        bn5=(Button) findViewById(R.id.b5);
        bn6=(Button) findViewById(R.id.b6);

        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum5=e5.getText().toString();
                getNum6=e6.getText().toString();
                num5=Integer.parseInt(getNum5);
                num6=Integer.parseInt(getNum6);
                pro=num5*num6;
                result3=String.valueOf(pro);
                Toast.makeText(getApplicationContext(),result3,Toast.LENGTH_LONG).show();
            }
        });

        bn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v7) {
                Intent ob7 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob7);
            }
        });

    }
}