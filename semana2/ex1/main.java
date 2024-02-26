/*Faça uma classe para o modelo “Roda” e outra para “Produto”. E instancie dois objetos para cada classe*/

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
        
        Produto p1 = new Produto(1, 10.5, "arroz");
        
        System.out.println("O id eh: " + p1.getId() + "\nO nome eh: " + p1.getNome() + "\no preco eh: " + p1.getPreco());
        
        System.out.println(" O raio eh : " + r1.getRaio() + "\nO material eh: " + r1.getMaterial() + "\nO peso eh: " + r1.getPeso());
    }
}
