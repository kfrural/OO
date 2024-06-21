package com.oo.projpedidoprodutos.file;


import com.oo.projpedidoprodutos.classes.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class SerializadorCSVReserva {
    
    // Serializa = Salvar no formato texto
    //Serializa a lista de disciplinas para uma String no formato CSV
    public String toCSV(List<Reserva> disciplinas) {
        String csv = "Cod;Nome;Custo;Preco;\n";
        for (Reserva disciplina : disciplinas) {
            csv += disciplina.getCod() + ";" 
                + disciplina.getNome() + ";"
                + disciplina.getCusto() + ";"
                + disciplina.getPreco() + ";\n";
        }
        return csv;
    }

    // Deserializa uma String no formato CSV para uma lista de disciplinas
    public List<Reserva> fromCSV(String data) {
        List<Reserva> disciplinas = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Reserva disciplina = new Reserva();
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
