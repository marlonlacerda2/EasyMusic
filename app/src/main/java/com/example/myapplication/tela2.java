package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Button continuar= findViewById(R.id.continuar);
        Button voltar= findViewById(R.id.voltar);
        continuar.setOnClickListener(this);
        voltar.setOnClickListener(this);


    }


    public void onClick(View v){

        switch (v.getId()){
            case R.id.voltar:
                Intent it =new Intent(this,MainActivity.class);
                startActivity(it);

               break;
            case R.id.continuar:
                Intent it2 =new Intent(this,tela3.class);
                startActivity(it2);
                break;
        }
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
