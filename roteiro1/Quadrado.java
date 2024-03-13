package com.mycompany.mavenproject3.classes;

/**
 *
 * @author kfrural
 */
public class Quadrado {
    private Ponto[] pontos = new Ponto[4];
    
    public Quadrado(){
        for(int i = 0; i < 4; i++){
            this.pontos[i] = new Ponto();
        }
    }
    
    public void copy(Quadrado outra){
        for(int i = 0; i < 4; i++){
            Ponto p = outra.getPontos()[i];
            this.pontos[i].copy(p);
        }
    }
    
    public void imprimir(){
        System.out.println("Os trem preenchido ai\n\n");
        for(Ponto p : getPontos()){
            p.imprimir();
        }
    }
    
    public static boolean isQuadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        return Ponto.distancia(p1, p2) == Ponto.distancia(p3, p4);
    }
    
     private double calcularLado() {
        return Ponto.distancia(pontos[0], pontos[1]);
    }
    
     public double calcularArea() {
        double lado = calcularLado();
        return lado * lado;
    }
     
     public double calcularPerimetro() {
        double lado = calcularLado();
        return 4 * lado;
    }

    public Ponto[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto[] pontos) {
        this.pontos = pontos;
    }
    
    
}
