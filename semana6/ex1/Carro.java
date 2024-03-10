package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Carro {

    private String fabricante;
    private String modelo;
    private double motor;
    private String cor;
    private Roda[] rodas = new Roda[4];

    public Carro() {
        this.fabricante = "";
        this.modelo = "";
        this.motor = 0.0;
        this.cor = "";
        for (int i = 0; i < 4; i++) {
            this.rodas[i] = new Roda();
        }
    }

    public void copy(Carro outra) {
        this.fabricante = outra.getFabricante();
        this.modelo = outra.getModelo();
        this.motor = outra.getMotor();
        this.cor = outra.getCor();
        for (int i = 0; i < 4; i++) {
            Roda r1 = outra.getRodas()[i];
            this.rodas[i].copy(r1);
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getMotor() {
        return motor;
    }

    public String getCor() {
        return cor;
    }

    public Roda[] getRodas() {
        return rodas;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

    public void fill() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preencha os trem ai\n\n");
        System.out.println("Fabricante: ");
        this.setFabricante(leitor.next());
        System.out.println("Modelo: ");
        this.setModelo(leitor.next());
        System.out.println("Motor: ");
        this.setMotor(leitor.nextDouble());
        System.out.println("Cor: ");
        this.setCor(leitor.next());

        for (int i = 0; i < 4; i++) {
            this.getRodas()[i].fill();
        }
    }

    
    public void imprimir() {
       System.out.println("---------------------------------");
        System.out.println("Fabricante:" + this.getFabricante());
        System.out.println("Modelo:"+ this.getModelo());
        System.out.println("Motor:"+ this.getMotor());
        System.out.println("Cor:"+ this.getCor());   
        
        for (Roda ri : this.getRodas()) {
            ri.imprimir();
        }

        System.out.println("---------------------------------");

    }

   

}
