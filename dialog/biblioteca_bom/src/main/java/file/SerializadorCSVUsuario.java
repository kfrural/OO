package file;

import classes.Usuario;
import java.util.ArrayList;
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

      public List<Usuario> fromCSV(String data) {
        List<Usuario> usuarios = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 2) {
                Usuario usuario = new Usuario();
                usuario.setNome(partes[0]);
                usuario.setId(partes[1]);
                
                //apos montar um produto, adiciono na lista
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }
}
