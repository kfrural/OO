package gerenciador;

import classes.Autor;
import classes.Livro;
import classes.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciadorBiblioteca {
     private List<Livro> livros;
    private List<Usuario> usuarios;

    public GerenciadorBiblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    /**
     * Quando usamos o retorno igual BOOLEAN não acontece o erro de concorrencia
     * Pois o return faz com que o loop seja interrompido,
     * logo o sistema nao 'quebra' no final da listar
     * 
     * Agora, se trocarmos para void e retirarmos o return vai dar erro de concorrencia
     * @param titulo
     * @return 
     */
     public boolean removerLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(livro);
                return true;
            }
        }
        return false;
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public boolean removerUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                usuarios.remove(usuario);
                return true;
            }
        }
        return false;
    }

    //gerenciamento de livros
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    
    public List<Livro> buscarLivrosPorAutor(String nomeAutor) {
        List<Livro> encontrados = new ArrayList<>();
        for (Livro livro : livros) {
            Autor autor = livro.findAutor(nomeAutor);
            
            if(autor != null){
                encontrados.add(livro);
            }            
        }
        return encontrados;
    }

    public List<Livro> buscarLivrosPorGenero(String genero) {
        List<Livro> encontrados = new ArrayList<>();
        for (Livro livro : livros) {            
            if (livro.findGenero(genero)) {
                encontrados.add(livro);
            }
        }
        return encontrados;
    }
    
    
    //É que o exerccio pediu de fato
    public void avaliarLivro(String titulo, double nota, Usuario usuario) {
        Livro livro = buscarLivroPorTitulo(titulo);
        
        if (livro != null && !usuario.verificaLivroLido(livro)) {
            //atualizar a nota na lista de livros da BBT
            livro.adicionarAvaliacao(nota);
            
            //atualizar a nota na lista de livros do usuario
            usuario.adicionarLivroLido(livro, nota);
        }
    }

    public List<Livro> recomendarLivrosParaUsuario(String nomeUsuario) {
        List<Livro> recomendados = new ArrayList<>();
        
        //verifica se o nome 'jose' é um usuario valido
        Usuario usuario = null;
        for (Usuario u : usuarios) {
            if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
                usuario = u;
                break;
            }
        }

        //aqui de fato é o sistema de recomendacao.
        if (usuario != null) {
            for (Livro livro : livros) {
                
                //verifica se joserui ja leu e se o livro tem nota boa > 3.5
                if (!usuario.getLivrosLidos().contains(livro) && livro.getAvaliacaoMedia() > 3.5) {
                    
                    //verificar se o genero do livro bate com os generos que joserui gosta
                    for (String genero : usuario.getGenerosFavoritos()) {
                        if (livro.findGenero(genero)) {
                            recomendados.add(livro);
                            break;
                        }
                    }
                }
            }
        }

        return recomendados;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "livros=" + livros + ", usuarios=" + usuarios + '}';
    }
    
    
}
