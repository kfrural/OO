package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;

    public Pessoa() {
        this.nome = "";
        this.cpf  = "";
        this.idade = 0;
    }

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public Pessoa(Pessoa outro){
        this.nome = outro.getNome();
         this.cpf = outro.getCpf();
        this.idade = outro.getIdade();
    }
    
    public void copy(Pessoa outro){
        this.nome = outro.getNome();
         this.cpf = outro.getCpf();
        this.idade = outro.getIdade();
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        this.setNome(ler.next());
        System.out.println("CPF: ");
        this.setCpf(ler.next());
        System.out.println("Idade: ");
        this.setIdade(ler.nextInt());
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + '}';
    } 
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
}