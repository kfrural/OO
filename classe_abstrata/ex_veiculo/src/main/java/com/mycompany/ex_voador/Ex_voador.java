package com.mycompany.ex_voador;

import classes.Carro;
import classes.Moto;
import classes.Veiculo;


/**
 *
 * @author kfrural
 */
public class Ex_voador {

    public static void main(String[] args) {
       Veiculo moto = new Moto();
       Veiculo carro = new Carro();
       
       moto.entrarEstacionamento();
       moto.sairEstacionamento();
       
       carro.entrarEstacionamento();
       carro.sairEstacionamento();
    }
}
