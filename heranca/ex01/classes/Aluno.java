package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Aluno extends Pessoa{
    private String matricula;
    private int anoingresso;

    public Aluno() {
        super();
        this.matricula = "";
        this.anoingresso = 0;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreencha...\n");
        super.preencher();
        System.out.println("Matricula: ");
        this.setMatricula(ler.next());
        System.out.println("Ano ingresso: ");
        this.setAnoingresso(ler.nextInt());
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + "matricula=" + matricula + ", anoingresso=" + anoingresso + '}';
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoingresso() {
        return anoingresso;
    }

    public void setAnoingresso(int anoingresso) {
        this.anoingresso = anoingresso;
    }
        
}
