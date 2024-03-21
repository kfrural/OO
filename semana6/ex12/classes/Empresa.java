package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author kfrural
 */
public class Empresa {
    private String nome;
    private List<Projeto> projeto = new ArrayList<>();
    private List<Funcionario> funcionario = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public Empresa() {
        this.nome = "";
        this.projeto = new ArrayList<>();
        this.funcionario = new ArrayList<>();
    }
    
    public void adicionarProjeto(Projeto projeto){
        this.projeto.add(projeto);
    }
    public void removerProjeto(Projeto projeto){
        this.projeto.remove(projeto);
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionario.add(funcionario);
    }
    
    public void removerFuncionario(Funcionario funcionario){
        this.funcionario.remove(funcionario);
    }

    public void listarProjeto(){
        for(Projeto p : this.projeto){
            System.out.println(p);
        }
    }
    
    public void listarFuncionario(){
        for(Funcionario f : this.funcionario){
            System.out.println(f);
        }
    }
    
    public Funcionario maisProdutivo(){
        Funcionario maisProd = funcionario.get(0);
        for(int i = 1; i < funcionario.size(); i++){
            Funcionario f = funcionario.get(i);
            if(f.getProjeto().size() > maisProd.getProjeto().size())
                maisProd = f;
        }
        return maisProd;
    }
    
    public Funcionario menosProdutivo(){
        Funcionario menosProd = funcionario.get(0);
        for(int i = 1; i < funcionario.size(); i++){
            Funcionario f = funcionario.get(i);
            if(f.getProjeto().size() < menosProd.getProjeto().size())
                menosProd = f;
        }
        return menosProd;
    }
    
    @Override
    public String toString() {
        return "Empresa{" + "nome=" + nome + ", projeto=" + projeto + ", funcionario=" + funcionario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.projeto);
        hash = 23 * hash + Objects.hashCode(this.funcionario);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.projeto, other.projeto)) {
            return false;
        }
        return Objects.equals(this.funcionario, other.funcionario);
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Projeto> getProjeto() {
        return projeto;
    }

    public void setProjeto(List<Projeto> projeto) {
        this.projeto = projeto;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
