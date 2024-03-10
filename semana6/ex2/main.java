/*USE AS CLASS DO EX1 PRA RODAR ESSE TREM*/


package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Proprietario;

/**
 *
 * @author kfrural
 */
public class Mavenproject3 {
    
    public static void VerificaIguais(Proprietario p1, Proprietario p2){
         boolean iguais = true;
        for(int i = 0; i < 2; i++){
            if(p1.getCarros()[i].getFabricante().equalsIgnoreCase(p2.getCarros()[i].getFabricante())){
            iguais = false;
        }
        }
        if(iguais){
            System.out.println("Os dois tem carro igual\n\n");
        }else{
            System.out.println("Os carro sao diferente\n\n");
        }
    }

    public static void main(String[] args) {
        Proprietario p1 = new Proprietario();
        Proprietario p2 = new Proprietario();
        p1.fill();
        p2.fill();
        p1.imprimir();
        p2.imprimir();
        
       VerificaIguais(p1, p2);
    }
}
