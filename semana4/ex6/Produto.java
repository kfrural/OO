package com.mycompany.mavenproject1.classe;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Produto {
    private String codigo;
    private String nome;
    private int quantidadeEmEstoque;

    public Produto(String codigo, String nome, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    public Produto(){
        this.codigo = "";
        this.nome = "";
        this.quantidadeEmEstoque = 0;
    }
    
    public Produto(Produto outra){
        this.codigo = outra.getCodigo();
        this.nome = outra.getNome();
        this.quantidadeEmEstoque = outra.getQuantidadeEmEstoque();
    }
    
    public void copy(Produto outra){
        this.codigo = outra.getCodigo();
        this.nome = outra.getNome();
        this.quantidadeEmEstoque = outra.getQuantidadeEmEstoque();
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preencha os trem ai\n\n");
        System.out.println("Codigo: ");
        this.setCodigo(leitor.next());
        System.out.println("Nome: ");
        this.setNome(leitor.next());
        System.out.println("Quantidade Estoque: ");
        this.setQuantidadeEmEstoque(leitor.nextInt());
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto{\n" + "codigo=" + codigo + ",\n nome=" + nome + ", \nquantidadeEmEstoque=" + quantidadeEmEstoque + '}';
    }
    
    
    
}
