
package com.mycompany.mavenproject1;

/**
 *
 * @author kfrural
 */
public class Proprietario {
    private String nome;
    private String cpf;
    
    public Proprietario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public Proprietario(Proprietario outra){
        this.nome = outra.nome;
        this.cpf = outra.cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
}
