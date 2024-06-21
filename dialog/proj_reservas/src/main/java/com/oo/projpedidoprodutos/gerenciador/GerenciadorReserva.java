package com.oo.projpedidoprodutos.gerenciador;


import com.oo.projpedidoprodutos.classes.Reserva;
import com.oo.projpedidoprodutos.file.FilePersistence;
import com.oo.projpedidoprodutos.file.SerializadorCSVReserva;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kfrural
 */
public class GerenciadorReserva {

    private List<Reserva> pessoas;

    public GerenciadorReserva() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva pessoa) {
        pessoas.add(pessoa);
        System.out.println("Reserva adicionada com sucesso!");
    }

    public boolean removerReserva(String cpf) {
        for (Reserva pessoa : pessoas) {
            if (pessoa.getCod().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Reserva removida com sucesso!");
                return true;
            }
        }
        System.out.println("Reserva não encontrada!");
        return false;
    }

    public Reserva buscarReserva(String cpf) {
        for (Reserva pessoa : pessoas) {
            if (pessoa.getCod().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarReserva(String cpf, Reserva pessoaNova) {
        Reserva pessoaExistente = buscarReserva(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Reserva atualizada com sucesso.");
        } else {
            System.out.println("Reserva com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Reserva pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVReserva serializador = new SerializadorCSVReserva();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVReserva serializador = new SerializadorCSVReserva();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }
}

