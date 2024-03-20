package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Departamento {
    private String nomeDpto;
    private Gerente gerente;
    private List <Funcionario> funcionarios = new ArrayList<>(); //esse trem tava dando erro pq

    public Departamento(String nomeDpto) {
        this.nomeDpto = nomeDpto;
    }
    
    public Departamento(){
        this.nomeDpto = "";
        this.gerente = new Gerente();
        this.funcionarios = new ArrayList<>();
    }
    
    public Departamento(Departamento outra){
        this.nomeDpto = outra.getNomeDpto();
        this.gerente = outra.getGerente();
        this.funcionarios = outra.getFuncionarios();
    }
    
    public void copy(Departamento outra){
        this.nomeDpto = outra.getNomeDpto();
        this.gerente = outra.getGerente();
        this.funcionarios = outra.getFuncionarios();
    }
    
    public void adicionar(Funcionario funcionarios){
            this.funcionarios.add(funcionarios);
    }
    
    public void remover(Funcionario funcionarios){
        this.funcionarios.remove(funcionarios);
    }

    public String getNomeDpto() {
        return nomeDpto;
    }

    public void setNomeDpto(String nomeDpto) {
        this.nomeDpto = nomeDpto;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
    
}
