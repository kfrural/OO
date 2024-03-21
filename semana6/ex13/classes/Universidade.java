package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class Universidade {

    private String nome;
    private List<Curso> curso = new ArrayList<>();
    private List<Estudante> estudante = new ArrayList<>();
    public static int contador = 0;

    public Universidade(String nome) {
        this.nome = nome;
    }

    public void adicionarCurso(Curso curso) {
        this.curso.add(curso);
    }

    public void removerCurso(Curso curso) {
        this.curso.remove(curso);
    }

    public void adicionarEstudante(Estudante estudante, Curso curso) {
        this.estudante.add(estudante);
        curso.adicionarEstudante(estudante);
         contador++;
    }

    public void removerEstudante(Estudante estudante, Curso curso) {
        this.estudante.remove(estudante);
         contador--;
    }
    
    public void listarCurso(){
        for(Curso c : this.curso)
            System.out.println(c);
    }
    
    public void listarEstudante(){
        for(Estudante e : this.estudante)
            System.out.println(e);
    }
    
   public Curso cursoComMaisAlunos() {
        Curso cursoComMais = null;
        int cont = 0;

        for (Curso curso : curso) {
            int alunos = curso.getContador();
            if (alunos > cont) {
                cont = alunos;
                cursoComMais = curso;
            }
        }

        return cursoComMais;
    }
   public List<Curso> top5CursosComMaisAlunos() {
        List<Curso> cursos = new ArrayList<>(curso);
        cursos.sort((c1, c2) -> c2.getContador() - c1.getContador());
        return cursos.subList(0, Math.min(5, cursos.size()));
    }

    @Override
    public String toString() {
        return "Universidade{" + "nome=" + nome + ", curso=" + curso + ", estudante=" + estudante + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.curso);
        hash = 71 * hash + Objects.hashCode(this.estudante);
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
        final Universidade other = (Universidade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
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

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
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
        Universidade.contador = contador;
    }

}
