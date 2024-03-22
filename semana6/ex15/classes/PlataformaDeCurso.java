package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class PlataformaDeCurso {
    private List<Curso> curso = new ArrayList<>();

    
    public void adicionarCurso(Curso curso){
        this.curso.add(curso);
    }
    
    public void removerCurso(Curso curso){
        this.curso.remove(curso);
    }
    
    public void listarCurso(){
        for(Curso c : this.curso)
            System.out.println(c);
    }
    
    public Curso buscar(String text){
        for(Curso c : this.curso){
            if(c.getNome().equalsIgnoreCase(text) || c.getDescricao().equalsIgnoreCase(text))
                return c;
        }
        return null;
    }

    @Override
    public String toString() {
        return "PlataformaDeCurso{" + "curso=" + curso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final PlataformaDeCurso other = (PlataformaDeCurso) obj;
        return Objects.equals(this.curso, other.curso);
    }
    

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }
    
}
