package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Diretor extends Funcionario{
    private String codEquipe;

    public Diretor() {
        super();
        this.codEquipe = "";
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreencha...\n");
        super.preencher();
        System.out.println("CodEquipe: ");
        this.setCodEquipe(ler.next());
    }

    @Override
    public String toString() {
        return "Diretor{" + super.toString() + "codEquipe=" + codEquipe + '}';
    }
    
    public String getCodEquipe() {
        return codEquipe;
    }

    public void setCodEquipe(String codEquipe) {
        this.codEquipe = codEquipe;
    }
        
}
