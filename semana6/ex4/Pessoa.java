package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private List<Contas> listaContas;

    public Pessoa() {
        this.nome = "";
        this.cpf = "";
        this.email = "";
        this.listaContas = new ArrayList<>();
    }

    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        
        this.listaContas = new ArrayList<>();
    }
    
    public void fill() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("------ Preenchendo os dados da Pessoa -----");

        System.out.print("Informe o nome:");
        this.nome = leitor.next();

        System.out.print("Informe a idade:");
        this.email = leitor.next();

        System.out.print("Informe o CPF:");
        this.cpf = leitor.next();
        
        
        String resposta = "n";
        do{
            Contas conta = new Contas();
            conta.preencher();
            this.getListaContas().add(conta);
            
            System.out.print("Deseja inserir mais conta(s/n) ?");
            resposta = leitor.next();            
        }while(resposta.equals("s"));
        
        
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Nome:" + this.nome);
        System.out.println("Email:" + this.email);
        System.out.println("CPF:" + this.cpf);
        
        for(int i=0; i <= this.getListaContas().size()-1;i++){
            Contas conta_i = this.getListaContas().get(i);
            conta_i.imprimir();
            
        }
        System.out.println("------------------------");
    }
    
    public void copiar(Pessoa outra) {
        this.nome = outra.getNome();
        this.email = outra.getEmail();
        this.cpf = outra.getCpf();
        
        this.listaContas = new ArrayList<>();
        for(int i=0; i<= outra.getListaContas().size()-1; i++){
            Contas outra_conta_i = outra.getListaContas().get(i);
                                
            Contas nova = new Contas();
            nova.copy(outra_conta_i);
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Contas> getListaContas() {
        return listaContas;
    }

}
