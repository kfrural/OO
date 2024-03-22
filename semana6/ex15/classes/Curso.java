package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class Curso {
    private String nome;
    private String descricao;
    private List<Aula> aula = new ArrayList<>();
    private List<Aluno> aluno = new ArrayList<>();

    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public void adicionarAula(Aula aula){
        this.aula.add(aula);
    }
    
    public void removerAula(Aula aula){
        this.aula.remove(aula);
    }
    
    public void adicionarAluno(Aluno aluno){
        this.aluno.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        this.aluno.remove(aluno);
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", aula=" + aula + ", alunos=" + aluno + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.descricao);
        hash = 67 * hash + Objects.hashCode(this.aula);
        hash = 67 * hash + Objects.hashCode(this.aluno);
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.aula, other.aula)) {
            return false;
        }
        return Objects.equals(this.aluno, other.aluno);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Aula> getAula() {
        return aula;
    }

    public void setAula(List<Aula> aula) {
        this.aula = aula;
    }

    public List<Aluno> getAlunos() {
        return aluno;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.aluno = alunos;
    }
    
}
