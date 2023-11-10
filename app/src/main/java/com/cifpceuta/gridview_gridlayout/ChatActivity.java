package com.cifpceuta.gridview_gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {
    private ImageView imgUsuario;
    private TextView tvNombreUsuario, tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        imgUsuario = (ImageView) findViewById(R.id.imgUsuarioChat);
        tvNombreUsuario = (TextView) findViewById(R.id.tvNombreUserChat);
        tvMensaje = (TextView) findViewById(R.id.tvMensajeChat);

        Intent i = getIntent();
        imgUsuario.setImageResource(i.getIntExtra("extra_ImagenUsuario",0));
        tvNombreUsuario.setText(i.getStringExtra("extra_NombreUsuario"));

    }
    public void btnCerrarChat(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}