package com.oo.projpedidoprodutos.gerenciador;


import com.oo.projpedidoprodutos.classes.Paciente;
import com.oo.projpedidoprodutos.file.FilePersistence;
import com.oo.projpedidoprodutos.file.SerializadorCSVPaciente;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kfrural
 */
public class GerenciadorPaciente {

    private List<Paciente> pessoas;

    public GerenciadorPaciente() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente pessoa) {
        pessoas.add(pessoa);
        System.out.println("Paciente adicionada com sucesso!");
    }

    public boolean removerPaciente(String cpf) {
        for (Paciente pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Paciente removida com sucesso!");
                return true;
            }
        }
        System.out.println("Paciente não encontrada!");
        return false;
    }

    public Paciente buscarPaciente(String cpf) {
        for (Paciente pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarPaciente(String cpf, Paciente pessoaNova) {
        Paciente pessoaExistente = buscarPaciente(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Paciente atualizada com sucesso.");
        } else {
            System.out.println("Paciente com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Paciente pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVPaciente serializador = new SerializadorCSVPaciente();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVPaciente serializador = new SerializadorCSVPaciente();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }
}

