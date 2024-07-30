package com.mycompany.ex_voador;

import classes.Atacante;
import classes.Guerreiro;
import classes.Mago;



/**
 *
 * @author kfrural
 */
public class Ex_voador {

    public static void main(String[] args) {
       Atacante mago = new Mago();
       Atacante guerreiro = new Guerreiro();
       
       fazerAtaque(mago);
       fazerAtaque(guerreiro);
       
    }
    public static void fazerAtaque(Atacante a){
        a.atacar();
    }
}
