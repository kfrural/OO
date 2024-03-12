package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Ponto;

/**
 *
 * @author kfrural
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        
               Ponto p = new Ponto(4, 40);
        Ponto p2 = new Ponto(2,2);
        Ponto p3 = new Ponto(6,6);
        
       // p.fill();
       // System.out.println("Distancia: " + p.distancia(p, p2));
       p.isColinear(p, p2, p3);
    }
}
