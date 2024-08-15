package com.mycompany.ex_voador;

import classes.ArquivoLogStorage;
import interfaces.ILogStorage;


/**
 *
 * @author kfrural
 */
public class Ex_voador {

    public static void main(String[] args) {
        ILogStorage log = new ArquivoLogStorage();
        
        log.armazenar("kkkkkkkkkkkkkkk");
    }
}
