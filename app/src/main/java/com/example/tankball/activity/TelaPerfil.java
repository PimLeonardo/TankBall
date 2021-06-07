package com.example.tankball.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tankball.R;

public class TelaPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);

        getSupportActionBar().hide();
    }
}