import java.util.Scanner;

public class Maior{
    public static void main (String[] args){
        Scanner ler =  new Scanner(System.in);
        int num1;
        System.out.println("Escreve um numero ai: ");
        num1 = ler.nextInt();
        int num2;
        System.out.println("escreve outro: ");
        num2 = ler.nextInt();
        if(num1 < num2)
            System.out.println("o maior eh: "+ num2);
        else
            System.out.println("O maior eh: "+ num1);
        
    }
}
