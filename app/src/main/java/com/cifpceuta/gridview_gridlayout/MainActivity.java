package com.cifpceuta.gridview_gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridListado;
    private ImageView imgAlumno;
    private TextView tvTituloGrid;
    private AdapterGridView adptGridVw;
    private ArrayList<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridListado = (GridView) findViewById(R.id.miGrid);
        tvTituloGrid = (TextView) findViewById(R.id.tituloGrid);
        //imgAlumno = (ImageView) findViewById(R.id.imgVwUsuario);

        usuarios = new ArrayList<>();
        usuarios.add(new Usuario(R.drawable.avatar1_chico,"Usuario 1"));
        usuarios.add(new Usuario(R.drawable.avatar2_chica,"Usuario 2"));
        usuarios.add(new Usuario(R.drawable.avatar3_chico,"Usuario 3"));
        usuarios.add(new Usuario(R.drawable.avatar4_chica,"Usuario 4"));

        adptGridVw = new AdapterGridView(this, usuarios);
        gridListado.setAdapter(adptGridVw);

        gridListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Usuario userPulsado = (Usuario) adptGridVw.getItem(position);
                Intent i = new Intent(view.getContext(), ChatActivity.class);
                i.putExtra("extra_ImagenUsuario", userPulsado.getImagenUsuario());
                i.putExtra("extra_NombreUsuario", userPulsado.getNombreUsuario());
                startActivity(i);
            }
        });



    }

}