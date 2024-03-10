package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Proprietario {
    private String nome;
    private String cpf;
    private String email;
    private Carro[] carros = new Carro[2];
    
    public Proprietario(){
        this.nome = "";
        this.cpf = "";
        this.email = "";
        for(int i = 0; i < 2; i++){
            this.carros[i] = new Carro();
        }
    }
    
    public void copy(Proprietario outra){
        this.nome = outra.getNome();
        this.cpf = outra.getCpf();
        this.email = outra.getEmail();
        for(int i = 0; i < 2; i++){
            Carro c1 = outra.getCarros()[i];
            this.carros[i].copy(c1);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preencha os trem ai\n\n");
        System.out.println("Nome: ");
        this.setNome(leitor.next());
        System.out.println("cpf: ");
        this.setCpf(leitor.next());
        System.out.println("Email: ");
        this.setEmail(leitor.next());
        
        for(int i = 0; i < 2; i++){
            this.getCarros()[i].fill();
        }
    }
    
    public void imprimir(){
        System.out.println("Impressao\n\n");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cpf: "+ this.getCpf());
        System.out.println("Email: " + this.getEmail());
        for(Carro ci : this.getCarros()){
            ci.imprimir();
        }
    }
    
}
