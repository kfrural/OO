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

    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
    
//    public double distancia(Ponto p){
//        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
//    }
    

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
