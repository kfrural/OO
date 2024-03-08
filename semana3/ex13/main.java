/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author kfrural
 */
import com.mycompany.mavenproject1.classe.GerenciamentoFilme;
import com.mycompany.mavenproject1.classe.Filme;
import java.util.Scanner;

public class Mavenproject1 {

    private static Scanner leitor = new Scanner(System.in);

    public static int imprimeMenu() {
        System.out.println("------------------------------");
        System.out.println("1 - Fazer filme");
        System.out.println("2 - Cancelar filme");
        System.out.println("3 - Listar Reservas");
        System.out.println("4 - Buscar Reservas");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        GerenciamentoFilme gerenciamento = new GerenciamentoFilme();
        int opcao = 0;
        do {
            opcao = imprimeMenu();
            switch (opcao) {
                case 1:
                    Filme filme = new Filme();
                    filme.fill();
                    gerenciamento.adicionarFilme(filme);
                    break;
                case 2:
                    System.out.println("bota o nome pra cancelar\n");
                    String nome = leitor.next();
                    gerenciamento.cancelarFilme(nome);
                    break;
                case 3:
                    System.out.println("Lista das filme\n");
                    gerenciamento.listarFilme();
                    break;
                case 4:
                    System.out.println("bota o nome pra buscar\n");
                    nome = leitor.next();
                    Filme filmeEncontrada = gerenciamento.buscarFilme(nome);
                    if(filmeEncontrada != null){
                        System.out.println("Encontrada " + filmeEncontrada);
                    } else{
                        System.out.println("Nao foi encontrada\n");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while(opcao != 0);
    }
}
