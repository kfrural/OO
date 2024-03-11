package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Ponto;

/**
 *
 * @author kfrural
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        
        Ponto p = new Ponto();
        Ponto p2 = new Ponto(12,12);
        
        p.fill();
        System.out.println("DISTANCIA:  " + p.distancia(p2));
    }
}
