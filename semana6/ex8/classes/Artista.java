package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Artista {

    private String nome;
    private List<Album> albuns;

    public Artista() {
        this.nome = "";
        this.albuns = new ArrayList<>();
    }

    public Artista(String nome) {
        this.nome = nome;
        //this.albuns = albuns;
    }

    public Artista(Artista outra) {
        this.nome = outra.getNome();
        this.albuns = outra.getAlbuns();
    }

    public void copy(Artista outra) {
        this.nome = outra.getNome();
        this.albuns = outra.getAlbuns();
    }

    @Override
    public String toString() {
        return "Artista{" + "nome=" + nome + ", albuns=" + albuns + '}';
    }
    
    public void adicionarAlbum(Album album){
        this.albuns.add(album);
    }
    public void adicionarMusica(String nomeAlbum, Musica musica){
        this.albuns.forEach(album ->{
            if(album.getNome().equals(nomeAlbum))
                album.getMusica().add(musica);
        });
    }
    
    public String getNome() {
        return nome;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }

}
