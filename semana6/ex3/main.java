package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Aluno;
import com.mycompany.mavenproject3.classes.Telefone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kfrural
 */
public class Mavenproject3 {
    
    public static void verifica(List<Aluno> alunos){
        Map<String, List<Aluno>> alunoDDD = new HashMap<>();
        Map<String, List<Aluno>> alunoOperadora = new HashMap<>();
        
        for(Aluno aluno: alunos){
            for(Telefone telefone: aluno.getTelefones()){
                String ddd = telefone.getDdd();
                String operadora = telefone.getOperadora();
                
                alunoDDD.computeIfAbsent(ddd, k -> new ArrayList<>()).add(aluno);
                alunoOperadora.computeIfAbsent(ddd,k -> new ArrayList<>()).add(aluno);
            }
        }
        System.out.println("OS IGUAL AI:\n\n");
        for(Map.Entry<String, List<Aluno>> entry : alunoDDD.entrySet()){
            System.out.println("DDD: " + entry.getKey());
            for(Aluno aluno: entry.getValue()){
                System.out.println("Aluno: " + aluno.getNome());
            }
        }
        
        System.out.println("OS IGUAL AI:\n\n");
        for(Map.Entry<String, List<Aluno>> entry: alunoOperadora.entrySet()){
            System.out.println("Operadora: " + entry.getKey());
            for(Aluno aluno : entry.getValue()){
                System.out.println("Aluno: " + aluno.getNome());
            }
        }
        
    }

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        
        a1.fill();
        a2.copy(a1);
        a3.fill();
        a4.fill();
        a5.copy(a1);
        
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);
        
        a1.imprimir();
        a2.imprimir();
        a3.imprimir();
        a4.imprimir();
        a5.imprimir();
        
        verifica(alunos);
      
    }
}
