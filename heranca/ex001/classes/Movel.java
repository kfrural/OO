package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Movel extends Produto{
    private String cor;

    public Movel() {
        super();
        this.cor = "";
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreencha...\n");
        super.preencher();
        System.out.println("Cor: ");
        this.setCor(ler.next());
    }

    @Override
    public String toString() {
        return "Movel{" + super.toString() + "cor=" + cor + '}';
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
        
}
