package com.example.balbuena.appbaloncesto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.balbuena.appbaloncesto.Adapter.RVAdapter;
import com.example.balbuena.appbaloncesto.logica.Listado;

public class MainActivity extends AppCompatActivity {

    private Context myContext;

    //adaptador
    RVAdapter myAdapter;
    //recycler
    RecyclerView rv;


    private Listado listado;
    public final static String LISTADO_KEY = "listado";
    public final static int RESULT_1 = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("intento", "INICIO APLICACIÓN");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(listado==null){
            Log.i("intento","CREAR LISTADO VACÍO");
            listado = new Listado();
        }
        inicializarRecyler();
    }



    public void nuevoPerfil(View view){
        Log.i("intento: ", "INICIANDO CREAR PERFIL ACTIVITY");
        Intent myIntent = new Intent(MainActivity.this, ActivityCreacionPerfil.class);
        //envio la lista a la otra activity
        myIntent.putExtra(LISTADO_KEY, listado);
        startActivityForResult(myIntent, RESULT_1);
        Log.i("intento", "CREAR PERFIL ACTIVITY INICIADA");
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case (RESULT_1) : {
                if (resultCode == Activity.RESULT_OK) {
                    Listado nuevo = (Listado) data.getSerializableExtra(ActivityCreacionPerfil.RESULTADO_LISTA);
                    listado = nuevo;
                    Log.i("intento","RECIBO LISTA DE LA SEGUNDA ACTIVYTY CON " + listado.getList().size() + "OBJETOS");
                    cargarListado(rv);
                }
                break;
            }
        }
    }

    public void inicializarRecyler(){
        Log.i("intento","INICIALIZAR RECYCLER");
        myContext = getApplicationContext();

        rv = (RecyclerView) findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        LinearLayoutManager lm = new LinearLayoutManager(this); //mycontext
        Log.i("intento","ASIGNADO LAYOUT RECYCLER");
        rv.setLayoutManager(lm);

        //cargo todos los perfiles al recycler view
    }

    public void cargarListado(RecyclerView rv){
        Log.i("intento","CARGAR LISTADO");
        myAdapter = new RVAdapter(listado.getList());
        rv.setAdapter(myAdapter);
        Log.i("intento","LISTADO CARGADO CON " + listado.getList().size() + " OBJETOS");
    }
}
