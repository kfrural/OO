package classes;

import interfaces.EnviadorMensagem;

/**
 *
 * @author kfrural
 */
public class EnviadorSMS implements EnviadorMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}