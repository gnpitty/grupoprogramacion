package com.gnconsult.ieee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Permutacion {
    // WORD PERMUTATION

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input test:");
        //int n = sc.nextInt()+1;
        List <String>lista   = new ArrayList();
        List <String>lista2  = new ArrayList();
        lista.add("Universo");
        lista.add("Lion");
        lista.add("Tiger");
        lista.add("Cat");
        lista.add("Dog");
        lista.add("Juan");
        /*
        while (sc.hasNextLine() &&  n>0) {
            String linea = sc.nextLine();
            lista.add(linea);
            n--;
        }
        lista.remove(0);
        */
        lista2.addAll(lista);
        Collections.sort(lista2);
        System.out.println("lista:"+lista);
        System.out.println("lista2:"+lista2);
        for(String valor: lista2) {
           int idx=  lista.indexOf(valor)+1;
            System.out.println("idx:"+idx);
        }
    }
}
