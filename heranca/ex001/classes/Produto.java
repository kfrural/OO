package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Produto {
    protected String cod;
    protected String nome;
    protected double preco;
    protected double custo;

    public Produto() {
        this.cod = "";
        this.nome = "";
        this.preco = ' ';
        this.custo = 0;
    }

    public Produto(String cod, String nome, char preco, int custo) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.custo = custo;
    }
    
    public Produto(Produto outro){
        this.cod = outro.getCod();
        this.nome = outro.getNome();
        this.preco = outro.getPreco();
        this.custo = outro.getCusto();
    }
    
    public void copy(Produto outro){
        this.cod = outro.getCod();
        this.nome = outro.getNome();
        this.preco = outro.getPreco();
        this.custo = outro.getCusto();
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Cod: ");
        this.setCod(ler.next());
        System.out.println("Nome: ");
        this.setNome(ler.next());
        System.out.println("Preco: ");
        this.setPreco(ler.next().charAt(0));
        System.out.println("Custo: ");
        this.setCusto(ler.nextInt());
    }

    @Override
    public String toString() {
        return "Produto{"  + "cod" + cod + "nome=" + nome + ", preco=" + preco + ", custo=" + custo + '}';
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
    
    
}
