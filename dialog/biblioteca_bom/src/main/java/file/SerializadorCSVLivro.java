package file;

import classes.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVLivro {
     public String toCSV(List<Livro> livros) {
        String csv = "Titulo;AnoPublicacao;Avaliacao;\n"; // Cabeçalho
        for (Livro livro : livros) {
            csv += livro.getTitulo() + ";"
                    + livro.getAvaliacaoMedia() + ";\n";
        }
        return csv;
    }

    public List<Livro> fromCSV(String data) {
        List<Livro> livros = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 2) {
                Livro livro = new Livro();
                livro.setTitulo(partes[0]);
                livro.setAnoPublicacao(Integer.parseInt(partes[1]));
                
                //apos montar um produto, adiciono na lista
                livros.add(livro);
            }
        }
        return livros;
    }

}
