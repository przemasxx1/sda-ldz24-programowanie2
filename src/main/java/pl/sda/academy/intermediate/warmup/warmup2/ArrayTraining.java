package pl.sda.academy.intermediate.warmup.warmup2;

public class ArrayTraining {

    public static void giveUsLength(){

        String[] myArray = new String[]{"abc","cde","efghijk","lmnopr","st","u","vwxyz"};

        int wynik = 0;

        for (int i  = 0; i<myArray.length;i ++){


            wynik +=myArray[i].length();
        }
        System.out.println(wynik);




    }
}
