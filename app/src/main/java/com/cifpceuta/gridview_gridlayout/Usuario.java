package com.cifpceuta.gridview_gridlayout;

public class Usuario {
    private int imagenUsuario;
    private String nombreUsuario;

    public Usuario() {
    }

    public Usuario(int imagenUsuario, String nombreUsuario) {
        this.imagenUsuario = imagenUsuario;
        this.nombreUsuario = nombreUsuario;
    }

    public int getImagenUsuario() {
        return imagenUsuario;
    }

    public void setImagenUsuario(int imagenUsuario) {
        this.imagenUsuario = imagenUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
