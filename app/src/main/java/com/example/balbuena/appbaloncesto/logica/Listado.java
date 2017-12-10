package com.example.balbuena.appbaloncesto.logica;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Balbuena on 01/11/2017.
 */

public class Listado implements Serializable{

    private static final long serialVersionUID = 1L;

    List<Perfil> perfiles;

    public Listado(){
        perfiles = new ArrayList<Perfil>();
    }

    public Listado(ArrayList<Perfil> perfiles){
        this.perfiles = perfiles;
    }

    public List<Perfil> getList(){
        return perfiles;
    }


}
