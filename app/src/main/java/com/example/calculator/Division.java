package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Division extends AppCompatActivity {

    EditText e7,e8;
    Button bn7,bn8;
    String getNum7,getNum8,result4;
    int num7,num8,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);

        e7=(EditText) findViewById(R.id.et7);
        e8=(EditText) findViewById(R.id.et8);
        bn7=(Button) findViewById(R.id.b7);
        bn8=(Button) findViewById(R.id.b8);

        bn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum7=e7.getText().toString();
                getNum8=e8.getText().toString();
                num7=Integer.parseInt(getNum7);
                num8=Integer.parseInt(getNum8);
                div=num7/num8;
                result4=String.valueOf(div);
                Toast.makeText(getApplicationContext(),result4,Toast.LENGTH_LONG).show();
            }
        });

        bn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v8) {
                Intent ob8 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob8);
            }
        });

    }
}