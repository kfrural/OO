package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Livro {
    private String titulo;    
    private int anoPublicacao;
    private List<Autor> autores; // Agora é uma lista de Autor
    
    private List<String> generos;
    private Avaliacao avaliacao;

    public Livro(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        
        //nao podemos esquecer de instanciar nossas listas!
        this.autores = new ArrayList<>();
        this.avaliacao = new Avaliacao();
        this.generos = new ArrayList<>();
    }

    public Livro() {
        this.titulo = "";
        this.anoPublicacao = 0;
        
    }
    

    //controle do objeto avaliacao
    public void adicionarAvaliacao(double nota) {
        avaliacao.adicionarAvaliacao(nota);
    }
    
    public void removerAvaliacao(double nota){
        avaliacao.removerAvalicao(nota);
    }
    
    //controle da lista de genero
    public void adicionarGenero(String genero) {
        generos.add(genero);
    }

    public void removeGenero(String genero) {
        generos.remove(genero);
    }
    
    public boolean findGenero(String genero){
        return this.generos.contains(genero);
    }
    
    /**
     * Não estou usando toString() pois quero algo mais customizado!
     */
  @Override
public String toString() {
    StringBuilder detalhes = new StringBuilder();
    detalhes.append("Título: ").append(titulo).append("\n");
    //detalhes.append("Autor(es): ");
    //for (Autor autor : autores) {
    //    detalhes.append(autor).append("; ");
   // }
    detalhes.append("\nAno de Publicação: ").append(anoPublicacao).append("\n");
    //detalhes.append("Gêneros: ");
    //for (String genero : generos) {
    //    detalhes.append(genero).append(" ");
    //}
   // detalhes.append("\nAvaliação Média: ").append(avaliacao.calcularMedia()).append("\n");

    return detalhes.toString();
}


    // Getters e setters conforme necessário
    public String getTitulo() {
        return titulo;
    }

    public double getAvaliacaoMedia() {
        return avaliacao.calcularMedia();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    
    //controle da lista de autor ex10
    public void addAutor(Autor autor){
        this.autores.add(autor);        
    }
                                                                                
    public void removeAutor(String nomeAutor){
        Autor autor = this.findAutor(nomeAutor);
        this.autores.remove(autor);
    }
    
    public Autor findAutor(String nomeAutor){
        for(Autor autor: this.autores){
            if(autor.getNome().equals(nomeAutor)){
                return autor;
            }
        }
        return null;
    }
    
    public List<Autor> findAuthorByCity(String nomeCidade){
        List<Autor> autoresEncontrados = new ArrayList<>();
        
        for(Autor autor: this.autores){
            if(autor.getCidadeNatal().equals(nomeCidade)){
                autoresEncontrados.add(autor);
            }
        }
        
        return autoresEncontrados;
    
    }
}

