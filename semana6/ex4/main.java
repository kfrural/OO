package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Contas;
import com.mycompany.mavenproject3.classes.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Mavenproject3 {

    public static int imprimeMenu() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n\t------- Sistema comercial IFET -------");
        System.out.println("\t1 - Inserir Pessoa");
        System.out.println("\t2 - Remover Pessoa");
        System.out.println("\t3 - Inserir conta a uma pessoa");
        System.out.println("\t4 - Pesquisar Pessoa (cpf)");
        System.out.println("\t5 - Pesquisar Pessoa (nome)");
        System.out.println("\t6 - Pessoa com maior devedor ");
        System.out.println("\t7 - Total devido por todas pessoas ");
        System.out.println("\t0 - Sair");
        System.out.println("\t-----------------------------------------");
        System.out.print("\tEscolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        int opcao = 0;
        do {
            opcao = imprimeMenu();

            switch (opcao) {
                case 1: 
                    Pessoa pf = new Pessoa();
                    pf.fill();
                    listaPessoas.add(pf);
                    break;

                case 2:               
                    System.out.print("Informe o nome da pessoa:");
                    String nomeProcurado = reader.nextLine();

                    for (int i = 0; i <= listaPessoas.size() - 1; i++) {
                        Pessoa pf_i = listaPessoas.get(i);

                        if (nomeProcurado.equals(pf_i.getNome())) {
                            listaPessoas.remove(i);
                        }
                    }
                    break;

                case 3:  
                    System.out.print("Informe o nome da pessoa:");
                    nomeProcurado = reader.nextLine();

                    boolean flagEncontrou = false;
                    for (int i = 0; i <= listaPessoas.size() - 1; i++) {
                        Pessoa pf_i = listaPessoas.get(i);

                        if (nomeProcurado.equals(pf_i.getNome())) {
                            flagEncontrou = true;
                            Contas contaNova = new Contas();
                            contaNova.preencher();

                            pf_i.getListaContas().add(contaNova);
                        }
                    }
                    if (flagEncontrou == false) {
                        System.out.println("Não existe ninguem com este nome.");
                    }
                    break;

                case 4:
                    System.out.print("Informe o CPF da pessoa:");
                    nomeProcurado = reader.nextLine();

                    flagEncontrou = false;
                    for (int i = 0; i <= listaPessoas.size() - 1; i++) {
                        Pessoa pf_i = listaPessoas.get(i);

                        if (nomeProcurado.equals(pf_i.getCpf())) {
                            flagEncontrou = true;
                            System.out.println("Pessoa encontrada.");
                            pf_i.imprimir();

                        }
                    }
                    if (flagEncontrou == false) {
                        System.out.println("Não existe ninguem com este CPF.");
                    }

                    break;

                case 5: 
                    System.out.print("Informe o nome da pessoa:");
                    nomeProcurado = reader.nextLine();

                    flagEncontrou = false;
                    for (int i = 0; i <= listaPessoas.size() - 1; i++) {
                        Pessoa pf_i = listaPessoas.get(i);

                        if (nomeProcurado.equals(pf_i.getNome())) {
                            flagEncontrou = true;
                            System.out.println("Pessoa encontrada.");
                            pf_i.imprimir();

                        }
                    }
                    if (flagEncontrou == false) {
                        System.out.println("Não existe ninguem com este Nome.");
                    }

                    break;

                case 6:

                    double maiorDivida = 0;
                    Pessoa pessoaMaiorDivida = new Pessoa();

                    for (int i = 0; i <= listaPessoas.size() - 1; i++) {
                        Pessoa pf_i = listaPessoas.get(i);

                        for (int j = 0; j <= pf_i.getListaContas().size() - 1; j++) {
                            Contas conta_j = pf_i.getListaContas().get(j);

                            if (conta_j.getValor() > maiorDivida) {
                                maiorDivida = conta_j.getValor();
                                pessoaMaiorDivida.copiar(pf_i);
                            }
                        }
                    }

                    System.out.println("A maior divída é:" + maiorDivida);
                    System.out.println("Ela é referente a Pessoa Física:");
                    pessoaMaiorDivida.imprimir();

                    break;

                case 7:

                    double totalDividas = 0;

                    for (int i = 0; i <= listaPessoas.size() - 1; i++) {
                        Pessoa pf_i = listaPessoas.get(i);

                        for (int j = 0; j <= pf_i.getListaContas().size() - 1; j++) {
                            Contas conta_j = pf_i.getListaContas().get(j);

                            totalDividas = totalDividas + conta_j.getValor();
                        }
                    }

                    System.out.println("O total devido é:" + totalDividas);
                    break;

                default:
                    break;
            }
        } while (opcao != 0);
    }
}
