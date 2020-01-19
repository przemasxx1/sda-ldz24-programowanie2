package pl.sda.academy.intermediate.warmup.warmup8;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        String[] array = new String[]{"abc", "abc", "efghijk", "abc", "lmnopr",
                "st", "abc", "u", "vwxyz", "st", "lmnopr", "st", "u", "vwxyz"};


        Basic3Maps.DisplayMap(array);

        System.out.println("---------------");

        Basic3Maps.DisplayMap1(array);

        System.out.println("---------------");

        Basic3Maps.DisplayMapElements( Basic3Maps.DisplayMap1(array));

    }
}
