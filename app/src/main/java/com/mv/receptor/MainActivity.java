package com.mv.receptor;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String clima = getIntent().getStringExtra("Clima");

        TextView textViewBienvenida = findViewById(R.id.txtClima);
        textViewBienvenida.setText("Bienvenido " + clima);

        String humedad = getIntent().getStringExtra("Humedad");

        TextView textViewHumedad = findViewById(R.id.txtHumedad);
        textViewBienvenida.setText("Bienvenido " + humedad);

        String viento = getIntent().getStringExtra("Viento");

        TextView textViewViento = findViewById(R.id.txtViento);
        textViewBienvenida.setText("Bienvenido " + viento);

    }
}