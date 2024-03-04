package com.mycompany.mavenproject2.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Reserva {

    private String nomeReserva;
    private int numPessoas;
    private String dataHora;

    public Reserva(String nomeReserva, int numPessoas, String dataHora) {
        this.nomeReserva = nomeReserva;
        this.numPessoas = numPessoas;
        this.dataHora = dataHora;
    }

    public Reserva() {
        this.nomeReserva = "";
        this.numPessoas = 0;
        this.dataHora = "";
    }

    public Reserva(Reserva outra) {
        this.nomeReserva = outra.getNomeReserva();
        this.numPessoas = outra.getNumPessoas();
        this.dataHora = outra.getDataHora();
    }

    public void copy(Reserva outra) {
        this.nomeReserva = outra.getNomeReserva();
        this.numPessoas = outra.getNumPessoas();
        this.dataHora = outra.getDataHora();
    }

    public void setNomeReserva(String nomeReserva) {
        this.nomeReserva = nomeReserva;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getNomeReserva() {
        return this.nomeReserva;
    }

    public int getNumPessoas() {
        return this.numPessoas;
    }

    public String getDataHora() {
        return this.dataHora;
    }

    public void fill() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome da reserva: ");
        this.nomeReserva = leitor.next();
        System.out.println("Numero de pessoas: ");
        this.numPessoas = leitor.nextInt();
        System.out.println("data e hora: ");
        this.dataHora = leitor.next();
    }

    @Override
    public String toString() {
        return "Reserva{" + "nomeReserva=" + nomeReserva + ", numPessoas=" + numPessoas + ", dataHora=" + dataHora + '}';
    }

}
