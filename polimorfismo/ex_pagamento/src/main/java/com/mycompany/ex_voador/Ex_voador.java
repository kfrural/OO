package com.mycompany.ex_voador;

import classes.Boleto;
import classes.CartaoCredito;
import classes.CartaoDebito;
import classes.MeioPagamento;

/**
 *
 * @author kfrural
 */
public class Ex_voador {

    public static void main(String[] args) {
       MeioPagamento credito = new CartaoCredito();
       MeioPagamento debito = new CartaoDebito();
       MeioPagamento boleto = new Boleto();

       realizarPagamento(credito, 100.00);
       realizarPagamento(debito, 50.00);
       realizarPagamento(boleto, 200.00);
       
    }
    public static void realizarPagamento(MeioPagamento meioPagamento, double valor) {
        meioPagamento.efetuarPagamento(valor);
    }
}
