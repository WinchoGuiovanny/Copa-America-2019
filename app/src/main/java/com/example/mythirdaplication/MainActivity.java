package com.example.mythirdaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton_encuentros, boton_jugadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton_encuentros = (Button)findViewById(R.id.button);
        boton_jugadores = (Button)findViewById(R.id.button3);

        boton_encuentros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent encuentros = new Intent(MainActivity.this, EncuentrosActivity.class);
                startActivity(encuentros);
            }
        });

        boton_jugadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jugadores = new Intent(MainActivity.this, JugadoresActivity.class);
                startActivity(jugadores);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
