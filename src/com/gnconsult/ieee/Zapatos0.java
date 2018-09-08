package com.gnconsult.ieee;

import java.util.*;


public class Zapatos0 {

    public static void main(String [] args) {
        int kMaxSize = 100;
        int [][]num_shoes = new int[kMaxSize + 1][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input test:");
        int n    = sc.nextInt();


        for (int i =0 ;i < n; i++) {
            int size = sc.nextInt();
            char type = (sc.next()).charAt(0);
            if (type == 'L') {
                type = 0;
            } else {
                type = 1;
            }
            num_shoes[size][(int)type] += 1;


        }
        int answer = 0;
        for (int size = 1; size <= kMaxSize; size += 1) {
            int minxSize = Math.min(num_shoes[size][0], num_shoes[size][1]);
            answer += minxSize;
            if (minxSize != 0)
            System.out.println( size+" min:"+minxSize);
        }


        System.out.println( answer);
    }


}
