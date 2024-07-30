package classes;

/**
 *
 * @author kfrural
 */
public class Moto implements Veiculo {
    
    @Override
    public void entrarEstacionamento(){
        System.out.println("a moto entrou");
    }
    
    @Override
    public void sairEstacionamento(){
        System.out.println("a moto saiu");
    }
}
