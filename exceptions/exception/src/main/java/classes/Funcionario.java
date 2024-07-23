package classes;

/**
 *
 * @author kfrural
 */
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) throws SalarioInvalidoException {
        this.nome = nome;
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws SalarioInvalidoException {
        if (salario <= 0) {
            throw new SalarioInvalidoException("O salário não pode ser menor ou igual a zero.");
        }
        this.salario = salario;
    }
}
