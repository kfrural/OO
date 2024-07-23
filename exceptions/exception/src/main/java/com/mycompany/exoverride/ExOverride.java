package com.mycompany.exoverride;

import classes.Funcionario;
import classes.SalarioInvalidoException;


/**
 *
 * @author kfrural
 */
public class ExOverride {

    public static void main(String[] args) {
        try {
            Funcionario func1 = new Funcionario("João", 3000.00);
            System.out.println("Funcionário criado com sucesso: " + func1.getNome());

            Funcionario func2 = new Funcionario("Maria", -1);
            System.out.println("Funcionário criado com sucesso: " + func2.getNome());
        } catch (SalarioInvalidoException e) {
            System.err.println("Erro ao criar funcionário: " + e.getMessage());
        }
    }
}
