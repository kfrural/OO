package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Cliente;


/**
 *
 * @author kfrural
 */
public class Mavenproject3 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.getConta().preencher();
        cliente.imprimir();
        cliente.depositar();
        cliente.imprimir();
    }

}
