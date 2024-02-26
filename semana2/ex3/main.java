/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author kfrural
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Carro c1 = new Carro("uno", "fiat", 1.0);
        Carro c2 = new Carro(c1);
        
        System.out.println("O nome eh: " + c1.getNome() + "\nA marca eh: " + c1.getMarca() + "\nO motor eh: " + c1.getMotor());
        System.out.println("O nome eh: " + c2.getNome() + "\nA marca eh: " + c2.getMarca() + "\nO motor eh: " + c2.getMotor());
    }
}
