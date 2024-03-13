package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Ponto {
    private double x;
    private double y;
    
    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto(Ponto outra){
        this.x = outra.getX();
        this.y = outra.getY();
    }
    
    public void copy(Ponto outra){
        this.x = outra.getX();
        this.y = outra.getY();
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\tPreencha os trem ai\n\n");
        System.out.println("X: ");
        this.setX(leitor.nextDouble());
        System.out.println("Y: ");
        this.setY(leitor.nextDouble());
    }

 public void imprimir(){
     System.out.println("A impressao dos trem\n\n");
     System.out.println("X: " + this.x);
     System.out.println("Y: " + this.y);
 }
  
   public static double distancia(Ponto p1, Ponto p2) {
    double dx = p2.getX() - p1.getX();
    double dy = p2.getY() - p1.getY();
    return Math.sqrt(dx * dx + dy * dy);
}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
