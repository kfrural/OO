package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Aluno;
import com.mycompany.mavenproject3.classes.Curso;
import com.mycompany.mavenproject3.classes.Aula;
import com.mycompany.mavenproject3.classes.PlataformaDeCurso;

/**
 *
 * @author kfrural
 */
public class Mavenproject3 {

    public static void main(String[] args) {
    PlataformaDeCurso plataforma = new PlataformaDeCurso();
    Aluno aluno = new Aluno("Lucas");

    // Criando e adicionando cursos e aulas à plataforma
    Curso cursoJava = new Curso("Java para Iniciantes", "Domine Java e comece sua jornada no desenvolvimento de software!");
    cursoJava.adicionarAula(new Aula("Introdução ao Java", "Comece sua jornada aprendendo os conceitos básicos de Java", "Conteúdo da Aula 1"));
    cursoJava.adicionarAula(new Aula("Estruturas de Dados em Java", "Entenda como trabalhar com arrays e listas", "Conteúdo da Aula 2"));
    plataforma.adicionarCurso(cursoJava);

    // Aluno se inscreve no curso
    aluno.inscreverCurso(cursoJava);

    // Aluno conclui a primeira aula e avalia
    aluno.concluirAula(cursoJava, "Introdução ao Java");
    aluno.avaliar(cursoJava, "Introdução ao Java", 5.0);

    // Verificar progresso do aluno no curso
    aluno.progresso(cursoJava);
}

}
