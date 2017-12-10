package com.example.balbuena.appbaloncesto.logica;

import android.support.design.widget.TabLayout;

import com.example.balbuena.appbaloncesto.logica.ejercicios.Ejercicio;
import com.example.balbuena.appbaloncesto.logica.ejercicios.TablaEjercicio;

import java.util.ArrayList;

/**
 * Created by Balbuena on 01/11/2017.
 */

public class Perfil {
    private String nombre;
    private String apellido;
    private int edad;
    private int peso;
    //aqui se guardarán cada uno de los ejercicios que el usuario decida empezar a hacer
    private ArrayList<TablaEjercicio> tablasEjercicios;

    public Perfil(String nombre, String apellido, int edad, int peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
