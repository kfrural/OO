package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Cliente {

    private String nome;
    private final Produto produto;

    public Cliente() {
        this.nome = "";
        this.produto= new Produto();
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preenchendo os trem ai\n\n");
        System.out.println("Nome: ");
        this.setNome(leitor.next());
        this.produto.fill();
    }

    public void imprimir() {
        System.out.println("Imprimindo os trem \n\n");
        System.out.println("Nome: " + this.getNome());
        this.produto.toString();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
