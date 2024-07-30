package classes;

/**
 *
 * @author kfrural
 */
public class CartaoCredito extends MeioPagamento {
    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " feito com Cartão de Crédito.");
    }
}
