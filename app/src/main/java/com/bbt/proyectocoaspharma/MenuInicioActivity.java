package com.bbt.proyectocoaspharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.bbt.proyectocoaspharma.Principal.BusquedaActivity;
import com.bbt.proyectocoaspharma.Principal.CrearVisitaActivity;
import com.bbt.proyectocoaspharma.Principal.EnlacesActivity;
import com.bbt.proyectocoaspharma.Principal.EspecialidadActivity;
import com.bbt.proyectocoaspharma.Principal.VisitasCreadasActivity;

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

    //Metodo para boton especialidad
    public void BotonEspecialidad(View view){
        startActivity(new Intent(getApplicationContext(), EspecialidadActivity.class));
        overridePendingTransition(0,0);
    }
    //Metodo para boton Busqueda
    public void BotonBusqueda(View view){
        startActivity(new Intent(getApplicationContext(), BusquedaActivity.class));
    }
    //Metodo para boton Crear visita
    public void BotonCrearVisita(View view){
        startActivity(new Intent(getApplicationContext(), CrearVisitaActivity.class));
    }
    //Metodo para boton Enlaces
    public void BotonEnlaces(View view){
        startActivity(new Intent(getApplicationContext(), EnlacesActivity.class));
    }
    //Metodo para boton Visitas Creadas
    public void BotonVisitasCreadas(View view){
        startActivity(new Intent(getApplicationContext(), VisitasCreadasActivity.class));
    }
}