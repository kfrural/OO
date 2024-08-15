package classes;

import interfaces.IRepositorioDados;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */

public class RepositorioBancoDados implements IRepositorioDados {
    private SQLiteConnector connector;

    public RepositorioBancoDados(SQLiteConnector connector) {
        this.connector = connector;
    }

    @Override
    public void salvar(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (nome, cpf, idade) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCpf());
            stmt.setInt(3, pessoa.getIdade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(int idPessoa) {
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setInt(1, idPessoa);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pessoa> listar() {
        String sql = "SELECT * FROM pessoa";
        List<Pessoa> pessoas = new ArrayList<>();
        try (Statement stmt = connector.getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                pessoas.add(new Pessoa(
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getInt("idade")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoas;
    }
}