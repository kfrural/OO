package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.classe.ControleDeEstoque;
import com.mycompany.mavenproject1.classe.Produto;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */


public class Mavenproject1 {
    
    private static Scanner leitor = new Scanner(System.in);

    public static int imprimeMenu() {
        System.out.println("------------------------------");
        System.out.println("1 - Adicionar Produto");
        System.out.println("2 - Remover Produto");
        System.out.println("3 - Atualizar qtd");
        System.out.println("4- Listar produtos");
        System.out.println("5 - Buscar Produtos");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        ControleDeEstoque gerenciamento = new ControleDeEstoque();
        int opcao = 0;
        do {
            opcao = imprimeMenu();
            switch (opcao) {
                case 1:
                    Produto produto = new Produto();
                    produto.fill();
                    gerenciamento.adicionarProduto(produto);
                    break;
                case 2:
                    System.out.println("bota o cod pra cancelar\n");
                    String codigo = leitor.next();
                    gerenciamento.removerProduto(codigo);
                    break;
                case 3:
                    System.out.println("Bota  cod");
                    String cod = leitor.next();
                    System.out.println("Muda a qtd ai\n");
                    int qtdNova = leitor.nextInt();
                    gerenciamento.atualizarQuantidade(cod, qtdNova);
                    break;
                case 4:
                    System.out.println("Lista dos produto");
                    gerenciamento.listarProdutos();
                case 5:
                    System.out.println("bota o cod pra buscar\n");
                    String cdg = leitor.next();
                    Produto produtoEncontrado = gerenciamento.buscarProduto(cdg);
                    if(produtoEncontrado != null){
                        System.out.println("Encontrada " + produtoEncontrado);
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
