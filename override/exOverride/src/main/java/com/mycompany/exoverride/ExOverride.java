package com.mycompany.exoverride;

import classes.Diretor;
import classes.Engenheiro;
import classes.Gerente;
import classes.Secretario;

/**
 *
 * @author kfrural
 */
public class ExOverride {

    public static void main(String[] args) {
        Engenheiro eng = new Engenheiro("civil","Luis", "01",13238,true);
        Diretor diretor = new Diretor("peao",0.2, "Filipe", "02", 12323, true);
        Gerente gerente = new Gerente(13, "julio", "03", 15432, true);
        Secretario secretario = new Secretario("ingles", "ze", "04", 1543, true);
        
        eng.infoDetalhada();
        System.out.println("Eng recebe aumento pra: " + eng.aumentoSalario());
        diretor.infoDetalhada();
        gerente.infoDetalhada();
        System.out.println("Gerente recebe aumento pra: " + gerente.aumentoSalario());
        secretario.infoDetalhada();
        System.out.println(secretario.agenda());
    }
}
