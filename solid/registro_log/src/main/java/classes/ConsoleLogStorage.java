package classes;

import interfaces.ILogStorage;

/**
 *
 * @author kfrural
 */
public class ConsoleLogStorage  implements ILogStorage{
    
    @Override
    public void armazenar(String mensagem){
        System.out.println(mensagem);
    }
}