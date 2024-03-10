package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Roda {
    private double raio;
    private String material;
    private double peso;
    private double maxSuporte;

    public Roda(double raio, String material, double peso, double maxSuporte) {
        this.raio = raio;
        this.material = material;
        this.peso = peso;
        this.maxSuporte = maxSuporte;
    }
    
    public Roda(){
        this.raio = 0.0;
        this.material = "";
        this.peso = 0.0;
        this.maxSuporte = 0.0;
    }
    
    public Roda(Roda outra){
        this.raio = outra.getRaio();
        this.material = outra.getMaterial();
        this.peso = outra.getPeso();
        this.maxSuporte = outra.getMaxSuporte();
    }
    
    public void copy(Roda outra){
        this.raio = outra.getRaio();
        this.material = outra.getMaterial();
        this.peso = outra.getPeso();
        this.maxSuporte = outra.getMaxSuporte();
    }

    public double getRaio() {
        return raio;
    }

    public String getMaterial() {
        return material;
    }

    public double getPeso() {
        return peso;
    }

    public double getMaxSuporte() {
        return maxSuporte;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setMaxSuporte(double maxSuporte) {
        this.maxSuporte = maxSuporte;
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preencha os trem abaixo\n\n");
        System.out.println("Raio: ");
        this.setRaio(leitor.nextDouble());
        System.out.println("Material: ");
        this.setMaterial(leitor.next());
        System.out.println("Peso: ");
        this.setPeso(leitor.nextDouble());
        System.out.println("MaxSuporte: ");
        this.setMaxSuporte(leitor.nextDouble());
    }

   
    public void imprimir() {
       System.out.println("---------------------------------");
        System.out.println("Raio:" + this.getRaio());
        System.out.println("Material:"+ this.getMaterial());
        System.out.println("Peso:"+ this.getPeso());
        System.out.println("SuporteMax:"+ this.getMaxSuporte());  
        System.out.println("---------------------------------");

    }
        
    
}
