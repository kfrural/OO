/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oo.projpedidoprodutos.file;

import com.oo.projpedidoprodutos.classes.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVProfessor {

    // Serializa a lista de pessoas para uma String no formato CSV
    public String toCSV(List<Professor> pessoas) {
        String csv = "CPF;Nome;Sexo;Idade;\n"; // Cabeçalho
        for (Professor pessoa : pessoas) {
            csv += pessoa.getCpf() + ";"
                    + pessoa.getNome() + ";"
                    + pessoa.getSexo() + ";"
                    + pessoa.getIdade() + ";\n";
        }
        return csv;
    }

    // Deserializa uma String no formato CSV para uma lista de pessoas
    public List<Professor> fromCSV(String data) {
        List<Professor> pessoas = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                // Cria uma nova pessoa com os dados da linha
                Professor pessoa = new Professor(
                        partes[0], // CPF
                        partes[1], // Nome
                        partes[2].charAt(0), // Sexo
                        Integer.parseInt(partes[3]) // Idade
                );

                // Adiciona a pessoa à lista
                pessoas.add(pessoa);
            }
        }
        return pessoas;
    }
}
