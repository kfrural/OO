import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner ler =  new Scanner(System.in);
        double num1;
        System.out.println("Escreve um numero ai: ");
        num1 = ler.nextDouble();
        double num2;
        System.out.println("escreve outro: ");
        num2 = ler.nextDouble();
        if(num1 < num2)
            System.out.println("o maior eh: "+ num2);
        else
            System.out.println("O maior eh: "+ num1);
        
    }
}
