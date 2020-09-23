package com.example.a12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Act2 extends AppCompatActivity  {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        tv1 = findViewById(R.id.txtMostrar);
        String valor = getIntent().getStringExtra("dato");
        tv1.setText(valor);
    }

}
