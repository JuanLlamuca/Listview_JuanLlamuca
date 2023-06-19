package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TerceraActivity extends AppCompatActivity {
    private TextView textViewMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        textViewMensaje = findViewById(R.id.textViewMensaje);
        textViewMensaje.setText("¡Mensaje de la Segunda actividad!");
    }

    public void Finalizar(View view){
        this.finish();
    }
}