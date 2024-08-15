package classes;

import interfaces.EnviadorMensagem;

/**
 *
 * @author kfrural
 */
public class EnviadorTelegram implements EnviadorMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Telegram: " + mensagem);
    }
}