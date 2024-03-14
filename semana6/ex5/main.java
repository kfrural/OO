package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Carro;
import com.mycompany.mavenproject3.classes.Motorista;

/**
 *
 * @author kfrural
 */
public class Mavenproject3 {

    Carro c1 = new Carro("uninho", 2002, "branquin");

    Motorista motorista = new Motorista();
    
    motorista.setCarro(c1);
    motorista.dirigir();
}
