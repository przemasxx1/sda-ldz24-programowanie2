package pl.sda.academy.intermediate.warmup.myWarmupTraingEverything;

import java.util.Arrays;

public class MyTraining {

    public static void displayElementsOfArray(){

        ClassForInstanceTraining[] array = new ClassForInstanceTraining[10];




        for(int i = 0;i<array.length;i++){

array[i] = new ClassForInstanceTraining("Przemek","Małecki",10);
            //System.out.println(array[i]);

        }

        for (int j = 0;j<array.length;j++){


         //   array[j]
        }



        array[0].setImie("Ania");
        array[0].setNazwisko("Małecka");
        array[0].setWiek(110);

    }
    public static void DisplayThisExample(){

        String[]  imiona = {"Ania","Basia","Kasia","Agnieszka","Zosia","Ewa"};
        Arrays.sort(imiona);

        for(String s:imiona){

            System.out.println(s);

        }


    }











}
