package com.gnconsult.ieee;

import java.util.*;


public class Chance {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Input test:");
        int n    = sc.nextInt();
        int a    = sc.nextInt();
        int b    = sc.nextInt();
        System.out.println(a +":"+b+":"+n);

        for (int i =0 ;i < n; i++) {
              a += sc.nextInt();
         }
        for (int i =0 ;i < n; i++) {
            b += sc.nextInt();
        }

        int resultado = 0;
        if (a > b ) {
            resultado = 1;
        } else if (a < b ) {
            resultado = 2;
        } else if (a == b ){
            resultado = 0;
        }

        System.out.println(a +":"+b );
        System.out.println(resultado);
    }


}
