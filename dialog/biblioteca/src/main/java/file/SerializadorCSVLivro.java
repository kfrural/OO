package file;

import classes.Livro;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVLivro {
     public String toCSV(List<Livro> livros) {
        String csv = "Titulo;Avaliacao;\n"; // Cabeçalho
        for (Livro livro : livros) {
            csv += livro.getTitulo() + ";"
                    + livro.getAvaliacaoMedia() + ";\n";
        }
        return csv;
    }

    public List<Livro> fromCSV(String csvData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
