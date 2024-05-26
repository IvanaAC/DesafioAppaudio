package com.desafiosjava.appaudio.modelos;

public class Favoritos {
    //metodo para adicionar favoritos
    public void adiciona (Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " es uno de los favoritos del momento.");
        } else{
            System.out.println(audio.getTitulo() + " también es un favorito.");
        }

    }
}
