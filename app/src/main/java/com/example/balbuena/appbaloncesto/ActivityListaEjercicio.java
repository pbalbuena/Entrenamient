package com.example.balbuena.appbaloncesto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.balbuena.appbaloncesto.logica.Listado;
import com.example.balbuena.appbaloncesto.logica.ejercicios.Ejercicio;
import com.example.balbuena.appbaloncesto.logica.ejercicios.EjercicioTiroLibre;
import com.example.balbuena.appbaloncesto.logica.ejercicios.TablaEjercicio;

import java.util.ArrayList;

public class ActivityListaEjercicio extends AppCompatActivity {

    ArrayList<TablaEjercicio> ls;
    ArrayAdapter<TablaEjercicio> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_ejercicio);
        ls = new ArrayList<TablaEjercicio>();



    }

    public void nuevaFila(View view){

        ListView listView = (ListView) findViewById(R.id.listaEjercicios);
        adapter=new ArrayAdapter<TablaEjercicio>(this,
                android.R.layout.simple_list_item_1,
                ls);
        listView.setAdapter(adapter);
        //**************

        //añadir nueva tabla
        TablaEjercicio e = new TablaEjercicio();
        adapter.add(e);


    }

/*
    TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout1);
    Button b = (Button) findViewById(R.id.buttonNuevaFila);
        b.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
    //creo nueva fila
    TableRow nuevaFila = new TableRow(this);
        nuevaFila.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
    //nuevaFila.setLayoutParams();
    //añado boton a nueva fila
        nuevaFila.addView(b);

    //añado nueva fila a tabla
        tableLayout.addView(nuevaFila, new TableLayout.
            LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
*/

}
