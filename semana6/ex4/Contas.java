package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Contas {
    private int id;
    private String codBarras;
    private double valor;

    public Contas() {
        this.id = -1;
        this.codBarras = "";
        this.valor = 0.0;
    }

    public Contas(int id, String codBarras, double valor) {
        this.id = id;
        this.codBarras = codBarras;
        this.valor = valor;
    }
    
    
    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("------ Preenchendo os dados da Conta -----");

        System.out.print("Informe o id:");
        this.setId(leitor.nextInt());

        System.out.print("Informe o codBarras:");
        this.setCodBarras(leitor.next());

        System.out.print("Informe o valor da conta:");
        this.setValor(leitor.nextDouble());
                
    }
    
    public void copy(Contas outra){
        this.id = outra.getId();
        this.codBarras = outra.getCodBarras();
        this.valor = outra.getValor();    
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Id:" + this.getId());
        System.out.println("CodBarras:" + this.getCodBarras());
        System.out.println("Valor:" + this.getValor());
        System.out.println("------------------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
