package com.bbt.proyectocoaspharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

public class MenuInicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Bloquear orientacion de pantalla!
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Ocultar ActionBar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_menu_inicio);
    }
}