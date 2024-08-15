package gerenciador;

import interfaces.EnviadorMensagem;

/**
 *
 * @author kfrural
 */
 public class ProcessadorMensagem {
    private EnviadorMensagem enviador;

    // Construtor que recebe uma implementação de IEnviadorMensagem
    public ProcessadorMensagem(EnviadorMensagem enviador) {
        this.enviador = enviador;
    }

    // Método que processa a mensagem
    public void processar(String mensagem) {
        enviador.enviarMensagem(mensagem);
    }
}
