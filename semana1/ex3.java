/******************************************************************************

                           Faça um programa que receba como entrada o nome de
                           dois alunos e verifique se eles tem o mesmo nome. 
                           Caso na tenham o mesmo nome informe qual dos dois 
                           tem maior número de caracteres. Dica: use os métodos
                           da classe string
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Nome 1:");
		String nome1 = ler.nextLine();
		System.out.println("Nome 2:");
		String nome2 = ler.nextLine();
		
		if(!nome1.equalsIgnoreCase(nome2)){
		    if(nome1.length() > nome2.length()){
		        System.out.println(" O " + nome1 + " Tem mais letras");
		    }else{
		        System.out.println("O " + nome2 + " tem mais letras");
		    }
		}else{
		    System.out.println("Os alunos tem o mesmo nome");
		}
	
	    ler.close();
	}
}
