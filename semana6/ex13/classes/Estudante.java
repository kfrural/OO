package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author kfrural
 */
public class Estudante {
    private String nome;
    private String matricula;
    private List<Curso> curso = new ArrayList<>();
    public static int contador = 0;

    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        contador++;
    }
    
    public void matricula(Curso curso){
        this.curso.add(curso);
    }
    
    public void desmatricula(Curso curso){
        this.curso.remove(curso);
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.matricula);
        hash = 97 * hash + Objects.hashCode(this.curso);
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
        final Estudante other = (Estudante) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.curso, other.curso);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Estudante.contador = contador;
    }
    
}
