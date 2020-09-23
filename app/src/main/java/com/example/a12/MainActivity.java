package com.example.a12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAct2;
    EditText txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAct2 = findViewById(R.id.nextAct);
        txt1 = findViewById(R.id.input);
        btnAct2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.nextAct:
                Toast.makeText(this, "Toast Test", Toast.LENGTH_LONG).show();
                Intent sig = new Intent(this,Act2.class);
                //sig.putExtra("dato",txt1.getText().toString());
                //startActivity(sig);
                enviarDatos(sig);
                break;
        }
    }
    public void enviarDatos(Intent i){
        i.putExtra("dato",txt1.getText().toString());
        startActivity(i);
    }
}