package com.desafiosjava.appaudio.modelos;

public class Cancion extends Audio {
    private String cantante;
    private String autor;
    private String album;
    private String generoDeCancion;
    private String productor;
    private int fechaDePublicacion;
    private double duracion;

    //Metodos getters y setters
    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGeneroDeCancion() {
        return generoDeCancion;
    }

    public void setGeneroDeCancion(String generoDeCancion) {
        this.generoDeCancion = generoDeCancion;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public int getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(int fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

//metodos

    @Override
    public int getClasificacion() { //para clasificación
        if (getTotalMeGusta() > 3000){
            return 8;
        }else {
            return 4;
        }
    }


    public void muestraFichaCancion(){
        System.out.println("\nTitulo: " + getTitulo());
        System.out.println("Interprete: " + getCantante());
        System.out.println("Autor: " + getAutor());
        System.out.println("Nombre del Albúm: " + getAlbum());
        System.out.println("Género: " + getGeneroDeCancion());
        System.out.println("Productor: " + getProductor());
        System.out.println("Fecha de lanzamiento: " + getFechaDePublicacion());
        System.out.println("Duración: " + getDuracion() + " minutos");
    }
}
