package com.gnconsult.ieee;

import java.util.*;


public class Zapatos4 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Input test:");
        short n    = sc.nextShort();
        short [][]valores = new short[2][100];
        //Set <Integer>tamanos = new  LinkedHashSet<Integer>(n);

        for (int i =0 ;i < n; i++) {
            int tamano = sc.nextInt();
            String lado = sc.next();
          // System.out.printf("tamano [%d]   lado: [%s] \n", tamano, lado);
          //  tamanos.add(tamano);
            if (lado.equalsIgnoreCase("L")){
                 valores[0][tamano-1] += 1;
            } else{
                valores[1][tamano-1] += 1;
            }
        }
        int total  =0;
        for (int i =0 ;i < 100; i++) {
           // System.out.printf("Tmanńo: %d L:%d  R:%d \n", tamano,valores[0][tamano], valores[1][tamano]);
            total+= Math.min(valores[0][i], valores[1][i]);
        }


       System.out.println(total);
    }


}
