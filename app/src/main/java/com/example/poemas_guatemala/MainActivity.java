package com.example.poemas_guatemala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick1(View view) {
        Intent intent = new Intent( this,poema1.class);
        startActivity(intent);
    }

    public void OnClick2(View view) {
        Intent intent = new Intent( this,Poema2.class);
        startActivity(intent);
    }

    public void OnClick3(View view) {
        Intent intent = new Intent( this,Poema3.class);
        startActivity(intent);
    }
    public void Regresar(View view) {
        Intent intent = new Intent( this,MainActivity.class);
        startActivity(intent);
    }
    public void Regresar2(View view) {
        Intent intent = new Intent( this,MainActivity.class);
        startActivity(intent);
    }
    public void Regresar3(View view) {
        Intent intent = new Intent( this,MainActivity.class);
        startActivity(intent);
    }
}