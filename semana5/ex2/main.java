package com.mycompany.mavenproject2;

/**
 *
 * @author kfrural
 */
import com.mycompany.mavenproject2.classes.Livro;
import java.util.Scanner;

public class Mavenproject2 {

    public static void main(String[] args) {
        Livro.nomeBiblioteca = "Biblioteca";
        Livro l1 = new Livro("Dexter", "Jeff", 321);
        Livro l2 = new Livro("de frente com o serial killer", "john", 127);

        l2.setNomeBiblioteca("qqcoisa");

        System.out.println(l1.nomeBiblioteca);
        System.out.println(l2.getNomeBiblioteca());

        //o metodo estico compartilha o mesmo tributo
    }
}
