package classes;

import interfaces.EnviadorMensagem;

/**
 *
 * @author kfrural
 */
public class EnviadorEmail implements EnviadorMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}
