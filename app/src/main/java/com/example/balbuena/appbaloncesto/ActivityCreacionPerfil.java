package com.example.balbuena.appbaloncesto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.balbuena.appbaloncesto.logica.Listado;
import com.example.balbuena.appbaloncesto.logica.Perfil;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Balbuena on 01/11/2017.
 */

public class ActivityCreacionPerfil extends AppCompatActivity {

    public final static String RESULTADO_LISTA="listares";
    ArrayList<Perfil> nuevaLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Creación perfil", " ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creacion_perfil);
        nuevaLista = recibirLista();
        Log.i("Creación perfil", " iniciada");
    }

    public ArrayList<Perfil> recibirLista(){
        Log.i("Intento ", " RECIBIR LISTA");
        Listado l = (Listado) getIntent().getSerializableExtra(MainActivity.LISTADO_KEY);
        ArrayList<Perfil> lista = (ArrayList) l.getList();
        Log.i("Intento ", " ASIGNAR LA LISTA");
        return lista;
    }

    public void guardarPerfil(View view){
        EditText ednombre = (EditText) findViewById(R.id.textInputNombre);
        EditText edApell = (EditText) findViewById(R.id.textInputApellidos);
        EditText edEdad = (EditText) findViewById(R.id.textInputEdad);
        EditText edPeso = (EditText) findViewById(R.id.textInputPeso);

        String nombre = ednombre.getText().toString();
        String apellidos = edApell.getText().toString();
        int edad = Integer.parseInt(edEdad.getText().toString());
        int peso = Integer.parseInt(edPeso.getText().toString());

        Perfil p = new Perfil(nombre, apellidos, edad, peso);
        Log.i("intento", "PERSONA CREADA");
        nuevaLista.add(p);
        Log.i("intento", "PERSONA AÑADIDA A LISTA RESULTADO");
        Intent intent = getIntent();
        Listado parametro = new Listado(nuevaLista);
        intent.putExtra(RESULTADO_LISTA, parametro);
        setResult(Activity.RESULT_OK, intent);
        Log.i("intento", "LISTA ENVIADA A PRIMERA ACTIVYTY");
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
