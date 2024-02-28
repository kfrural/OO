package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Bicicleta {

    private String marca;
    private String modelo;
    private int tamQuadro;
    private double preco;

    public Bicicleta() {
        this.marca = " ";
        this.modelo = " ";
        this.tamQuadro = 0;
        this.preco = 0.0;
    }

    public Bicicleta(Bicicleta outra) {
        this.marca = outra.getMarca();
        this.modelo = outra.getModelo();
        this.tamQuadro = outra.getTamQuadro();
        this.preco = outra.getPreco();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t\tPreencha\n\n");
        System.out.println("Informe a marca: ");
        this.marca = leitor.nextLine();
        System.out.println("Informe o modelo: ");
        this.modelo = leitor.next();
        System.out.println("Informe o tamQuadro: ");
        this.tamQuadro = leitor.nextInt();
        System.out.println("Informe a preco: ");
        this.preco = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preco: " + this.tamQuadro);
        System.out.println("Memoria: " + this.preco);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamQuadro(int tamQuadro) {
        this.tamQuadro = tamQuadro;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getTamQuadro() {
        return this.tamQuadro;
    }

    public double getPreco() {
        return this.preco;
    }

}
