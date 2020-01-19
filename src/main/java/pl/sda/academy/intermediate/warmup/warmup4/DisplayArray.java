package pl.sda.academy.intermediate.warmup.warmup4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DisplayArray {

    public static Integer[] initXYZArray(){

     Integer[] tablica = new Integer[10];
        return tablica;
    }

    public static void DisplayArray(Integer[] tablica){



        List<Integer> listaTablicowa = Arrays.asList(tablica);
        Collections.reverse(listaTablicowa);
        System.out.println(listaTablicowa);


    }

    public static void DisplayArray1(Integer[] tablica){

        for(int i = 0; i<tablica.length;i++){

            if(tablica[i]%3==0&&tablica[i]!=0){


                System.out.print(tablica[i]+" ");
            }

        }



    }



}
