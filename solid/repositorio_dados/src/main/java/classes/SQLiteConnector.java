package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author kfrural
 */
public class SQLiteConnector {
    private Connection connection;

    public SQLiteConnector(String dbName) throws SQLException {
        String url = "jdbc:sqlite:" + dbName;
        this.connection = DriverManager.getConnection(url);
        
        //ja vamos criar nossa tabela para testar
        criarTabelaPessoa();
    }

    public Connection getConnection() {
        return connection;
    }
    
    private void criarTabelaPessoa() {
        String sql = "CREATE TABLE IF NOT EXISTS pessoa (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nome TEXT NOT NULL," +
                     "cpf TEXT NOT NULL," +
                     "idade INTEGER NOT NULL" +
                     ");";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela: " + e.getMessage());
        }
    }
}
