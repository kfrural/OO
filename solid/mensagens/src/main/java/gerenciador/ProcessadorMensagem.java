package gerenciador;

import interfaces.EnviadorMensagem;

/**
 *
 * @author kfrural
 */
public class ProcessadorMensagem {
    private EnviadorMensagem enviadorMensagem;

    public ProcessadorMensagem(EnviadorMensagem enviadorMensagem) {
        this.enviadorMensagem = enviadorMensagem;
    }

    public void processar(String mensagem) {
        enviadorMensagem.enviarMensagem(mensagem);
    }
}
