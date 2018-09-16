package com.gnconsult.ieee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Fence {

    public static void main(String [] args) {
        long t1 = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
       // System.out.println("Input test:");
        int n    = sc.nextInt();
        int k   = sc.nextInt();

       System.out.println("n:"+n +"    k:"+k);


        List <Integer>lista = new <Integer>ArrayList();
        int max = 0;
        int j =0;
        int m=0;
       try {
          /* for (int i = 0; i < n; i++) {
               int valor = sc.nextInt();
               lista.add(valor);
               if (valor > max) max = valor;
               j = i;
           }*/

          while(sc.hasNext()){
              int valor = sc.nextInt();
              lista.add(valor);
              if (valor > max) max = valor;

              m++;
          }
       }catch (Exception e){
           System.out.println(e);
           System.out.println("max:"+max+"  :"+m);

       }

         System.out.println("max:"+max+"   m:"+m);
        //System.out.println("lista:"+lista);
        if(true)return;

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
           // System.out.println(i+"subtotal:"+subtotal);
        }
        /*
        System.out.println("resultado:"+resultado);

        Runtime runtime = Runtime.getRuntime();
        System.out.println("max memory: " + runtime.maxMemory() / 1024);

       // 2)to get how much memory that JVM has allocated for your application
        System.out.println("allocated memory: " + runtime.totalMemory() / 1024);

        //3)to get how much memory is being used by your application
        System.out.println("free memory: " + runtime.freeMemory() / 1024);
        System.out.println("Time:"+(System.currentTimeMillis()-t1));
        */
        System.out.println( resultado);
    }


}
