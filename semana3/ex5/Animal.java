package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Animal {

    private String especie;
    private String raca;
    private int idade;
    private double peso;

    public Animal() {
        this.especie = " ";
        this.raca = " ";
        this.idade = 0;
        this.peso = 0.0;
    }

    public Animal(Animal outra) {
        this.especie = outra.getEspecie();
        this.raca = outra.getRaca();
        this.idade = outra.getIdade();
        this.peso = outra.getPeso();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t\tPreencha\n\n");
        System.out.println("Informe a especie: ");
        this.especie = leitor.nextLine();
        System.out.println("Informe o raca: ");
        this.raca = leitor.next();
        System.out.println("Informe o idade: ");
        this.idade = leitor.nextInt();
        System.out.println("Informe a peso: ");
        this.peso = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Especie: " + this.especie);
        System.out.println("Modelo: " + this.raca);
        System.out.println("Peso: " + this.idade);
        System.out.println("Memoria: " + this.peso);
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return this.especie;
    }

    public String getRaca() {
        return this.raca;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

}
