package com.mycompany.mavenproject3.classes;

import java.util.Objects;


/**
 *
 * @author kfrural
 */
public class Transacao {
    private String id;
    private String tipoTransacao;
    private double valor;
    private String data;
    private Conta conta = new Conta();

    public Transacao(String id, String tipoTransacao, double valor, String data, Conta conta) {
        this.id = id;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.data = data;
        this.conta = new Conta();
    }

    public Transacao() {
        this.id = "";
        this.tipoTransacao = "";
        this.valor = 0.0;
        this.data = "";
        this.conta = new Conta();
    }

    @Override
    public String toString() {
        return "Transacao{" + "id=" + id + ", tipoTransacao=" + tipoTransacao + ", valor=" + valor + ", data=" + data + ", conta=" + conta + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.tipoTransacao);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.data);
        hash = 53 * hash + Objects.hashCode(this.conta);
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
        final Transacao other = (Transacao) obj;
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.tipoTransacao, other.tipoTransacao)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return Objects.equals(this.conta, other.conta);
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    
}
