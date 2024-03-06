package com.mycompany.mavenproject2;

/**
 *
 * @author kfrural
 */
import com.mycompany.mavenproject2.classes.Pessoa;
import java.util.Scanner;

public class Mavenproject2 {

    public static void main(String[] args) {

Pessoa p1 = new Pessoa("Jose", 50, 1.75, "M");
Pessoa p2 = new Pessoa("Maria", 30, 1.70, "F");
Pessoa p3 = new Pessoa(p1);

System.out.println(Pessoa.contador);
    }
}
