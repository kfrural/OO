package classes;

import interfaces.IRepositorioDados;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class ServicoDados {
    private IRepositorioDados repositorio;

    public ServicoDados(IRepositorioDados repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionarPessoa(String nome, String cpf, int idade) {
        Pessoa pessoa = new Pessoa(nome, cpf, idade);
        repositorio.salvar(pessoa);
    }

    public void excluirPessoa(int idPessoa) {
        repositorio.excluir(idPessoa);
    }

    public List<Pessoa> obterPessoas() {
        return (List<Pessoa>) repositorio.listar();
    }
}