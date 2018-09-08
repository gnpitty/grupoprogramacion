package pa.edu.up.ieee;


import java.util.Date;
import java.util.HashMap;
import java.util.*;


public class Prueba {

    public static void main(String[] args) {
        int n = 6;
        long nn = 10102929;

        double d1 = 1.22;
        float f1 = 1.291891829f;

        boolean b1 = true;

        char a1 = 'A';

        int[] nums = {10, 22, 33, 54, 95};
        int[] nums2 = new int[100];

        String nombre = "juan Perez";
        if (nombre.equals("juan Perez")) {
            System.out.println("Iguales");
        }
        System.out.println("Hola Mundo!! " + nums + " " + new Date());
        for (int i = 0; i < nums.length; i++) {
            System.out.println(">> " + i + ":" + nums[i]);

        }


        // Ejemplo de Lista
        List lista1 = new ArrayList();
        lista1.add("L");
        lista1.add("R");
        lista1.add("R");
        lista1.add("L");
        lista1.add("Z");
        System.out.println(lista1);
        System.out.println(lista1.get(2));

// Ejemplo de Mapa
        Map<String,String> mapa1 = new <String,String> HashMap();
        mapa1.put("nombre", "Juan");
        mapa1.put("apellido", "Martinez");
        mapa1.put("telefono", "298-3009");
        mapa1.put("cell", "6687-2093");
        System.out.println(mapa1);
        String nombre1 = mapa1.get("nombre");
        for(String key: mapa1.keySet()){
            System.out.println(key+":"+mapa1.get(key));
        }

        // Ejemplo de Set
        Set<String> tamanos = new LinkedHashSet(5);
        tamanos.add("L");
        tamanos.add("R");
        tamanos.add("R");
        tamanos.add("L");
        tamanos.add("Z");
        System.out.println(tamanos);


    }

}
