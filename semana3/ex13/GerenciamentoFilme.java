package com.mycompany.mavenproject1.classe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciamentoFilme {
    private List<Filme> filme;

    public GerenciamentoFilme() {
        this.filme = new ArrayList<>();
    }

    public void adicionarFilme(Filme reserva) {
        filme.add(reserva);
        System.out.println("Filme adicionada com sucesso!");
    }

    public void cancelarFilme(String nomeFilme) {
        filme.removeIf(reserva -> reserva.getTitulo().equalsIgnoreCase(nomeFilme));
        System.out.println("Filme cancelada com sucesso!");
    }

    public void listarFilme() {
        for (Filme reserva : filme) {
            System.out.println(reserva);
        }
    }

    public Filme buscarFilme(String nomeFilme) {
        for (Filme reserva : filme) {
            if (reserva.getTitulo().equalsIgnoreCase(nomeFilme)) {
                return reserva;
            }
        }
        return null;
    }
}
