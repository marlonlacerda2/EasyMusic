package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
      Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button jogar= findViewById(R.id.jogar);
        Button sair= findViewById(R.id.sair);
        jogar.setOnClickListener(this);
        sair.setOnClickListener(this);


    }

public void onClick(View v){

    switch (v.getId()){
        case R.id.sair:
            this.finish();
            break;
        case R.id.jogar:
            Intent it =new Intent(this,tela2.class);
            startActivity(it);
            break;
    }
}
    public  void showpopup(View h) {
        TextView txtclose;
        myDialog.setContentView(R.layout.popup);
        myDialog = new Dialog(this);
        txtclose = myDialog.findViewById(R.id.fechar);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View h) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
