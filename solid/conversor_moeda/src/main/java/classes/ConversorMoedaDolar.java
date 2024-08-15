package classes;

import interfaces.IConversorMoeda;

/**
 *
 * @author kfrural
 */
public class ConversorMoedaDolar implements IConversorMoeda {
      @Override
    public void converterParaReal(double valor) {
        System.out.println("Conversão Dolar :  " + valor * 5.47);
    }

    @Override
    public void converterParaDolar(double valor) {
        System.out.println("Conversão Real  :" + valor / 5.47);
    }
    
    
}