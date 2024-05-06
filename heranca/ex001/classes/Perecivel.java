package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Perecivel extends Produto{
    private double peso;

    public Perecivel() {
        this.peso = 0.0;
    }
    
    public Perecivel(Double peso){
        this.peso = peso;
    }
    
    public Perecivel(Perecivel outro){
        this.peso = outro.getPeso();
    }
    
    public void copy(Perecivel outro){
        this.peso = outro.getPeso();
    }
    
    public void fill(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Preenche\n");
        super.preencher();
        System.out.println("Peso: ");
        this.setPeso(ler.nextDouble());
    }
    
    @Override
    public String toString(){
        return "Perecivel{" + super.toString() + "peso=" + peso + '}';
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(Double peso){
        this.peso = peso;
    }
    
}
