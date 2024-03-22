package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class Aluno {
    private String nome;
    private List<Curso> curso = new ArrayList<>();
    private List<Aula> aula = new ArrayList<>();
    private Map<Curso, List<Aula>> aulaAMenos = new HashMap<>();
    private Map<Aula, Double> aulaAvaliada = new HashMap<>();

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public void inscreverCurso(Curso curso){
        this.curso.add(curso);
        aulaAMenos.put(curso, new ArrayList<>());
    }
    
    public void concluirAula(Curso curso, String titulo){
        for(Aula a : this.aula){
            if(a.getTitulo().equalsIgnoreCase(titulo)){
                if(aulaAMenos.containsKey(curso))
                aulaAMenos.get(curso).add((Aula) aula);
            }
        }
    }
    
    public void avaliar(Curso curso,String nome, double nota){
        for(Aula a : this.aula){
            if(a.getTitulo().equalsIgnoreCase(nome)){
                if(aulaAMenos.containsKey(curso))
                aulaAvaliada.put((Aula) aula, nota);
            }
        }
        //aulaAvaliada.put(aula, nota);
    }

    public double progresso(Curso curso){
        if(aulaAMenos.containsKey(curso)){
            List<Aula> feitas = aulaAMenos.get(curso);
            return (double) feitas.size() / curso.getAula().size();
        }
        return -1;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", curso=" + curso + ", aulaAMenos=" + aulaAMenos + ", aulaAvaliada=" + aulaAvaliada + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.curso);
        hash = 47 * hash + Objects.hashCode(this.aulaAMenos);
        hash = 47 * hash + Objects.hashCode(this.aulaAvaliada);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.aulaAMenos, other.aulaAMenos)) {
            return false;
        }
        return Objects.equals(this.aulaAvaliada, other.aulaAvaliada);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

    public Map<Curso, List<Aula>> getAulaAMenos() {
        return aulaAMenos;
    }

    public void setAulaAMenos(Map<Curso, List<Aula>> aulaAMenos) {
        this.aulaAMenos = aulaAMenos;
    }

    public Map<Aula, Double> getAulaAvaliada() {
        return aulaAvaliada;
    }

    public void setAulaAvaliada(Map<Aula, Double> aulaAvaliada) {
        this.aulaAvaliada = aulaAvaliada;
    }
    
    
}
