package com.oo.projpedidoprodutos.gerenciador;


import com.oo.projpedidoprodutos.classes.Quarto;
import com.oo.projpedidoprodutos.file.FilePersistence;
import com.oo.projpedidoprodutos.file.SerializadorCSVQuarto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kfrural
 */
public class GerenciadorQuarto {

    private List<Quarto> pessoas;

    public GerenciadorQuarto() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto pessoa) {
        pessoas.add(pessoa);
        System.out.println("Quarto adicionada com sucesso!");
    }

    public boolean removerQuarto(String cpf) {
        for (Quarto pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Quarto removida com sucesso!");
                return true;
            }
        }
        System.out.println("Quarto não encontrada!");
        return false;
    }

    public Quarto buscarQuarto(String cpf) {
        for (Quarto pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarQuarto(String cpf, Quarto pessoaNova) {
        Quarto pessoaExistente = buscarQuarto(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Quarto atualizada com sucesso.");
        } else {
            System.out.println("Quarto com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Quarto pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVQuarto serializador = new SerializadorCSVQuarto();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVQuarto serializador = new SerializadorCSVQuarto();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }
}

