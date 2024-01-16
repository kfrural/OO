/******************************************************************************

                           No processo de criação de software um passo 
                           importantíssimo é a modelagem. Neste momento 
                           pensamos nas características essenciais de nossos 
                           sistemas. Faça um modelo para a classe Pessoa. Pense
                           em cada atributo que este novo tipo deve ter.
*******************************************************************************/
public class Pessoa{
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getSexo(){
        return this.sexo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
}
