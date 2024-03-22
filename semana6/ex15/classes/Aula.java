package com.mycompany.mavenproject3.classes;

import java.util.Objects;


/**
 *
 * @author kfrural
 */
public class Aula {
    private String titulo;
    private String descricao;
    private String conteudo;
    private String avaliacao;
    private boolean concluida;

    public Aula(String titulo, String descricao, String conteudo ){
        this.titulo = titulo;
        this.descricao = descricao;
        this.conteudo = conteudo;
        //this.concluida = false;
    }

    @Override
    public String toString() {
        return "Aula{" + "titulo=" + titulo + ", descricao=" + descricao + ", conteudo=" + conteudo + ", avaliacao=" + avaliacao + ", concluida=" + concluida + '}';
    }
    
    public void avaliar(String titulo, String avaliacao){
        if(this.titulo.equals(titulo))
            this.avaliacao = avaliacao;
        else
            System.out.println("Nao tem");;
    }
    
    public void concluirAula(Curso curso, String titulo){
        if(this.titulo.equals(titulo))
            this.concluida = true;
        else
            System.out.println("Nao tem");;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.titulo);
        hash = 61 * hash + Objects.hashCode(this.descricao);
        hash = 61 * hash + Objects.hashCode(this.conteudo);
        hash = 61 * hash + Objects.hashCode(this.avaliacao);
        hash = 61 * hash + (this.concluida ? 1 : 0);
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
        final Aula other = (Aula) obj;
        if (this.concluida != other.concluida) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.conteudo, other.conteudo)) {
            return false;
        }
        return Objects.equals(this.avaliacao, other.avaliacao);
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    
    
}
