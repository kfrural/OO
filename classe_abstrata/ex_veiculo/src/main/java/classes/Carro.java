package classes;

/**
 *
 * @author kfrural
 */
public class Carro implements Veiculo {
    
    @Override
    public void entrarEstacionamento(){
        System.out.println("o carro entrou");
    }
    
    @Override
    public void sairEstacionamento(){
        System.out.println("o carro saiou");
    }
}
