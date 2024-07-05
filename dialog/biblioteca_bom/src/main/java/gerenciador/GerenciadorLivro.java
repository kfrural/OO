
package gerenciador;

import classes.Livro;
import file.FilePersistence;
import file.SerializadorCSVLivro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciadorLivro {
    private List <Livro> livros;
    
    public GerenciadorLivro(){
        this.livros = new ArrayList<>();
    }
    
    public void addLivro(Livro l){
        livros.add(l);
        System.out.println("adicionado...");
    }
    
    public Livro buscarLivro(String titulo){
        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }
    
    public boolean removerLivro(String titulo){
        Livro achou = buscarLivro(titulo);
        
        if(achou != null){
            livros.remove(achou);
            System.out.println("removeu");
            return true;
        } else {
            System.out.println("nao achou");
            return false;
        }
    }
    
    public void atualizarLivro(String tituloAntigo, Livro lNovo){
        Livro existente = buscarLivro(tituloAntigo);
        
        if(existente != null){
            int indice = livros.indexOf(existente);
            livros.set(indice, lNovo);
            System.out.println("atualizado");
        } else {
            System.out.println("nao achou");
        }
    }
    
        public int getTotalLivros(){
        return this.livros.size();
    }

     @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Livro livro : livros) {
            saida.append(livro.toString()).append("\n");
        }
        return saida.toString();
    }

    
    public void salvarNoArquivo(String caminho){
        SerializadorCSVLivro serializador = new SerializadorCSVLivro();
        String csvData = serializador.toCSV(livros);
        
        FilePersistence file = new FilePersistence();
        file.saveToFile(csvData, caminho);
        System.out.println("salvo em " + caminho);
    }
    
    public void carregarNoArquivo(String caminho){
        FilePersistence file = new FilePersistence();
        String csvData = file.loadFromFile(caminho);
        
        SerializadorCSVLivro serializador = new SerializadorCSVLivro();
        this.livros = serializador.fromCSV(csvData);
        
        System.out.println("Arquivo carregado de " + caminho);
    }
}
