package classes;

/**
 *
 * @author kfrural
 */

public class Avaliacao {
    private double notaAcumulada;
    private int numeroDeAvaliacoes;

    public Avaliacao() {
        this.notaAcumulada = 0;
        this.numeroDeAvaliacoes = 0;
    }

  /**
     * Adiciona uma nova avaliação ao livro, garantindo que a nota esteja entre 0 e 5.
     * 
     * @param nota A nota a ser adicionada, deve estar no intervalo de 0 a 5.
     */
    public void adicionarAvaliacao(double nota) {
        if (nota >= 0 && nota <= 5) {
            notaAcumulada += nota;
            numeroDeAvaliacoes++;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 5.");
        }
    }
    
    public void removerAvalicao(double nota){
        if (nota >= 0 && nota <= 5) {
            notaAcumulada -= nota;
            numeroDeAvaliacoes--;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 5.");
        }
    }

    public double calcularMedia() {
        if(numeroDeAvaliacoes > 0){
           return notaAcumulada/numeroDeAvaliacoes;
        }else
            return 0.0;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "notaAcumulada=" + notaAcumulada + ", numeroDeAvaliacoes=" + numeroDeAvaliacoes + '}';
    }

    // Getters
    public double getNotaAcumulada() {
        return notaAcumulada;
    }

    public int getNumeroDeAvaliacoes() {
        return numeroDeAvaliacoes;
    }

    public void setNotaAcumulada(double notaAcumulada) {
        this.notaAcumulada = notaAcumulada;
    }

    public void setNumeroDeAvaliacoes(int numeroDeAvaliacoes) {
        this.numeroDeAvaliacoes = numeroDeAvaliacoes;
    }
}


