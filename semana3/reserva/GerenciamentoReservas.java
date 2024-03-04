package com.mycompany.mavenproject2.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciamentoReservas {
    private List<Reserva> reservas;

    public GerenciamentoReservas() {
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva adicionada com sucesso!");
    }

    public void cancelarReserva(String nomeReserva) {
        reservas.removeIf(reserva -> reserva.getNomeReserva().equalsIgnoreCase(nomeReserva));
        System.out.println("Reserva cancelada com sucesso!");
    }

    public void listarReserva() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public Reserva buscarReserva(String nomeReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getNomeReserva().equalsIgnoreCase(nomeReserva)) {
                return reserva;
            }
        }
        return null;
    }
}
