package com.desafiosjava.appaudio.modelos;

public class Podcast extends Audio {
    private String presentador;
    private int cantidadDeEpisodios;
    private int cantidadDeTemporadas;
    private String generodePost;
    private double duracionPost;
    private int fechaDeLanzamientoPost;

    //Metodos getters y setters


    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public int getCantidadDeEpisodios() {
        return cantidadDeEpisodios;
    }

    public void setCantidadDeEpisodios(int cantidadDeEpisodios) {
        this.cantidadDeEpisodios = cantidadDeEpisodios;
    }

    public int getCantidadDeTemporadas() {
        return cantidadDeTemporadas;
    }

    public void setCantidadDeTemporadas(int cantidadDeTemporadas) {
        this.cantidadDeTemporadas = cantidadDeTemporadas;
    }

    public String getGenerodePost() {
        return generodePost;
    }

    public void setGenerodePost(String generodePost) {
        this.generodePost = generodePost;
    }

    public double getDuracionPost() {
        return duracionPost;
    }

    public void setDuracionPost(double duracionPost) {
        this.duracionPost = duracionPost;
    }

    public int getFechaDeLanzamientoPost() {
        return fechaDeLanzamientoPost;
    }

    public void setFechaDeLanzamientoPost(int fechaDeLanzamientoPost) {
        this.fechaDeLanzamientoPost = fechaDeLanzamientoPost;
    }

    //metodos
    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() >= 2000){
            return 9;
        } else {
            return 2;
        }
    }

    public void muestraFichaPodcast(){
        System.out.println("\nTitulo: " + getTitulo());
        System.out.println("Presentador: " + getPresentador());
        System.out.println("Episodio: " + getCantidadDeEpisodios());
        System.out.println("Temporada: " + getCantidadDeTemporadas());
        System.out.println("Género: " + getGenerodePost());
        System.out.println("Fecha de lanzamiento: " + getFechaDeLanzamientoPost());
        System.out.println("Duración: " + getDuracionPost() + " minutos");
    }
}


