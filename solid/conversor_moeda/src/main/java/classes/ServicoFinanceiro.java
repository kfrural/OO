package classes;

import interfaces.IConversorMoeda;

/**
 *
 * @author kfrural
 */
public class ServicoFinanceiro {
    private IConversorMoeda converte;

    public ServicoFinanceiro(IConversorMoeda converte) {
        this.converte= converte;
    }
    
    
            
    public void realizarTransacao(double valor){
        converte.converterParaReal(valor);
        converte.converterParaDolar(valor);
    }
}