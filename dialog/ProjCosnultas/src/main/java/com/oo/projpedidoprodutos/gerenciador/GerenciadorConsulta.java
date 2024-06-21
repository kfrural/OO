package com.oo.projpedidoprodutos.gerenciador;


import com.oo.projpedidoprodutos.classes.Consulta;
import com.oo.projpedidoprodutos.file.FilePersistence;
import com.oo.projpedidoprodutos.file.SerializadorCSVConsulta;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kfrural
 */
public class GerenciadorConsulta {

    private List<Consulta> pessoas;

    public GerenciadorConsulta() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta pessoa) {
        pessoas.add(pessoa);
        System.out.println("Consulta adicionada com sucesso!");
    }

    public boolean removerConsulta(String cpf) {
        for (Consulta pessoa : pessoas) {
            if (pessoa.getCod().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Consulta removida com sucesso!");
                return true;
            }
        }
        System.out.println("Consulta não encontrada!");
        return false;
    }

    public Consulta buscarConsulta(String cpf) {
        for (Consulta pessoa : pessoas) {
            if (pessoa.getCod().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarConsulta(String cpf, Consulta pessoaNova) {
        Consulta pessoaExistente = buscarConsulta(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Consulta atualizada com sucesso.");
        } else {
            System.out.println("Consulta com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Consulta pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVConsulta serializador = new SerializadorCSVConsulta();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVConsulta serializador = new SerializadorCSVConsulta();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }
}

