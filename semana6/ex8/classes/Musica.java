package com.mycompany.mavenproject3.classes;



/**
 *
 * @author kfrural
 */
public class Musica {
    private String titulo;
    private double duracao;
    
    public Musica(){
        this.titulo = "";
        this.duracao = 0.0;
    }
    public Musica(String titulo, double duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    public Musica( Musica outra){
        this.titulo = outra.getTitulo();
        this.duracao = outra.getDuracao();
    }
    
    public void copy( Musica outra){
        this.titulo = outra.getTitulo();
        this.duracao = outra.getDuracao();
    }

    @Override
    public String toString() {
        return "Musica{" + "titulo=" + titulo + ", duracao=" + duracao + '}';
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    
}
