package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Carro {

    private String modelo;
    private int ano;
    private String cor;

    public Carro() {
        this.modelo = "";
        this.ano = 0;
        this.cor = "";
    }

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("------ Preenchendo os dados do Carro -----");

        System.out.print("Informe o modelo:");
        this.modelo = leitor.next();

        System.out.print("Informe o ano de fabricacao:");
        this.ano = leitor.nextInt();

        System.out.print("Informe a cor:");
        this.cor = leitor.next();
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ano:" + this.ano);
        System.out.println("Cor:" + this.cor);
        System.out.println("------------------------");
    }

    public void buzinar() {
        System.out.println("O carro " + this.modelo + " está buzinando!");
        System.out.println("bibibi");
    }//mok

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
