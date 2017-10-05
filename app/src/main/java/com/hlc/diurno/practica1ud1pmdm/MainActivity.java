package com.hlc.diurno.practica1ud1pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @Author Sergio Sánchez Polaino
 *
 * Clase principal de la APP. Carga la vista activity_main.xml que contiene mi nombre, apellidos y curso actual
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Asigna la vista que debe mostrar
    }
}
