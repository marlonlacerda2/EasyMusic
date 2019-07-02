package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
        Button A= findViewById(R.id.A);
        Button B= findViewById(R.id.B);
        Button C= findViewById(R.id.C);
        Button D= findViewById(R.id.D);
        Button voltar2= findViewById(R.id.voltar2);
        Button continuar2= findViewById(R.id.continuar2);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tela4.this,Pop.class));
            }
        });
        B.setOnClickListener(this);
        C.setOnClickListener(this);
        D.setOnClickListener(this);
        voltar2.setOnClickListener(this);
        continuar2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
           case R.id.A:

            break;
            case R.id.B:
            break;
            case R.id.C:
             break;
            case R.id.D:
             break;
            case R.id.voltar2:
                Intent it =new Intent(this,tela3.class);
                startActivity(it);
                break;
            case R.id.continuar2:
                Intent it2 =new Intent(this,MainActivity.class);
                startActivity(it2);
                break;
    }
}}
