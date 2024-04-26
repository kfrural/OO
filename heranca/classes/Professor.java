package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Professor extends Pessoa{
    private String cpf ;

    public Professor() {
        super();
        this.cpf = "";
    }

    public Professor(String cpf) {
        this.cpf = cpf;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreenceha\n");
        super.preencher();
        System.out.println("CPF: ");
        this.setCpf(ler.next());
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + "cpf=" + cpf + '}';
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }  
}
