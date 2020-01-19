package pl.sda.academy.intermediate.warmup.warmup4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Integer[] tablica = DisplayArray.initXYZArray();


        for (int i = 0; i < tablica.length; i++) {


            tablica[i] = i;

            //   System.out.println(tablica[i]);

        }


      //  System.out.println(tablica[0]);
      // System.out.println(tablica[1]);
        Integer[] tablica1 = DisplayArray.initXYZArray();

        //Ciąg Fibonacciego !!!
        for (int i = 2; i < tablica.length; i++) {

            tablica[i] = tablica[i-2]+tablica[i-1];
            System.out.println(tablica[i]);
        }


        Integer[] tablica2 = DisplayArray.initXYZArray();
        Random random = new Random();

        for(int i =0;i<tablica2.length;i++){


            tablica1[i] = random.nextInt(31);
         //   System.out.println(tablica1[i]);

        }


DisplayArray.DisplayArray(tablica);

        DisplayArray.DisplayArray1(tablica1);

    }
}
