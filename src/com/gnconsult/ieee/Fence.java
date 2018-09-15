package com.gnconsult.ieee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Fence {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Input test:");
        int n    = sc.nextInt();
        int k   = sc.nextInt();

        System.out.println(n +":"+k);
        List <Integer>lista = new <Integer>ArrayList();

        for (int i =0 ;i < n; i++) {
             lista.add(sc.nextInt());
         }

         int max = 0;
         for (int valor:lista){
             if (valor > max ) max = valor;

         }
        System.out.println("max:"+max);
        System.out.println("lista:"+lista);
        int resultado = 0;
        for (int i =max ;i > 0; i--) {
            int subtotal= 0;
            for (int valor:lista){
                subtotal += valor/ i;
            }
            if (subtotal >= k ) {
                resultado =i;
                break;
            }
            System.out.println(i+"subtotal:"+subtotal);
        }
        System.out.println("resultado:"+resultado);

    }


}
