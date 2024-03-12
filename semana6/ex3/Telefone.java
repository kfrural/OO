package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Telefone {
    private String ddd;
    private String numero;
    private String descricao;
    private String operadora;

    public Telefone(String ddd, String numero, String descricao, String operadora) {
        this.ddd = ddd;
        this.numero = numero;
        this.descricao = descricao;
        this.operadora = operadora;
    }
    
    public Telefone(){
        this.ddd = "";
        this.numero = "";
        this.descricao = "";
        this.operadora = "";
    }
    
    public Telefone(Telefone outra){
        this.ddd = outra.getDdd();
        this.numero = outra.getNumero();
        this.descricao = outra.getDescricao();
        this.operadora = outra.getOperadora();
    }
    
    public void copy(Telefone outra){
        this.ddd = outra.getDdd();
        this.numero = outra.getNumero();
        this.descricao = outra.getDescricao();
        this.operadora = outra.getOperadora();
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\tPreencha os trem ai\n\n");
        System.out.println("DDD: ");
        this.setDdd(leitor.next());
        System.out.println("Numero: ");
        this.setNumero(leitor.next());
        System.out.println("Descricao: ");
        this.setDescricao(leitor.next());
        System.out.println("Operadora: ");
        this.setOperadora(leitor.next());
    }
    
    public void imprimir(){
        System.out.println("\tOs trem ai\n\n");
        System.out.println("DDD: " + this.getDdd());
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Operadora: " + this.getOperadora());
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    
}
