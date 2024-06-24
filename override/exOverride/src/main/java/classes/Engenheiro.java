package classes;

/**
 *
 * @author kfrural
 */
public class Engenheiro extends Funcionario {
    private String areaEspecializacao;

    public Engenheiro(String areaEspecializacao, String nome, String id, double salario, boolean estoque) {
        super(nome, id, salario, estoque);
        this.areaEspecializacao = areaEspecializacao;
    }
    
    @Override
    public double aumentoSalario(){
        return salario + (salario * 0.1); //eng tem um prumo mió
    }
    
}
