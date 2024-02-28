package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Celular {

    private String marca;
    private String modelo;
    private double preco;
    private int memoria;

    public Celular() {
        this.marca = " ";
        this.modelo = " ";
        this.preco = 0.0;
        this.memoria = 0;
    }

    public Celular(Celular outra) {
        this.marca = outra.getMarca();
        this.modelo = outra.getModelo();
        this.preco = outra.getPreco();
        this.memoria = outra.getMemoria();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t\tPreencha\n\n");
        System.out.println("Informe a marca: ");
        this.marca = leitor.nextLine();
        System.out.println("Informe o modelo: ");
        this.modelo = leitor.nextLine();
        System.out.println("Informe o preco: ");
        this.preco = leitor.nextDouble();
        System.out.println("Informe a memoria: ");
        this.memoria = leitor.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preco: " + this.preco);
        System.out.println("Memoria: " + this.memoria);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getMemoria() {
        return this.memoria;
    }

}
