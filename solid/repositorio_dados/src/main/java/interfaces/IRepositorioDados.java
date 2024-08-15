package interfaces;

import classes.Pessoa;
import java.util.List;

/**
 *
 * @author kfrural
 */
public interface IRepositorioDados {
    void salvar(Pessoa pessoa);
    void excluir(int idPessoa);
    List<Pessoa> listar();
}