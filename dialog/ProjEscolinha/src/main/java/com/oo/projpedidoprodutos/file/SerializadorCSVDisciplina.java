package com.oo.projpedidoprodutos.file;


import com.oo.projpedidoprodutos.classes.Disciplina;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class SerializadorCSVDisciplina {
    
    // Serializa = Salvar no formato texto
    //Serializa a lista de disciplinas para uma String no formato CSV
    public String toCSV(List<Disciplina> disciplinas) {
        String csv = "Cod;Nome;Custo;Preco;\n";
        for (Disciplina disciplina : disciplinas) {
            csv += disciplina.getCod() + ";" 
                + disciplina.getNome() + ";"
                + disciplina.getCusto() + ";"
                + disciplina.getPreco() + ";\n";
        }
        return csv;
    }

    // Deserializa uma String no formato CSV para uma lista de disciplinas
    public List<Disciplina> fromCSV(String data) {
        List<Disciplina> disciplinas = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Disciplina disciplina = new Disciplina();
                disciplina.setCod(partes[0]);
                disciplina.setNome(partes[1]);
                disciplina.setCusto(Double.parseDouble(partes[2]));
                disciplina.setPreco(Double.parseDouble(partes[3]));
                
                //apos montar um disciplina, adiciono na lista
                disciplinas.add(disciplina);
            }
        }
        return disciplinas;
    }
}
