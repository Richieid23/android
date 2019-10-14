package com.example.profilerizki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPindah = findViewById(R.id.btn_prof);
        btnPindah.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_prof){
            Intent obj = new Intent(MainActivity.this, Profileku.class);
            startActivity(obj);
        }
    }
}
