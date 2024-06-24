package classes;

/**
 *
 * @author kfrural
 */
public class Secretario extends Funcionario {

    private String linguasFalada;

    public Secretario(String linguasFalada, String nome, String id, double salario, boolean estoque) {
        super(nome, id, salario, estoque);
        this.linguasFalada = linguasFalada;
    }

    public String agenda() {
        return "Agenda organizada para o dia";
    }

}
