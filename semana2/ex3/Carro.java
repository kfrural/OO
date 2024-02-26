/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kfrural
 */
public class Carro {

    private String nome;
    private String marca;
    private double motor;
    
    public Carro(String nome, String marca, double motor){
        this.nome = nome;
        this.marca = marca;
        this.motor = motor;
    }
    
    public Carro(Carro outra){
         this.nome = outra.nome;
        this.marca = outra.marca;
        this.motor = outra.motor;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getMotor() {
        return this.motor;
    }
}
