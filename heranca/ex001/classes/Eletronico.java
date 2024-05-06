package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Eletronico extends Produto{
    private String voltagem ;

    public Eletronico() {
        super();
        this.voltagem = "";
    }

    public Eletronico(String voltagem) {
        this.voltagem = voltagem;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreenceha\n");
        super.preencher();
        System.out.println("Voltagem: ");
        this.setVoltagem(ler.next());
    }

    @Override
    public String toString() {
        return "Eletronico{" + super.toString() + "voltagem=" + voltagem + '}';
    }
    
    

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }  
}
