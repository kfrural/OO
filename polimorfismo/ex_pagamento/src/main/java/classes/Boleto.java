package classes;

/**
 *
 * @author kfrural
 */
public class Boleto extends MeioPagamento {
    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " feito com Boleto.");
        
    }
}