package com.desafiosjava.appaudio.principal;
import com.desafiosjava.appaudio.modelos.Cancion;
import com.desafiosjava.appaudio.modelos.Podcast;
import com.desafiosjava.appaudio.modelos.Favoritos;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion(); //instanciando objetos
        miCancion.setTitulo("Bitter Sweet Symphony");
        miCancion.setCantante("The Verve");
        miCancion.setAutor("Richard Ashcroft");
        miCancion.setAlbum("Urban Hymns");
        miCancion.setGeneroDeCancion("Rock Sinfónico");
        miCancion.setProductor("Martin Glover");
        miCancion.setFechaDePublicacion(1997);
        miCancion.setDuracion(5.58);

        Podcast miPodcast= new Podcast();
        miPodcast.setTitulo("Palabra Plena");
        miPodcast.setPresentador("Gabriel Rolón");
        miPodcast.setCantidadDeEpisodios(12);
        miPodcast.setCantidadDeTemporadas(1);
        miPodcast.setGenerodePost("Psicología");
        miPodcast.setDuracionPost(60);
        miPodcast.setFechaDeLanzamientoPost(2020);

        //Para me gusta y reprodución de canción
        for (int i = 0; i < 5080; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 8400; i++) {
            miCancion.reproducion();
        }
        //Para me gusta y reprodución de poscast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 350; i++) {
            miPodcast.reproducion();
        }

        //mostrar ficha tecnica, total de me gusta, reproducciones,y favoritos
        System.out.println("*********** Ficha de la canción *********** ");
        miCancion.muestraFichaCancion();
        System.out.println("Esta canción tiene " + miCancion.getTotalMeGusta() + " me gusta.");
        System.out.println("Esta canción tiene " + miCancion.getTotalDeReproducciones() + " reproducciones.");
        Favoritos favoritos = new Favoritos();
        favoritos.adiciona(miCancion);
        System.out.println("\n****************************************** ");

        System.out.println("\n************ Ficha de Podcast ************ ");
        miPodcast.muestraFichaPodcast();
        System.out.println("Este podcast tiene " + miPodcast.getTotalMeGusta() + " me gusta.");
        System.out.println("Este podcast tiene " + miPodcast.getTotalDeReproducciones() + " reproducciones.");
        favoritos.adiciona(miPodcast);
        System.out.println("\n***************************************** ");
    }
}
