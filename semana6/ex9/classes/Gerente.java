package com.mycompany.mavenproject3.classes;

import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class Gerente {

    private String nome;
    private int id;
    private double salario;
    private String area;

    public Gerente() {
        this.nome = "";
        this.id = 0;
        this.salario = 0.0;
        this.area = "";
    }

    public Gerente(String nome, int id, double salario, String area) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.area = area;
    }

    public Gerente(Gerente outra) {
        this.nome = outra.getNome();
        this.id = outra.getId();
        this.salario = outra.getSalario();
        this.area = outra.getArea();
    }

    public void copy(Gerente outra) {
        this.nome = outra.getNome();
        this.id = outra.getId();
        this.salario = outra.getSalario();
        this.area = outra.getArea();
    }

    @Override
    public String toString() {
        return "Gerente{" + "nome=" + nome + ", id=" + id + ", salario=" + salario + ", area=" + area + '}';
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + this.id;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.area);
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
        final Gerente other = (Gerente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.area, other.area);
    }


}
