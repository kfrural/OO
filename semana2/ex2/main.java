/*Faça uma classe para o modelo “Roda”. Instancie dois objetos para 
a classe carro e preencha os atributos dos objetos utilizando os métodos set*/

package com.mycompany.mavenproject1;

/**
 *
 * @author kfrural
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Roda r1 = new Roda();
        r1.setRaio(13);
        r1.setMaterial("aco");
        r1.setPeso(3);
        
        System.out.println(" O raio eh : " + r1.getRaio() + "\nO material eh: " + r1.getMaterial() + "\nO peso eh: " + r1.getPeso());
    }
}
