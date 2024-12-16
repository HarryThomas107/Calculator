package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Subtraction extends AppCompatActivity {

    EditText e3,e4;
    Button bn3,bn4;
    String getNum3,getNum4,result2;
    int num3,num4,dif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtraction);

        e3=(EditText) findViewById(R.id.et3);
        e4=(EditText) findViewById(R.id.et4);
        bn3=(Button) findViewById(R.id.b3);
        bn4=(Button) findViewById(R.id.b4);

        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum3=e3.getText().toString();
                getNum4=e4.getText().toString();
                num3=Integer.parseInt(getNum3);
                num4=Integer.parseInt(getNum4);
                dif=num3-num4;
                result2=String.valueOf(dif);
                Toast.makeText(getApplicationContext(),result2,Toast.LENGTH_LONG).show();
            }
        });

        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v6) {
                Intent ob6 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob6);
            }
        });

    }
}