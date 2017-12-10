package com.example.balbuena.appbaloncesto.Adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.balbuena.appbaloncesto.R;
import com.example.balbuena.appbaloncesto.logica.Perfil;

import java.util.List;

/**
 * Created by Balbuena on 02/11/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PerfilViewHolder>{

    List<Perfil> perfiles;

    public RVAdapter(List<Perfil> perfiles){
        this.perfiles = perfiles;
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PerfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        PerfilViewHolder pvh = new PerfilViewHolder(view);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PerfilViewHolder holder, int position) {
        holder.nombre.setText(perfiles.get(position).getNombre());
        holder.apellidos.setText(perfiles.get(position).getApellido());
        holder.edad.setText(perfiles.get(position).getEdad());
        holder.peso.setText(perfiles.get(position).getPeso());
        holder.photo.setImageResource(R.drawable.basketicon);
    }

    @Override
    public int getItemCount() {
        return perfiles.size();
    }

    public static class PerfilViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView apellidos;
        TextView edad;
        TextView peso;
        ImageView photo;

        PerfilViewHolder(View itemView) {
            super(itemView);
            nombre = (TextView)itemView.findViewById(R.id.person_name);
            apellidos = (TextView)itemView.findViewById(R.id.person_ape);
            edad = (TextView)itemView.findViewById(R.id.person_age);
            peso = (TextView)itemView.findViewById(R.id.person_weight);
            photo = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }


}
