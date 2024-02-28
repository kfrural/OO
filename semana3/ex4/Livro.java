package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Livro {

    private String titulo;
    private String autor;
    private int numPagina;
    private double preco;

    public Livro() {
        this.titulo = " ";
        this.autor = " ";
        this.numPagina = 0;
        this.preco = 0.0;
    }

    public Livro(Livro outra) {
        this.titulo = outra.getTitulo();
        this.autor = outra.getAutor();
        this.numPagina = outra.getNumPagina();
        this.preco = outra.getPreco();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t\tPreencha\n\n");
        System.out.println("Informe a titulo: ");
        this.titulo = leitor.nextLine();
        System.out.println("Informe o autor: ");
        this.autor = leitor.next();
        System.out.println("Informe o numPagina: ");
        this.numPagina = leitor.nextInt();
        System.out.println("Informe a preco: ");
        this.preco = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Modelo: " + this.autor);
        System.out.println("Preco: " + this.numPagina);
        System.out.println("Memoria: " + this.preco);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getNumPagina() {
        return this.numPagina;
    }

    public double getPreco() {
        return this.preco;
    }

}
