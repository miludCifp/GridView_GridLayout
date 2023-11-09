package com.cifpceuta.gridview_gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private GridView gridListado;
    private ImageView imgAlumno;
    private TextView tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridListado = (GridView) findViewById(R.id.miGrid);
        imgAlumno = (ImageView) findViewById(R.id.imgUsuario);


    }
}