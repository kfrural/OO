package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Produto {
    private String nome;
    private int qtd;
    private double preco;
    
    public Produto(){
        this.nome = "";
        this.qtd = 0;
        this.preco = 0.0;
    }
    public void Produto(String nome, int qtd, double preco){
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preenche os trem ai\n");
        System.out.println("Nome: ");
        this.setNome(leitor.next());
        System.out.println("Qtd: ");
        this.setQtd(leitor.nextInt());
        System.out.println("Preco: ");
        this.setPreco(leitor.nextDouble());
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + getNome() + ",qtd=" + getQtd() +  ",preco=" + getPreco() + '}';
    }
    
    

    public String getNome() {
        return nome;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
        
}
