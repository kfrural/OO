package classes;

import interfaces.IConversorMoeda;

/**
 *
 * @author kfrural
 */
public class ConversorMoedaReal implements IConversorMoeda{

    @Override
    public void converterParaReal(double dolar) {
        System.out.println("Conversão Dolar :  " + dolar * 5.47);
    }

    @Override
    public void converterParaDolar(double real) {
        System.out.println("Conversão Real  :" + real / 5.47);
    }
    
    
}
