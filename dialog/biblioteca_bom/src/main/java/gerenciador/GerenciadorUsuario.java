package gerenciador;

import classes.Usuario;
import file.FilePersistence;
import file.SerializadorCSVUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciadorUsuario {
    private List <Usuario> usuarios;
    
    public GerenciadorUsuario(){
        this.usuarios = new ArrayList<>();
    }
    
    public void addUsuario(Usuario u){
        usuarios.add(u);
        System.out.println("adicionado...");
    }
    
    public Usuario buscarUsuario(String nome){
        for(Usuario usuario : usuarios){
            if(usuario.getNome().equals(nome)){
                return usuario;
            }
        }
        return null;
    }
    
    public boolean removerUsuario(String nome){
        Usuario achou = buscarUsuario(nome);
        
        if(achou != null){
            usuarios.remove(achou);
            System.out.println("removeu");
            return true;
        } else {
            System.out.println("nao achou");
            return false;
        }
    }
    
    public void atualizarUsuario(String nomeAntigo, Usuario uNovo){
        Usuario existente = buscarUsuario(nomeAntigo);
        
        if(existente != null){
            int indice = usuarios.indexOf(existente);
            usuarios.set(indice, uNovo);
            System.out.println("atualizado");
        } else {
            System.out.println("nao achou");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Usuario usuario : usuarios) {
            saida.append(usuario.toString()).append("\n");
        }
        return saida.toString();
    }

    
    public void salvarNoArquivo(String caminho){
        SerializadorCSVUsuario serializador = new SerializadorCSVUsuario();
        String csvData = serializador.toCSV(usuarios);
        
        FilePersistence file = new FilePersistence();
        file.saveToFile(csvData, caminho);
        System.out.println("salvo em " + caminho);
    }
    
    public void carregarNoArquivo(String caminho){
        FilePersistence file = new FilePersistence();
        String csvData = file.loadFromFile(caminho);
        
        SerializadorCSVUsuario serializador = new SerializadorCSVUsuario();
        this.usuarios = serializador.fromCSV(csvData);
        
        System.out.println("Arquivo carregado de " + caminho);
    }
}
