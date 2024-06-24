package classes;

/**
 *
 * @author kfrural
 */
public class Funcionario {

    protected String nome;
    protected String id;
    protected double salario;
    protected boolean estoque;

    public Funcionario(String nome, String id, double salario, boolean estoque) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", id=" + id + ", salario=" + salario + ", estoque=" + estoque + '}';
    }

    public boolean verificarEstoque() {
        return estoque;
    }

    public double aumentoSalario() {
        return salario + (salario * 0.05);
    }

    public void infoDetalhada() {
        System.out.println(this.toString());
    }

}
