package com.mycompany.mavenproject2.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private String sexo;
    public static int contador = 0;

    public Pessoa(String nome, int idade, double altura, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
        contador++;
    }

   public Pessoa(){
        this.nome = "";
        this.idade = 0;
        this.altura = 0.0;
        this.sexo = "";
        contador ++;
   }
    
    public Pessoa(Pessoa outra) {
        this.nome = outra.getNome();
        this.idade = outra.getIdade();
        this.altura = outra.getAltura();
        this.sexo = outra.getSexo();
        contador++;
    }

    public void copy(Pessoa outra) {
       this.nome = outra.getNome();
        this.idade = outra.getIdade();
        this.altura = outra.getAltura();
        this.sexo = outra.getSexo();
        contador++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }
    
    public String getSexo(){
        return this.sexo;
    }

    public void fill() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("Idade: ");
        this.idade = leitor.nextInt();
        System.out.println("Altura: ");
        this.altura = leitor.nextDouble();
        System.out.println("Sexo: ");
        this.sexo = leitor.next();
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", sexo=" + sexo + '}';
    }

    

}
