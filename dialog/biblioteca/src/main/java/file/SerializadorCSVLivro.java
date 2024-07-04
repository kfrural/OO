package file;

import classes.Livro;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVLivro {
     public String toCSV(List<Livro> livros) {
        String csv = "Titulo;AnoPublicacao;Autores;Generos;Avaliacao\n"; // Cabeçalho
        for (Livro livro : livros) {
            csv += livro.getTitulo() + ";"
                    + livro.getAnoPublicacao() + ";"
                    + livro.getAutores() + ";"
                    + livro.getGeneros() + ";"
                    + livro.getAvaliacao() + ";\n";
                    
        }
        return csv;
    }

    public List<Livro> fromCSV(String csvData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
