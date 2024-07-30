package com.mycompany.ex_voador;

import classes.Ave;
import classes.Aviao;
import classes.Voador;

/**
 *
 * @author kfrural
 */
public class Ex_voador {

    public static void main(String[] args) {
       Voador ave = new Ave();
       Voador aviao = new Aviao();
       
       ave.voar();
       aviao.voar();
    }
}
