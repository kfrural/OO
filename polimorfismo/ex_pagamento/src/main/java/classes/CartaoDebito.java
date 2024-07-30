package classes;

/**
 *
 * @author kfrural
 */
public class CartaoDebito extends MeioPagamento {
    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " feito com Cartão de Débito.");
        
    }
}
