package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Motorista {

    private String nome;
    private Carro carro;

    public Motorista() {
        this.nome = "";
        this.carro = new Carro();
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("------ Preenchendo o motorista -----");

        System.out.print("Informe o nome:");
        this.nome = leitor.next();

        this.carro.preencher();
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Nome:" + this.nome);
        this.carro.imprimir();
        System.out.println("------------------------");
    }

    public void dirigir() {
        System.out.println("Dirigindo o carro " + carro.getModelo());
        carro.buzinar();
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return this.carro;
    }
}
