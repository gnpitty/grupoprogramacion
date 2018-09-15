package com.gnconsult.ieee;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Zapatos2 {
  // Grupo de Programacion 2018
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Input test:");
        int n    = sc.nextInt();
        Map<String,Integer> map1 = new HashMap<String,Integer>();
        Set <Integer>tamanos = new  LinkedHashSet<Integer>(n);

        for (int i =0 ;i < n; i++) {
            int tamano = sc.nextInt();
            String lado = sc.next();
           //5 System.out.printf("tamano %d   lado: %s \n", tamano, lado);
            String idx = tamano +":"+lado;


            if (map1.containsKey(idx)){
                int valor = map1.get(idx) +1;
                map1.put(idx, valor);
            } else{
                map1.put(idx, 1);
            }
        }


      int total  = totalPares(map1,tamanos);
        System.out.println(total);
    }

    static int totalPares(Map<String,Integer> map1 , Set<Integer> tamanos){
      //  System.out.println(tamanos);
     //   System.out.println(map1);
        int total = 0;
        for (int tamano : tamanos){
            if (map1.containsKey(tamano+":L") && map1.containsKey(tamano+":R")) {
               // //System.out.println(tamano + "==>Min " + Math.min(map1.get(tamano + ":L"), map1.get(tamano + ":R")));
                total += Math.min(map1.get(tamano + ":L"), map1.get(tamano + ":R"));
            }
        }
        return total;
    }
}
