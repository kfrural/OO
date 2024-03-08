/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author kfrural
 */
import com.mycompany.mavenproject1.classe.GerenciamentoMusicas;
import com.mycompany.mavenproject1.classe.Musica;
import java.util.Scanner;

public class Mavenproject1 {

    private static Scanner leitor = new Scanner(System.in);

    public static int imprimeMenu() {
        System.out.println("------------------------------");
        System.out.println("1 - Fazer musica");
        System.out.println("2 - Cancelar musica");
        System.out.println("3 - Listar Reservas");
        System.out.println("4 - Buscar Reservas");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        GerenciamentoMusicas gerenciamento = new GerenciamentoMusicas();
        int opcao = 0;
        do {
            opcao = imprimeMenu();
            switch (opcao) {
                case 1:
                    Musica musica = new Musica();
                    musica.fill();
                    gerenciamento.adicionarMusica(musica);
                    break;
                case 2:
                    System.out.println("bota o nome pra cancelar\n");
                    String nome = leitor.next();
                    gerenciamento.cancelarMusica(nome);
                    break;
                case 3:
                    System.out.println("Lista das musica\n");
                    gerenciamento.listarMusica();
                    break;
                case 4:
                    System.out.println("bota o nome pra buscar\n");
                    nome = leitor.next();
                    Musica musicaEncontrada = gerenciamento.buscarMusica(nome);
                    if(musicaEncontrada != null){
                        System.out.println("Encontrada " + musicaEncontrada);
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
