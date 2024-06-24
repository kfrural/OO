package classes;

/**
 *
 * @author kfrural
 */
public class Gerente extends Funcionario{
    private int equipeSize;

    public Gerente(int equipeSize, String nome, String id, double salario, boolean estoque) {
        super(nome, id, salario, estoque);
        this.equipeSize = equipeSize;
    }
    
    @Override
    public double aumentoSalario(){
        return salario + (salario * 0.05) + (equipeSize * 0.005);
    }
}
