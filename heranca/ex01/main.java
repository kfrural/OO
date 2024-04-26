package com.mycompany.ex1;

import classes.Pessoa;
import classes.Professor;

/**
 *
 * @author kfrural
 */
public class Ex1 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Professor prof = new Professor();
        
        prof.preencher();
        System.out.println(prof.toString());
    }
}
