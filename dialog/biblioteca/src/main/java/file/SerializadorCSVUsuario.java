package file;

import classes.Usuario;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVUsuario {
    public String toCSV(List<Usuario> usuarios){
        String csv = "Nome;GeneroFavorito;LivrosLidos;\n";
        for(Usuario usuario : usuarios){
            csv += usuario.getNome() + ";"
                    + usuario.getGenerosFavoritos() + ";"
                    + usuario.getLivrosLidos() + ";\n";
        }
        return csv;
    }

    public List<Usuario> fromCSV(String csvData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
