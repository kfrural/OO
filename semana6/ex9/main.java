package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Departamento;
import com.mycompany.mavenproject3.classes.Funcionario;
import com.mycompany.mavenproject3.classes.Gerente;


public class Mavenproject3 {

   public static void main(String[] args) {
        Departamento ti = new Departamento("Tecnologia da Informação");

        Gerente gerenteTI = new Gerente("João", 001, 7000.0, "Tecnologia da Informação");
        ti.setGerente(gerenteTI);

        Funcionario funcionario1 = new Funcionario("Mariana", 002, 4500.0);
        Funcionario funcionario2 = new Funcionario("Lucas", 003, 4200.0);

        ti.adicionar(funcionario1);
        ti.adicionar(funcionario2);

        System.out.println("Gerente do Departamento de TI: " + ti.getGerente().getNome());
        System.out.println("Funcionários no Departamento de TI:");
        for (Funcionario funcionario : ti.getFuncionarios()) {
            System.out.println(funcionario.getNome() + " - ID: " + funcionario.getId());
        }

        ti.remover(funcionario1);
        System.out.println("Após a remoção, funcionários no Departamento de TI:");
        for (Funcionario funcionario : ti.getFuncionarios()) {
            System.out.println(funcionario.getNome() + " - ID: " + funcionario.getId());
        }
    }
}
