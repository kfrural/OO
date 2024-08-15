package classes;

import interfaces.ILogStorage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kfrural
 */
public class ArquivoLogStorage implements ILogStorage{
    
    @Override
    public void armazenar(String mensagem){
        String nomeArquivo = "Arquivo";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo))) {
            escritor.write(mensagem);
            System.out.println("Mensagem salvo com sucesso no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Mensagem ao salvar o texto no arquivo: " + e.getMessage());
        }
    }
}