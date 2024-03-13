package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Triangulo {
    private Ponto[] pontos = new Ponto[3];
    
    public Triangulo(){
        for(int i = 0; i < 3; i++){
            this.pontos[i] = new Ponto();
        }
    }
    
    public void copy(Ponto outra){
        for(int i = 0; i < 3; i ++){
            Ponto p = outra.getPontos()[i];
            this.pontos[i].copy(p);
        }
    }

    public void fill(){
        System.out.println("Preencha os trem ai\n\n");
        for(int i = 0; i < 3; i++){
            this.getPontos()[i].fill();
        }
    }
    
    public void imprimir(){
        System.out.println("A impressao dos trem\n\n");
        for(Ponto p : this.getPontos()){
            p.imprimir();
        }
    }
    public double distancia(Ponto p1, Ponto p2){
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
    
    public void isColinear(Ponto p1, Ponto p2, Ponto p3){
        double a = p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() *(p1.getY() - p2.getY());
        if(a == 0){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");
        }
    }
     public double calcularArea() {

    double[] distancias = new double[3];
    for (int i = 0; i < 3; i++) {
        for (int j = i + 1; j < 3; j++) {
            distancias[i] = this.distancia(this.pontos[i], this.pontos[j]);
        }
    }

    double maiorDistancia = Math.max(distancias[0], Math.max(distancias[1], distancias[2]));
    double menorDistancia = Math.min(distancias[0], Math.min(distancias[1], distancias[2]));

    double base = maiorDistancia;
    double altura = menorDistancia;

    return (base * altura) / 2;
    }
     
    
    public Ponto[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto[] pontos) {
        this.pontos = pontos;
    }
    
    
}
