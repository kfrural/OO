package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Engenheiro extends Funcionario{
    private String setor ;

    public Engenheiro() {
        super();
        this.setor = "";
    }

    public Engenheiro(String setor) {
        this.setor = setor;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreenceha\n");
        super.preencher();
        System.out.println("Setor: ");
        this.setSetor(ler.next());
    }

    @Override
    public String toString() {
        return "Engenheiro{" + super.toString() + "setor=" + setor + '}';
    }
    
    

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }  
}
