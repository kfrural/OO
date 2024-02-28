package com.mycompany.mavenproject2;

/**
 *
 * @author kfrural
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Mavenproject2 {
    private static Scanner leitor = new Scanner(System.in);

    public static int imprimeMenu() {
        System.out.println("------------------------------");
        System.out.println("1 - Inserir livro");
        System.out.println("2 - Remover livro");
        System.out.println("3 - Pesquisar livro (titulo)");
        System.out.println("4 - Pesquisar livro (autor)");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        List<Musica> listaMusicas = new ArrayList<>();
        int opcao = 0;
        do {
            opcao = imprimeMenu();
            switch (opcao) {
                case 1: // inserção
                    Musica l1 = new Musica();
                    l1.preencher();
                    listaMusicas.add(l1);
                    break;
                case 2: // remoção
                    System.out.println("Informe o titulo:");
                    String title = leitor.nextLine();
                    Iterator<Musica> iterator = listaMusicas.iterator();
                    while (iterator.hasNext()) {
                        Musica li = iterator.next();
                        if (title.equals(li.getTitulo())) {
                            System.out.println("Musica encontrado");
                            iterator.remove();
                        }
                    }
                    break;
                case 3: // pesquisa por título
                    System.out.println("Informe o titulo:");
                    title = leitor.nextLine();
                    for (Musica li : listaMusicas) {
                        if (title.equals(li.getTitulo())) {
                            System.out.println("Musica encontrado");
                            li.imprimir();
                        }
                    }
                    break;
                case 4: // pesquisa por autor
                    System.out.println("Informe o autor:");
                    String autor = leitor.nextLine();
                    for (Musica li : listaMusicas) {
                        if (autor.equals(li.getArtista())) {
                            System.out.println("Autor encontrado");
                            li.imprimir();
                        }
                    }
                    break;
                case 0: // sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
