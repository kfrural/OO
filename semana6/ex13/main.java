package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Universidade;
import com.mycompany.mavenproject3.classes.Curso;
import com.mycompany.mavenproject3.classes.Estudante;

/**
 *
 * @author kfrural
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade Exemplo");

        Curso curso1 = new Curso("Engenharia de Software", "ES001");
        Curso curso2 = new Curso("Ciência da Computação", "CC001");
        Curso curso3 = new Curso("Matemática", "MT001");

        universidade.adicionarCurso(curso1);
        universidade.adicionarCurso(curso2);
        universidade.adicionarCurso(curso3);

        Estudante estudante1 = new Estudante("Ana Silva", "2018001");
        Estudante estudante2 = new Estudante("Bruno Martins", "2018002");
        Estudante estudante3 = new Estudante("Carla Dias", "2018003");

        universidade.adicionarEstudante(estudante1, curso1);
        universidade.adicionarEstudante(estudante2, curso2);
        universidade.adicionarEstudante(estudante3, curso1);
        universidade.adicionarEstudante(estudante3, curso2);

        System.out.println("Total de alunos na universidade: " + universidade.getContador());
        System.out.println("Curso com mais alunos: " + universidade.cursoComMaisAlunos().getNome());
        System.out.println("Top 5 cursos com mais alunos: ");
        universidade.top5CursosComMaisAlunos().forEach(curso -> System.out.println(curso.getNome()));
    }

}
