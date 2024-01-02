/*Faça um programa em java que leia do teclado um numero inteiro e efetue
a soma de todos os impares de 0 até este número. Lembre-se que para ler
uma informação do teclado é necessário usar a classe SCANNER.*/
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner ler =  new Scanner(System.in);
        int num1;
        int soma = 0;
        System.out.println("Escreve um numero ai: ");
        num1 = ler.nextInt();
        for(int i = 1; i <= num1; i+=2){
            soma += i;
        }
        System.out.println("sominha: " + soma);
    
    }  
}
