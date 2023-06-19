package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Lista extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Spinner spSexo=findViewById(R.id.spinner_id);

        ArrayAdapter<CharSequence> sexo=ArrayAdapter.createFromResource(this,R.array.spinner_items, android.R.layout.simple_list_item_1);
        sexo.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spSexo.setAdapter(sexo);
        spSexo.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String selectedItem= parent.getItemAtPosition(position).toString();
        Toast.makeText(this,"selecionaste"+selectedItem, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}