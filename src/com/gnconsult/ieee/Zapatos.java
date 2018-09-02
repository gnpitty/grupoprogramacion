package com.gnconsult.ieee;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Zapatos {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing the file passed in:");
        String  sn = sc.nextLine();
        int n = Integer.parseInt(sn);

        System.out.println(" n:"+n);
        Map <String,Integer>map1 = new HashMap<String,Integer>();
        Map <String,Integer>tkeys = new HashMap<String,Integer>();
        while(n > 0 && sc.hasNextLine()    ){
            String s1 =sc.nextLine();
            System.err.println("S1:" + s1+" N:"+n);

            if (! s1.trim().equals("")) {
                String tamano = s1.substring(0, 1);
                String lado   = s1.substring(2);
                System.out.println(" Tamano:" + tamano + "  Lado:" + lado);
                String idx = tamano +":"+lado;
                tkeys.put(tamano,1);

                if (map1.containsKey(idx)){
                    int valor = map1.get(idx) +1;
                    map1.put(idx, valor);
                } else{
                    map1.put(idx, 1);
                }
            }
            n--;
        }
        System.out.println(tkeys.keySet());
        System.out.println(map1);

      for (String tamano : tkeys.keySet()){
          if (map1.containsKey(tamano+":L") && map1.containsKey(tamano+":R"))
            System.out.println(tamano+"==>Min "+Math.min(map1.get(tamano+":L"),map1.get(tamano+":R"))) ;
        }
    }

}
