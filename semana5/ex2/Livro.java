package com.mycompany.mavenproject2.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Livro {

    private String titulo;
    private String autor;
    private int numPag;
    public static String nomeBiblioteca;

    public Livro(String titulo, String autor, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

   public Livro(){
        this.titulo = "";
        this.autor = "";
        this.numPag = 0;
   }
    
    public Livro(Livro outra) {
        this.titulo = outra.getTitulo();
        this.autor = outra.getAutor();
        this.numPag = outra.getNumPag();
    }

    public void copy(Livro outra) {
        this.titulo = outra.getTitulo();
        this.autor = outra.getAutor();
        this.numPag = outra.getNumPag();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    public void setNomeBiblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getNumPag() {
        return this.numPag;
    }
    
    public String getNomeBiblioteca(){
        return this.nomeBiblioteca;
    }

    public void fill() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Titulo: ");
        this.titulo = leitor.next();
        System.out.println("Autor: ");
        this.autor = leitor.next();
        System.out.println("NumPag: ");
        this.numPag = leitor.nextInt();
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }

    

}
