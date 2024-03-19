package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author kfrural
 */
public class Album {
    private String nome;
    private int anoLancamento;
    private List <Musica> musica;

    public Album(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        //this.musica = musica;
    }
    
    public Album(){
        this.nome = "";
        this.anoLancamento = 0;
        this.musica = new ArrayList<>();
    }
    
    public Album(Album outra){
        this.nome = outra.getNome();
        this.anoLancamento = outra.getAnoLancamento();
        this.musica = outra.getMusica();
    }
    
    public void copy(Album outra){
        this.nome = outra.getNome();
        this.anoLancamento = outra.getAnoLancamento();
        this.musica = outra.getMusica();
    }

    @Override
    public String toString() {
        return "Album{" + "nome=" + nome + ", anoLancamento=" + anoLancamento + ", musica=" + musica + '}';
    }
    
    public void adicionar(Musica musica){
        this.musica.add(musica);
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public List<Musica> getMusica() {
        return musica;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setMusica(List<Musica> musica) {
        this.musica = musica;
    }
    
    
}
