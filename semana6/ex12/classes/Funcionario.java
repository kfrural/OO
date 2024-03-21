package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author kfrural
 */
public class Funcionario {
    private String nome;
    private String id;
    private List<Projeto> projeto = new ArrayList<>();

    public Funcionario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public Funcionario() {
        this.nome = "";
        this.id = "";
        this.projeto = new ArrayList<>();
    }
    
    public void adicionar(Projeto projeto){
        this.projeto.add(projeto);
    }
    
    public void remover(Projeto projeto){
        this.projeto.remove(projeto);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", id=" + id + ", projeto=" + projeto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.projeto);
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
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.projeto, other.projeto);
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

    public List<Projeto> getProjeto() {
        return projeto;
    }

    public void setProjeto(List<Projeto> projeto) {
        this.projeto = projeto;
    }
    
    
}
