package classes;

/**
 *
 * @author kfrural
 */
public class Diretor extends Funcionario{
    private String areaResponsavel;
    private double bonusAnual;

    public Diretor(String areaResponsavel, double bonusAnual, String nome, String id, double salario, boolean estoque) {
        super(nome, id, salario, estoque);
        this.areaResponsavel = areaResponsavel;
        this.bonusAnual = bonusAnual;
    }
    
    public double calcularBonus(){
        return bonusAnual = salario + (salario * 0.2);
    }
    
    @Override
    public void infoDetalhada(){
        super.infoDetalhada();
        System.out.println("Area responsavel: " + areaResponsavel);
        System.out.println("Bonus anual: " + bonusAnual);
    }
}
