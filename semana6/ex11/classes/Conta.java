package com.mycompany.mavenproject3.classes;

import java.util.Objects;


/**
 *
 * @author kfrural
 */
public class Conta {
    private String numConta;
    private String titular;
    private double saldo;

    public Conta(String numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta() {
        this.numConta = "";
        this.titular = "";
        this.saldo = 0.0;
    }
    
    public Conta(Conta outra){
        this.numConta = outra.getNumConta();
        this.titular = outra.getTitular();
        this.saldo = outra.getSaldo();
    }
    
    public void copy(Conta outra){
        this.numConta = outra.getNumConta();
        this.titular = outra.getTitular();
        this.saldo = outra.getSaldo();
    }
    
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }
    
    public void sacar(double valorSaque){
//        if(valorSaque < this.getSaldo()){
           this.saldo -= valorSaque;
//        }else{
//            System.out.println("Cê n tem grana suficiente\n");
//        }
    }
    public boolean isDevedor() {
        return getSaldo() < 0;
    }

    public boolean isCredor() {
        return getSaldo() > 0;
    }

    @Override
    public String toString() {
        return "Conta{" + "numConta=" + numConta + ", titular=" + titular + ", saldo=" + saldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.numConta);
        hash = 97 * hash + Objects.hashCode(this.titular);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
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
        final Conta other = (Conta) obj;
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.numConta, other.numConta)) {
            return false;
        }
        return Objects.equals(this.titular, other.titular);
    }
    

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
