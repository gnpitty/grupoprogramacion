package com.gnconsult.ieee;

import com.gnconsult.jj8.Item;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.function.Function;


public class Zapatos3 {

   public static void main(String[] args) {
        System.out.println("Input test:");
        Zapatos3 zap = new Zapatos3();
        zap.processa();
    }

    public void processa() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Zapato> zapatosList = new ArrayList();
        Set<Integer> tamanos = new LinkedHashSet(n);
        for (int i = 0; i < n; i++) {

            int tamano = sc.nextInt();
            String lado = sc.next();
            Zapato mizapato = new Zapato(tamano, lado.charAt(0));
            zapatosList.add(mizapato);

        }
      //  System.out.println(zapatosList);

        Map<Integer, List<Character>> result =
                zapatosList.stream().collect(
                        Collectors.groupingBy(Zapato::getTamano,
                                Collectors.mapping(Zapato::getLado, Collectors.toList())
                        )
                );

        System.out.print (result);
        for (Integer key : result.keySet()) {
            System.out.print (key + " :" + result.get(key));
            List<Character> chLista = result.get(key);
            Map<Character, Long> counts =  chLista.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
            if (counts.containsKey('R') && counts.containsKey('L')) {
                  System.out.print(" :MIN:"+Math.min(counts.get('R'), counts.get('L')));
            }
            System.out.println("");
        }
   }
}
