package file;

import classes.Avaliacao;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorAvaliacao {
    public String toCSV(List<Avaliacao> avaliacoes){
        String csv = "NotaAcumulada;NumeroAvaliacoes;\n";
        for(Avaliacao avaliacao : avaliacoes){
            csv += avaliacao.getNotaAcumulada() + ";"
                    + avaliacao.getNumeroDeAvaliacoes() + ";\n";
        }
        return csv;
    }
}
