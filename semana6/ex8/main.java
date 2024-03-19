package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Album;
import com.mycompany.mavenproject3.classes.Artista;
import com.mycompany.mavenproject3.classes.Musica;
import com.mycompany.mavenproject3.classes.Gerenciador;

public class Mavenproject3 {

    public static void main(String[] args) {
        Artista artista1 = new Artista("Artista1");
        Album album1 = new Album("Álbum 1", 2020);
        Album album2 = new Album("Álbum 2", 2021);

        artista1.adicionarAlbum(album1);
        artista1.adicionarAlbum(album2);

        Musica musica1 = new Musica("Música 1", 3.30);
        Musica musica2 = new Musica("Música 2", 4.00);

        artista1.adicionarMusica("Álbum 1", musica1);
        artista1.adicionarMusica("Álbum 1", musica2); 

        Gerenciador gerenciador = new Gerenciador();

        gerenciador.adicionarArtista(artista1);

        Artista artistaComMaisAlbuns = gerenciador.artistaMaisAlbuns();

        System.out.println("Artista com mais álbuns: " + artistaComMaisAlbuns.getNome());

        Album albumComMaisMusicas = gerenciador.albunMaisMusica();

        System.out.println("Álbum com mais músicas: " + albumComMaisMusicas.getNome());
    }
}
