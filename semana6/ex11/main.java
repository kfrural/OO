package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Banco;
import com.mycompany.mavenproject3.classes.Conta;
import com.mycompany.mavenproject3.classes.Transacao;


public class Mavenproject3 {
     public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Conta conta1 = new Conta("123", "Ana", 500.0);
        Conta conta2 = new Conta("456", "Carlos", -150.0);
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        Transacao transacao1 = new Transacao("T001", "Depósito", 300.0, "2023-03-15", conta1);
        banco.adicionarTransacao(transacao1);

        System.out.println("Conta com maior saldo: " + banco.maiorSaldo().getTitular());
        System.out.println("Conta com menor saldo (maior devedor): " + banco.menorSaldo().getTitular());
        System.out.println("Total de devedores do banco: " + banco.devedor());
        System.out.println("Total de credores do banco: " + banco.credor());
    }
}
