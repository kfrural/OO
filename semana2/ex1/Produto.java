package com.mycompany.mavenproject1;

/**
 *
 * @author kfrural
 */
public class Produto {
    private int id;
    private double preco;
    private String nome;
    
    public Produto(int par, double par1, String arroz){
        this.id = 0;
        this.preco = 0.0;
        this.nome = " ";
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getId(){
        return this.id;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getNome(){
        return this.nome;
    }
}


