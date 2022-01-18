package com.bbt.proyectocoaspharma.Principal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.bbt.proyectocoaspharma.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BusquedaActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);

        //Bloquear orientacion de pantalla!
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Ocultar ActionBar
        getSupportActionBar().hide();


        TextView titulo = findViewById(R.id.title_activity);
        titulo.setText("Búsqueda");

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.page_busqueda);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.page_especialidad:
                        startActivity(new Intent(getApplicationContext(), EspecialidadActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.page_busqueda:
                        return true;

                    case R.id.page_crearvisita:
                        startActivity(new Intent(getApplicationContext(), CrearVisitaActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.page_enlaces:
                        startActivity(new Intent(getApplicationContext(), EnlacesActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.page_visitas:
                        startActivity(new Intent(getApplicationContext(), VisitasCreadasActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}