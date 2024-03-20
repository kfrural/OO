package com.mycompany.mavenproject3.classes;

import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class Funcionario {

    private String nome;
    private int id;
    private double salario;

    public Funcionario() {
        this.nome = "";
        this.id = 0;
        this.salario = 0.0;
    }

    public Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public Funcionario(Funcionario outra) {
        this.nome = outra.getNome();
        this.id = outra.getId();
        this.salario = outra.getSalario();
    }

    public void copy(Funcionario outra) {
        this.nome = outra.getNome();
        this.id = outra.getId();
        this.salario = outra.getSalario();
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", id=" + id + ", salario=" + salario + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + this.id;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
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
        final Funcionario other = (Funcionario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
}
