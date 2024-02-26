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
        Proprietario p1 = new Proprietario("ze", "12345678900");
        
        System.out.println("O proprietario " + p1.getNome() " do cpf: " + p1.getCpf() );
        System.out.println("O nome eh: " + c1.getNome() + "\nA marca eh: " + c1.getMarca() + "\nO motor eh: " + c1.getMotor());
    }
}
