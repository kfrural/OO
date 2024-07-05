package file;

import classes.Autor;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializacaoCSVAutor {
    public String toCSV(List<Autor> autores){
        String csv = "Nome;CidadeNatal;\n";
        for(Autor autor : autores) {
            csv += autor.getNome() + ";"
                    + autor.getCidadeNatal() + ";\n";
        }
        return csv;
    }
}
