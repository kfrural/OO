package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Secretario extends Funcionario{
    private double cargaHoraria;

    public Secretario() {
        this.cargaHoraria = 0.0;
    }
    
    public Secretario(Double cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    public Secretario(Secretario outro){
        this.cargaHoraria = outro.getCargaHoraria();
    }
    
    public void copy(Secretario outro){
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
        return "Secretario{" + super.toString() + "cargaHoraria=" + cargaHoraria + '}';
    }
    
    public double getCargaHoraria(){
        return cargaHoraria;
    }
    
    public void setCargaHoraria(Double cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
}
