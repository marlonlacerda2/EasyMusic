package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class tela3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        Button continuar1= findViewById(R.id.continuar1);
        Button voltar1= findViewById(R.id.voltar1);
        continuar1.setOnClickListener(this);
        voltar1.setOnClickListener(this);
    }

    public void onClick(View i){

        switch (i.getId()){
            case R.id.continuar1:
                Intent it =new Intent(this,tela4.class);
                startActivity(it);
                break;
            case R.id.voltar1:
                Intent it2 =new Intent(this,tela2.class);
                startActivity(it2);
                break;
        }
    }
}