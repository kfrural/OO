package com.mycompany.ex_voador;

import classes.ConversorMoedaReal;
import classes.ConversorMoedaDolar;
import classes.ServicoFinanceiro;
import interfaces.IConversorMoeda;

/**
 *
 * @author kfrural
 */
public class Ex_voador {

    public static void main(String[] args) {
       IConversorMoeda conversorReal = new ConversorMoedaReal();
       IConversorMoeda conversorDolar = new ConversorMoedaDolar();
       
       ServicoFinanceiro servicoR = new ServicoFinanceiro(conversorReal);
       ServicoFinanceiro servicoD = new ServicoFinanceiro(conversorDolar);
       servicoR.realizarTransacao(1500.0);
       servicoD.realizarTransacao(2000.0);
    }
}
