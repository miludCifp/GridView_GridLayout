package com.cifpceuta.gridview_gridlayout;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterGridView extends ArrayAdapter<Usuario> {
    private final Activity contexto;
    ArrayList<Usuario> usuarios;

    LayoutInflater inflador;

    public AdapterGridView(Activity c, ArrayList<Usuario> u){
        super(c, R.layout.usuario_item, u);
        this.contexto = c;
        this.usuarios = u;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        inflador = contexto.getLayoutInflater();
        View rowView = inflador.inflate(R.layout.usuario_item, null, false);
        Usuario alumno = usuarios.get(position);

        ImageView imgVwUsuario;
        TextView tvNombre;

        imgVwUsuario = (ImageView) rowView.findViewById(R.id.imgUsuario);
        tvNombre = (TextView) rowView.findViewById(R.id.tvNombre);

        imgVwUsuario.setImageResource(alumno.getImagenUsuario());
        tvNombre.setText(alumno.getNombreUsuario());

        return rowView;
    }


}
