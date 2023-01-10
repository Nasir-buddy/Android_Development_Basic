package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText n1 , n2;
    Button buttun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.nasir);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        buttun = findViewById(R.id.btn);

        buttun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mul = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
                text.setText("Multiplication of n1 and n2 is : " + mul);
            }
        });
    }
}