/******************************************************************************

                           Faça um modelo para a classe Roda. Pense em cada 
                           atributo que este novo tipo deve ter.
*******************************************************************************/
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
