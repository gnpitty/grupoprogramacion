package com.gnconsult.ieee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Fence2 {

    public static void main(String [] args) {
        long t1 = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);

        int   n    = sc.nextInt();
        long  k   = sc.nextLong();
        int []lis1 = new int[n];


        for (int i =0 ;i < n; i++) {
            lis1[i] = sc.nextInt();
          //  if ( lis1[i] > max ) max =  lis1[i];
        }

        int limSup =  (int) Math.pow(10, 9);;
        int limInf = 1;

        while (limInf <= limSup) {
            int mid = (limInf +limSup+1)/2;
            long subtotal= 0;
            for (int j =0 ;j < n; j++) {
                subtotal +=  lis1[j]/ mid;
            }
            if (subtotal < k ) {
                limSup =  mid-1 ;
            }else {
                limInf = mid+1;
            }

        }

        System.out.println( limSup);
    }


}
