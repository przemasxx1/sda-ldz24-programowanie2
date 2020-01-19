package pl.sda.academy.intermediate.warmup.warmup8;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Basic3Maps {

    public static void DisplayMap(String[] array) {

        Map<String, Integer> map = new HashMap<>();

        Integer licznik = 1;

        for (int i = 0; i < array.length; i++) {

            //
            if (!map.containsKey(array[i])) {


                map.put(array[i], licznik);
            } else {

                map.put(array[i], map.get(array[i]) + 1);//put działa także jak replace, czyli nadpisuje już to co jest.
            }
            System.out.println(map.toString());


        }
        //   System.out.println(map.toString());

    }

    public static Map<String, Integer> DisplayMap1(String[] array) {

        Map<String, Integer> map = new LinkedHashMap<>();

        Integer licznik = 1;
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {


                map.put(array[i], licznik);
            } else {

                map.put(array[i], map.get(array[i]) + 1);//put działa także jak replace, czyli nadpisuje już to co jest.
            }
            //  System.out.println(map.toString());
        }
        return map;
    }

    public static void DisplayMapElements(Map<String, Integer> map) {

        Set<Map.Entry<String, Integer>> s = map.entrySet();

        for (Map.Entry<String, Integer> it : s) {

            //System.out.println("Klucz to " + it.getKey()+" Wartość to "+it.getValue()+" ");

            //  System.out.printf("Klucz to '%s', a wartość to '%s'\n",it.getKey(),it.getValue());

        }

    }
}
