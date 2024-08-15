package com.mycompany.ex_voador;

import classes.EnviadorEmail;
import classes.EnviadorSMS;
import classes.EnviadorTelegram;
import gerenciador.ProcessadorMensagem;
import interfaces.EnviadorMensagem;

/**
 *
 * @author kfrural
 */
public class Ex_voador {

    public static void main(String[] args) {
       EnviadorMensagem enviadorSMS = new EnviadorSMS();
       EnviadorMensagem enviadorEmail = new EnviadorEmail();
       EnviadorMensagem enviadorTelegram = new EnviadorTelegram();

        ProcessadorMensagem processadorSMS = new ProcessadorMensagem(enviadorSMS);
        ProcessadorMensagem processadorEmail = new ProcessadorMensagem(enviadorEmail);
        ProcessadorMensagem processadorTelegram = new ProcessadorMensagem(enviadorTelegram);

        processadorSMS.processar("Olá via SMS!");
        processadorEmail.processar("Olá via Email!");
        processadorTelegram.processar("Olá via Telegram!");
       
    }
}
