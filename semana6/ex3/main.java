package com.mycompany.mavenproject1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kfrural
 */


public class Mavenproject1 {

    public static void main(String[] args) {
         HashMap<Integer, String> map = new HashMap<>();
         map.put(1, "a");
         map.put(2, "e");
         map.put(3, "i");
         
         HashMap<String, Integer> mapaContrario = new HashMap<>();
         
         for(Map.Entry<Integer, String> entrada : map.entrySet()){
             mapaContrario.put(entrada.getValue(),entrada.getKey());
         }
         
         System.out.println("Valores: " + mapaContrario);
    }
}
