package com.mycompany.ex1;

import classes.Produto;
import classes.Eletronico;

/**
 *
 * @author kfrural
 */
public class Ex1 {

    public static void main(String[] args) {
        Produto p = new Produto();
        Eletronico e = new Eletronico();
        
        e.preencher();
        System.out.println(e.toString());
    }
}
