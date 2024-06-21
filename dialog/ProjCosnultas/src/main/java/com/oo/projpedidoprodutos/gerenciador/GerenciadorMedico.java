package com.oo.projpedidoprodutos.gerenciador;


import com.oo.projpedidoprodutos.classes.Medico;
import com.oo.projpedidoprodutos.file.FilePersistence;
import com.oo.projpedidoprodutos.file.SerializadorCSVMedico;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kfrural
 */
public class GerenciadorMedico {

    private List<Medico> pessoas;

    public GerenciadorMedico() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarMedico(Medico pessoa) {
        pessoas.add(pessoa);
        System.out.println("Medico adicionada com sucesso!");
    }

    public boolean removerMedico(String cpf) {
        for (Medico pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Medico removida com sucesso!");
                return true;
            }
        }
        System.out.println("Medico não encontrada!");
        return false;
    }

    public Medico buscarMedico(String cpf) {
        for (Medico pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarMedico(String cpf, Medico pessoaNova) {
        Medico pessoaExistente = buscarMedico(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Medico atualizada com sucesso.");
        } else {
            System.out.println("Medico com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Medico pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVMedico serializador = new SerializadorCSVMedico();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVMedico serializador = new SerializadorCSVMedico();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }
}

