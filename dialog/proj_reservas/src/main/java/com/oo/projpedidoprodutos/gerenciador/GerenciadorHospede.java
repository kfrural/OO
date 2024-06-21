package com.oo.projpedidoprodutos.gerenciador;


import com.oo.projpedidoprodutos.classes.Hospede;
import com.oo.projpedidoprodutos.file.FilePersistence;
import com.oo.projpedidoprodutos.file.SerializadorCSVHospede;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kfrural
 */
public class GerenciadorHospede {

    private List<Hospede> pessoas;

    public GerenciadorHospede() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarHospede(Hospede pessoa) {
        pessoas.add(pessoa);
        System.out.println("Hospede adicionada com sucesso!");
    }

    public boolean removerHospede(String cpf) {
        for (Hospede pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Hospede removida com sucesso!");
                return true;
            }
        }
        System.out.println("Hospede não encontrada!");
        return false;
    }

    public Hospede buscarHospede(String cpf) {
        for (Hospede pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarHospede(String cpf, Hospede pessoaNova) {
        Hospede pessoaExistente = buscarHospede(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Hospede atualizada com sucesso.");
        } else {
            System.out.println("Hospede com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Hospede pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVHospede serializador = new SerializadorCSVHospede();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVHospede serializador = new SerializadorCSVHospede();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }
}

