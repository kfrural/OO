package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Cliente {

    private String nome;
    private Contas conta;

    public Cliente() {
        this.nome = "";
        this.conta = new Contas();
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preenchendo os trem ai\n\n");
        System.out.println("Nome: ");
        this.setNome(leitor.next());
        this.conta.preencher();
    }

    public void imprimir() {
        System.out.println("Imprimindo os trem \n\n");
        System.out.println("Nome: " + this.getNome());
        this.conta.imprimir();
    }

    public void depositar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor q ce quer depositar: ");
        double deposito = leitor.nextDouble();
        this.conta.depositar(deposito);
    }

    public void setConta(Contas conta) {
        this.conta = conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contas getConta() {
        return this.conta;
    }

    public String getNome() {
        return nome;
    }

}
