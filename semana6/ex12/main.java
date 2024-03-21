package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Empresa;
import com.mycompany.mavenproject3.classes.Funcionario;
import com.mycompany.mavenproject3.classes.Projeto;


/**
 *
 * @author kfrural
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions");

        Funcionario funcionario1 = new Funcionario("Ana", "F001");
        Funcionario funcionario2 = new Funcionario("Carlos", "F002");
        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);

        Projeto projeto1 = new Projeto("Desenvolvimento de Software", "P001", "Projeto para desenvolvimento de um aplicativo.");
        Projeto projeto2 = new Projeto("Pesquisa de Mercado", "P002", "Projeto para realizar uma pesquisa de mercado.");
        empresa.adicionarProjeto(projeto1);
        empresa.adicionarProjeto(projeto2);

        projeto1.adicionar(funcionario1);
        projeto2.adicionar(funcionario1); // Ana está em dois projetos
        projeto1.adicionar(funcionario2); // Carlos está em um projeto

        System.out.println("Funcionário mais produtivo: " + empresa.maisProdutivo().getNome());
        System.out.println("Funcionário menos produtivo: " + empresa.menosProdutivo().getNome());
    }

}
