package com.mycompany.mavenproject1.classe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciamentoMusicas {
    private List<Musica> musica;

    public GerenciamentoMusicas() {
        this.musica = new ArrayList<>();
    }

    public void adicionarMusica(Musica reserva) {
        musica.add(reserva);
        System.out.println("Musica adicionada com sucesso!");
    }

    public void cancelarMusica(String nomeMusica) {
        musica.removeIf(reserva -> reserva.getTitulo().equalsIgnoreCase(nomeMusica));
        System.out.println("Musica cancelada com sucesso!");
    }

    public void listarMusica() {
        for (Musica reserva : musica) {
            System.out.println(reserva);
        }
    }

    public Musica buscarMusica(String nomeMusica) {
        for (Musica reserva : musica) {
            if (reserva.getTitulo().equalsIgnoreCase(nomeMusica)) {
                return reserva;
            }
        }
        return null;
    }
}
