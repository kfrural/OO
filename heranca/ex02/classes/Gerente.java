package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Gerente extends Funcionario{
    private double cargaHoraria;

    public Gerente() {
        this.cargaHoraria = 0.0;
    }
    
    public Gerente(Double cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    public Gerente(Gerente outro){
        this.cargaHoraria = outro.getCargaHoraria();
    }
    
    public void copy(Gerente outro){
        this.cargaHoraria = outro.getCargaHoraria();
    }
    
    public void fill(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Preenche\n");
        super.preencher();
        System.out.println("CargaHoraria: ");
        this.setCargaHoraria(ler.nextDouble());
    }
    
    @Override
    public String toString(){
        return "Gerente{" + super.toString() + "cargaHoraria=" + cargaHoraria + '}';
    }
    
    public double getCargaHoraria(){
        return cargaHoraria;
    }
    
    public void setCargaHoraria(Double cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
}
