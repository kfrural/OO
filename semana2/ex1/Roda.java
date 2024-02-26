package com.mycompany.mavenproject1;

/**
 *
 * @author kfrural
 */
public class Roda {

    private double raio;
    private String material;
    private double peso;

    public Roda() {
        this.raio = 0.0;
        this.material = " ";
        this.peso = 0.0;
    }
    
    public Roda(double raio, String material, double peso){
        this.raio = 0.0;
        this.material = " ";
        this.peso = 0.0;
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

    public double getRaio() {
        return this.raio;
    }

    public String getMaterial() {
        return this.material;
    }

    public double getPeso() {
        return this.peso;
    }
}
