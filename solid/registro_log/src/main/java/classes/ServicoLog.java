package classes;

import interfaces.ILogStorage;

/**
 *
 * @author kfrural
 */
public class ServicoLog{
    ILogStorage log;
            
    public ServicoLog(ILogStorage log){
        this.log = log;
    }
    
    public void registrarLog(String mensagem){
        log.armazenar(mensagem);
    }
}