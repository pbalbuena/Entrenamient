package com.example.balbuena.appbaloncesto.logica.ejercicios;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Balbuena on 15/11/2017.
 */

public class TablaEjercicio {

    private final Date fecha;
    public ArrayList<Ejercicio> ejercicios;
    private double porcentaje;
    private double maxPorcentaje;

    public TablaEjercicio(){
        ejercicios = new ArrayList<Ejercicio>();
        fecha = new Date();
        crearEjercicios();
    }

    @Override
    public String toString() {
        //solo muestro la fecha en la que se inició la tabla
        return "Tabla de tiro del día " + SimpleDateFormat.getDateInstance().format(fecha);
    }

    private void crearEjercicios() {
        Ejercicio cerca = new EjercicioTiroDentroZona();
        Ejercicio lejos = new EjercicioTiroFueraZona();
        Ejercicio libre = new EjercicioTiroLibre();
        Ejercicio triple = new EjercicioTiroTriple();
        ejercicios.add(cerca);
        ejercicios.add(lejos);
        ejercicios.add(libre);
        ejercicios.add(triple);
    }

    public double getMaxPorcentaje(){
        double porcentajeEjercicio;
        for (Ejercicio e : ejercicios ) {
            porcentajeEjercicio = e.getPorcentaje();
            if(maxPorcentaje < porcentajeEjercicio){
                maxPorcentaje = porcentajeEjercicio;
            }
        }
        return maxPorcentaje;
    }

    public int getTotalAciertos(){
        int total = 0;
        for (Ejercicio e : ejercicios ) {
            total += e.getAciertos();
        }
        return total;
    }

    public int getTotalFallos(){
        int total = 0;
        for (Ejercicio e : ejercicios ) {
            total += e.getFallos();
        }
        return total;
    }

    public int getTotalIntentos(){
        int total = 0;
        for (Ejercicio e : ejercicios ) {
            total += e.getIntentos();
        }
        return total;
    }

    public double getTotalPorcentaje(){
        double total = 0;
        total = getTotalAciertos()/getTotalIntentos();
        porcentaje = total;
        return total;
    }
}
