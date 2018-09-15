package com.gnconsult.ieee;

import java.util.*;

public class Crypto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Input test:");
        int n = sc.nextInt();
        Map<String, Double> map1 = new HashMap<String, Double>();
        Set<Integer> tamanos = new LinkedHashSet<Integer>(n);
        double angulo2 = 0.0;
        for (int i = 0; i < 26; i++) {
            String char2 = sc.next();
            String value = sc.next();
            double angulo = Double.parseDouble(value);

            map1.put(char2, angulo);


        }
        String str1 = sc.nextLine();
        System.out.println("Input map1:" + map1);

        System.out.println("Input str1:" + str1);
        str1 = str1.toUpperCase().trim();
        System.out.println("Input str1:" + str1);
    }
}
