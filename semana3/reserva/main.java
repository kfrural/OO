package com.mycompany.mavenproject2;

/**
 *
 * @author kfrural
 */
import com.mycompany.mavenproject2.classes.Reserva;
import com.mycompany.mavenproject2.classes.GerenciamentoReservas;
import java.util.Scanner;

public class Mavenproject2 {

    private static Scanner leitor = new Scanner(System.in);

    public static int imprimeMenu() {
        System.out.println("------------------------------");
        System.out.println("1 - Fazer reserva");
        System.out.println("2 - Cancelar reserva");
        System.out.println("3 - Listar Reservas");
        System.out.println("4 - Buscar Reservas");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        GerenciamentoReservas gerenciamento = new GerenciamentoReservas();
        int opcao = 0;
        do {
            opcao = imprimeMenu();
            switch (opcao) {
                case 1:
                    Reserva reserva = new Reserva();
                    reserva.fill();
                    gerenciamento.adicionarReserva(reserva);
                    break;
                case 2:
                    System.out.println("bota o nome pra cancelar\n");
                    String nome = leitor.next();
                    gerenciamento.cancelarReserva(nome);
                    break;
                case 3:
                    System.out.println("Lista das reserva\n");
                    gerenciamento.listarReserva();
                    break;
                case 4:
                    System.out.println("bota o nome pra buscar\n");
                    nome = leitor.next();
                    Reserva reservaEncontrada = gerenciamento.buscarReserva(nome);
                    if(reservaEncontrada != null){
                        System.out.println("Encontrada " + reservaEncontrada);
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
