/******************************************************************************

                           Faça um modelo para a classe Carro. Pense em cada 
                           atributo que este novo tipo deve ter, se necessário
                           pode usar outro tipo abstrato recém criado
*******************************************************************************/
import java.util.List;

public class Roda{
    private int tamanho;
    private String deQue;
    
    public Pessoa( int tamanho, String deQue){
        this.tamanho = tamanho;
        this.deQue = deQue;
    }

    public int getTamanho(){
        return this.tamanho;
    }
    public String getDeQue(){
        return this.deQue;
    }
    
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    public void setDeQue(String deQue){
        this.deQue = deQue;
    }
}

public class Carro{
    private List<Roda> rodas;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    
    puublic Carro(List<Roda> rodas, String marca, String modelo, int ano, String placa){
        this.rodas = rodas;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }
    
    public List<Roda> getRodas(){
        return this.rodas;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public String getPlaca(){
        return this.placa;
    }
    
    public void setRodas(List<Roda> rodas){
        this.rodas = rodas;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setPlaca(String placa){
        this.placa = placa
    }
}
