package com.asolis.myappdirectorio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.ViewHolder> {

    ArrayList<DatosVO> listaDatos = new ArrayList<>();
    private Object View;

    public AdaptadorRecycler(ArrayList<DatosVO> listaDatos) {
        this.listaDatos = listaDatos;
    }


    @Override
    public AdaptadorRecycler.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recicler_item, null,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull  AdaptadorRecycler.ViewHolder holder, int position) {
    holder.asignarDatos(listaDatos.get(position).getNombreR(),
            listaDatos.get(position).getTelefonoR(),
            listaDatos.get(position).getImagenR());
    }

    @Override
    public int getItemCount() {
        return this.listaDatos.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewN, textViewC;
        ImageView imageView;


        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            textViewN = itemView.findViewById(R.id.nombreR);
            textViewC = itemView.findViewById(R.id.telefonoR);
            imageView = itemView.findViewById(R.id.imgR);
        }
        public void asignarDatos(String nom, String tel, int ima) {
            textViewN.setText(nom);
            textViewC.setText(tel);
            imageView.setImageResource(ima);



        }
    }


}
