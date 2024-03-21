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
    private String id;
    private List<Estudante> estudante = new ArrayList<>();
    public static int contador = 0;

    public Curso(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }
    
    public void adicionarEstudante(Estudante estudante){
        this.estudante.add(estudante);
        contador++;
    }
    
    public void removerEstudante(Estudante estudante){
        this.estudante.remove(estudante);
        contador--;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", id=" + id + ", estudante=" + estudante + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.estudante);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.estudante, other.estudante);
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

    public List<Estudante> getEstudante() {
        return estudante;
    }

    public void setEstudante(List<Estudante> estudante) {
        this.estudante = estudante;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Curso.contador = contador;
    }
    
}
