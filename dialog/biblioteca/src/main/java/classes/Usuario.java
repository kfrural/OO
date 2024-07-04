package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Usuario {
    private String nome;
    
    private List<String> generosFavoritos;
    private List<Livro> livrosLidos;

    public Usuario() {
        this.nome = "";
         this.generosFavoritos = new ArrayList<>();
        this.livrosLidos = new ArrayList<>();
    }
    

    public Usuario(String nome) {
        this.nome = nome;
        
        //para inicializacao das listas
        this.generosFavoritos = new ArrayList<>();
        this.livrosLidos = new ArrayList<>();
    }

    public void adicionarGeneroFavorito(String genero) {
        if (!generosFavoritos.contains(genero)) {
            generosFavoritos.add(genero);
        }
    }

    public void removerGeneroFavorito(String genero) {
        generosFavoritos.remove(genero);
    }
    
    public boolean findGenero(String genero){
        return generosFavoritos.contains(genero);
    }

    /**
     * Precisamos informar qual livro foi lido e a avaliacao 0 a 5
     * @param livro
     * @param avaliacao 
     */
    public void adicionarLivroLido(Livro livro, double nota) {
        if (!livrosLidos.contains(livro)) {
            livrosLidos.add(livro);
            
            livro.adicionarAvaliacao(nota);//Essa linha de codigo é desnecessaria
        }
    }
    
    public void removerLivroLido(Livro livro, double nota){
        if (!livrosLidos.contains(livro)) {
            livrosLidos.remove(livro);
            livro.removerAvaliacao(nota);
        }
    }
    
    public boolean verificaLivroLido(Livro livro){
       return this.livrosLidos.contains(livro);
    }
    

    // Getters
    public String getNome() {
        return nome;
    }

    public List<String> getGenerosFavoritos() {
        return generosFavoritos;
    }

    public List<Livro> getLivrosLidos() {
        return livrosLidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", generosFavoritos=" + generosFavoritos +
                ", livrosLidos=" + livrosLidos +
                '}';
    }
}



