package com.mycompany.ex_voador;

import classes.Pessoa;
import classes.RepositorioBancoDados;
import classes.SQLiteConnector;
import classes.ServicoDados;
import interfaces.IRepositorioDados;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author kfrural
 */
public class Ex_voador {

    public static void main(String[] args) {
         try {
            SQLiteConnector connector = new SQLiteConnector("pessoas.db");

            IRepositorioDados repositorio = new RepositorioBancoDados(connector);

            ServicoDados service = new ServicoDados(repositorio);

            service.adicionarPessoa("João", "123.456.789-00", 25);
            service.adicionarPessoa("Maria", "987.654.321-00", 30);

            service.excluirPessoa(2);

            List<Pessoa> lst = (List<Pessoa>) service.obterPessoas();

            for (Pessoa p : lst) {
                System.out.println(p);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao inicializar o sistema: " + e.getMessage());
        }
    }
}
