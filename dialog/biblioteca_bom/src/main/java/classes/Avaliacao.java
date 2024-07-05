package classes;

import gerenciador.GerenciadorLivro;

/**
 *
 * @author kfrural
 */

public class Avaliacao {
    private Usuario usuario;
    private GerenciadorLivro gerenciadorLivro;
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

    // Getters
    public double getNotaAcumulada() {
        return notaAcumulada;
    }

    public int getNumeroDeAvaliacoes() {
        return numeroDeAvaliacoes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        String texto = "------------- Avaliacao ---------------\n";
        
        String txt = this.gerenciadorLivro.toString();
        
        texto += this.getUsuario().toString() + "\n";
        texto += txt + "\n";
        return texto;
    }


public boolean possuiAvaliacoes(){
        
        if(this.gerenciadorLivro.getTotalLivros() > 0)
            return true;
        else
            return false;
    }

     public Livro buscarLivro(String titulo){
        return this.gerenciadorLivro.buscarLivro(titulo);    
    }

    public void removeLivro(String titulo){
        this.gerenciadorLivro.removerLivro(titulo);    
    }

    public void addLivro(Livro livro){
        this.gerenciadorLivro.addLivro(livro);
    }
}


