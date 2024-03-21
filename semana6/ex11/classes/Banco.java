package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author kfrural
 */
public class Banco {
    private String nome;
    private List<Conta> conta = new ArrayList<>();
    private List<Transacao> transacao = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public Banco() {
        this.nome = "";
        this.conta = new ArrayList<>();
        this.transacao = new ArrayList<>();
    }
    
    public void adicionarConta(Conta conta){
        this.conta.add(conta);
    }
    
    public void removerConta(Conta conta){
        this.conta.remove(conta);
    }
    
    public void adicionarTransacao(Transacao transacao){
        this.transacao.add(transacao);
    }
    
    public void removerTransacao(Transacao transacao){
        this.transacao.remove(transacao);
    }
    
    public void listarConta(){
        for(Conta c : this.conta)
            System.out.println(c);
    }
    
    public void listarTransacao(){
        for(Transacao t : this.transacao)
            System.out.println(t);
    }
    
    public Conta maiorSaldo(){
        Conta maiorSaldo = null;
        double valorSaldo = 0.0;
        for(Conta c : conta){
            double numSaldo = c.getSaldo();
            if(numSaldo > valorSaldo){
                valorSaldo = numSaldo;
                maiorSaldo = c;
            }
        }
        return maiorSaldo;
    }
    
     public Conta menorSaldo(){
        Conta menorSaldo = null;
        double valorSaldo = 0.0;
        for(Conta c : conta){
            double numSaldo = c.getSaldo();
            if(numSaldo < valorSaldo){
                valorSaldo = numSaldo;
                menorSaldo = c;
            }
        }
        return menorSaldo;
    }
     
     public int credor(){
         int contCredor = 0;
         
         for(Conta c : conta){
             if(c.isCredor())
                 contCredor++;
         }
         return contCredor;
     }
       public int devedor(){
         int contDevedor = 0;
         
         for(Conta c : conta){
             if(c.isDevedor())
                 contDevedor++;
         }
         return contDevedor;
     }

    @Override
    public String toString() {
        return "Banco{" + "nome=" + nome + ", conta=" + conta + ", transacao=" + transacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.conta);
        hash = 23 * hash + Objects.hashCode(this.transacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banco other = (Banco) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conta, other.conta)) {
            return false;
        }
        return Objects.equals(this.transacao, other.transacao);
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getConta() {
        return conta;
    }

    public void setConta(List<Conta> conta) {
        this.conta = conta;
    }

    public List<Transacao> getTransacao() {
        return transacao;
    }

    public void setTransacao(List<Transacao> transacao) {
        this.transacao = transacao;
    }
    
}
