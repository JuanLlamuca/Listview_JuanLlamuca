package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textViewMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textViewMensaje = findViewById(R.id.textViewMensaje);
        textViewMensaje.setText("¡Mensaje de la primera actividad!");
    }

    public void Finalizar(View view){
        this.finish();
    }




}