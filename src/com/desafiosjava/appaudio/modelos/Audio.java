package com.desafiosjava.appaudio.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducciones;
    private int totalMeGusta;
    private int clasificacion;

    //Metodos getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    //metodos
    public void meGusta(){
        this.totalMeGusta++; //para acumular me gusta
    }

    public void reproducion(){
        this.totalDeReproducciones++;//para acumular reproducciones
    }

}
