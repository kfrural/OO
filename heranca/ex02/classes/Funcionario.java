package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Funcionario {
    protected String cpf;
    protected String nome;

    public Funcionario() {
        this.cpf = "";
        this.nome = "";
    }

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public Funcionario(Funcionario outro){
        this.cpf = outro.getCpf();
        this.nome = outro.getNome();
    }
    
    public void copy(Funcionario outro){
        this.cpf = outro.getCpf();
        this.nome = outro.getNome();
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Cpf: ");
        this.setCpf(ler.next());
        System.out.println("Nome: ");
        this.setNome(ler.next());
    }

    @Override
    public String toString() {
        return "Funcionario{"  + "cpf" + cpf + "nome=" + nome + '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
