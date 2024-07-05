package file;

import classes.Autor;
import classes.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVLivro {

    public String toCSV(List<Livro> livros) {
        String csv = "Titulo;AnoPublicacao;Autores;Generos;Avaliacao;\n"; // Cabeçalho
        for (Livro livro : livros) {
            csv += livro.getTitulo() + ";"
                    + livro.getAnoPublicacao() + ";"
                    + livro.getAutores() + ";"
                    + livro.getGeneros() + ";"
                    + livro.getAvaliacao() + ";\n";
        }
        return csv;
    }

    public List<Livro> fromCSV(String data) {
        List<Livro> livros = new ArrayList<>();
    String[] linhas = data.split("\n");

    for (String linha : linhas) {
        String[] partes = linha.split(";");
        if (partes.length >= 5) {
            Livro livro = new Livro();
            livro.setTitulo(partes[0]);
            livro.setAnoPublicacao(Integer.parseInt(partes[1]));

            // Convertendo string para List<Autor>
            String[] autoresStr = partes[2].split(",");
            List<Autor> autores = new ArrayList<>();
            for (String autorStr : autoresStr) {
                autores.add(new Autor());
            }
            livro.setAutores(autores);

            // Convertendo string para List<String> para gêneros
            String[] generosStr = partes[3].split(",");
            List<String> generos = new ArrayList<>();
            for (String generoStr : generosStr) {
                generos.add(generoStr);
            }
            livro.setGeneros(generos);

            // Adicionando avaliações
            String[] avaliacaoStr = partes[4].split(",");
            for (String notaStr : avaliacaoStr) {
                livro.adicionarAvaliacao(Double.parseDouble(notaStr));
            }

            livros.add(livro);
        }
    }
    return livros;
    }

}
