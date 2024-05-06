package com.mycompany.ex1;

import classes.Funcionario;
import classes.Engenheiro;

/**
 *
 * @author kfrural
 */
public class Ex1 {

    public static void main(String[] args) {
        Funcionario p = new Funcionario();
        Engenheiro e = new Engenheiro();
        
        e.preencher();
        System.out.println(e.toString());
    }
}
