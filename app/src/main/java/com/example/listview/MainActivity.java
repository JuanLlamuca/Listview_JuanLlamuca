package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Se declaran las variables listView y adapter como miembros de la clase:
    private ListView listView;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //En el método onCreate(), se realiza la inicialización y configuración inicial de la actividad:
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se obtiene una referencia al ListView en el diseño mediante su identificador R.id.listView:
        listView = findViewById(R.id.listView);

        //Se crea una instancia de ArrayList llamada itemList para almacenar los elementos de la lista:
        ArrayList<String> itemList = new ArrayList<>();

        //Se crea una instancia del adaptador ArrayAdapter y se establece en el ListView:
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);


        //Se crea una instancia del adaptador ArrayAdapter y se establece en el ListView:
        itemList.add("Elemento 1");
        itemList.add("Elemento 2");
        itemList.add("Elemento 3");

        //Se crea una nueva instancia del adaptador con la lista actualizada y se establece en el ListView nuevamente:
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        //Esto asegura que los nuevos elementos se muestren en el ListView.
        listView.setAdapter(adapter);


        //Se establece un OnItemClickListener en el ListView para responder a los clics en los elementos de la lista:
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemList.get(position);
                if (selectedItem.equals("Elemento 1")) {
                    // Mostrar un mensaje en pantalla
                    Toast.makeText(MainActivity.this, "Has hecho clic en el Elemento 1", Toast.LENGTH_SHORT).show();

                    // O abrir una nueva actividad
                    Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                    startActivity(intent);
                }else if(selectedItem.equals("Elemento 2")){
                    // Mostrar un mensaje en pantalla
                    Toast.makeText(MainActivity.this, "Has hecho clic en el Elemento 2", Toast.LENGTH_SHORT).show();

                    // O abrir una nueva actividad
                    Intent intent = new Intent(MainActivity.this, TerceraActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}