package com.mycompany.mavenproject3.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private String curso;
    private Telefone[] telefones = new Telefone[2];
    
    public Aluno(){
        this.nome = "";
        this.matricula = "";
        this.email = "";
        this.curso = "";
        for(int i =0; i < 2; i++){
            this.telefones[i] = new Telefone();
        }
    }
    
    public void copy(Aluno outra){
        this.nome = outra.getNome();
        this.matricula = outra.getMatricula();
        this.email = outra.getEmail();
        this.curso = outra.getCurso();
        for(int i = 0; i < 2; i++){
            Telefone t1 = outra.getTelefones()[i];
            this.telefones[i].copy(t1);
        }
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t Preencha os trem ai\n\n");
        System.out.println("Nome: ");
        this.setNome(leitor.next());
        System.out.println("Matricula: ");
        this.setMatricula(leitor.next());
        System.out.println("Email: ");
        this.setEmail(leitor.next());
        System.out.println("Curso: ");
        this.setCurso(leitor.next());
        for(int i = 0; i < 2; i++){
            this.getTelefones()[i].fill();
        }
    }
    
    public void imprimir(){
        System.out.println("\tOs trem ai\n\n");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Curso: " + this.getCurso());
        
        for(Telefone ti: this.getTelefones()){
            ti.imprimir();
        }
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public String getCurso() {
        return curso;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
    
    
}
