package com.vitor.att1e2semana4;

import java.util.HashMap;


/**
 *
 * @author kfrural
 */
public class Att1e2semana4 {

    public static void main(String[] args) {
        String texto  = "aooow bao";
        HashMap<Character, Integer>  contador = new HashMap<>();
        
        for(char text: texto.toCharArray()){
            contador.put(text, contador.getOrDefault(text,0) +1);
        }
        
        System.out.println("cntador: " + contador);
    }
}
