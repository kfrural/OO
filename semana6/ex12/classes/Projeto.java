package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class Projeto {
    private String nome;
    private String id;
    private String descricao;
    private List<Funcionario> funcionario = new ArrayList<>();

    public Projeto(String nome, String id, String descricao) {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
        //this.funcionario = new ArrayList<>();
    }

    public Projeto() {
         this.nome = "";
        this.id = "";
        this.descricao = "";
        this.funcionario = new ArrayList<>();
    }
    
    public void adicionar(Funcionario funcionario){
        this.funcionario.add(funcionario);
    }
    
    public void remover(Funcionario funcionario){
        this.funcionario.remove(funcionario);
    }

    @Override
    public String toString() {
        return "Projeto{" + "nome=" + nome + ", id=" + id + ", descricao=" + descricao + ", funcionario=" + funcionario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.descricao);
        hash = 73 * hash + Objects.hashCode(this.funcionario);
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
        final Projeto other = (Projeto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.funcionario, other.funcionario);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    
}
