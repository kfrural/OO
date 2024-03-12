package com.mycompany.mavenproject1.classe;

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
    //FORMULAS
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
