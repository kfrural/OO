package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.AgendaTelefonica;

/**
 *
 * @author kfrural
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica("Jhon", "9814-6173");
        agenda.adicionarContato("Karla", "9845-4978");
        agenda.adicionarContato("Jhon", "9814-6173");
        System.out.println(agenda.buscarTelefone("Karla"));
        agenda.imprimirContatos();
        agenda.removerContato("Karla");
        agenda.imprimirContatos();
    }
}
