package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
      Dialog myDialog;
      MediaPlayer mp= new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.musicaoficial);
        mp.start();
        mp.setLooping(true );
        setContentView(R.layout.activity_main);
        Button jogar= findViewById(R.id.jogar);
        Button sair= findViewById(R.id.sair);
        jogar.setOnClickListener(this);
        sair.setOnClickListener(this);


    }

public void onClick(View v){

    switch (v.getId()){
        case R.id.sair:
            mp.stop();
            this.finish();
            break;
        case R.id.jogar:
            Intent it =new Intent(this,tela2.class);
            startActivity(it);
            break;
    }
}


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
