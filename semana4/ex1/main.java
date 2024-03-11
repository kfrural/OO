package com.vitor.att1e2semana4;

import java.util.HashMap;


/**
 *
 * @author kfrural
 */
public class Att1e2semana4 {

    public static void main(String[] args) {
        String [] frutas  = {"maça", "banana", "cereja", "maça", "banana", "maça"};
        HashMap<String, Integer>  contador = new HashMap<>();
        
        for(String fruta: frutas){
            contador.put(fruta, contador.getOrDefault(fruta,0) +1);
        }
        
        System.out.println("cntador: " + contador);
    }
}
