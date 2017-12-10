package com.example.balbuena.appbaloncesto.logica.ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Balbuena on 15/11/2017.
 */

public class Ejercicio {
    private Date fecha;
    private int intentos;
    private int aciertos;
    private int fallos;
    private double porcentaje;

    public Ejercicio(){
        //guardo la fecha de hoy para poder clasificarlo más tarde
        fecha = new Date();

    }

    public int getFallos(){
        return intentos - aciertos;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public double getPorcentaje(){
        return getAciertos() / getIntentos();
    }

    @Override
    public String toString() {
        return
                "A: " + aciertos +
                ", I: " + intentos +
                ", P: " + porcentaje +
                " %";
    }
}
