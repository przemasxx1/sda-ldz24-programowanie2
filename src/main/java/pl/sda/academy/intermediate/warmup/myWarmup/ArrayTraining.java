package pl.sda.academy.intermediate.warmup.myWarmup;

import java.time.LocalDate;

public class ArrayTraining {

    public static int getValue(int[] myArray) {

        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (i % 2 == 1) {
                sum += myArray[i];
                System.out.println(myArray[i]);

            }

        }
        System.out.println(sum);
        return sum;
    }

    public static void getBorderedValues(int[] myArray) {

        int maxValue = 0;
        int minValue = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] > maxValue) {
                maxValue = myArray[i];


            }
            if (myArray[i] < minValue) {
                minValue = myArray[i];


            }


        }
        String result = "Maksymalna wartośc to : " + maxValue + " " + "Minimalna wartość to: " + minValue;
        System.out.println(result);
    }


    public static void reverseArray(int[] myArray) {

        for (int i = myArray.length-1; i >= 0; i--) {

            System.out.println(myArray[i]);

        }

    }

    public static void fibonacciArray(int[] myArray) {

        int sum=0;

        for (int i = 2; i < myArray.length; i++) {

           // System.out.println(myArray[i-2]);
           // System.out.println(myArray[i-1]);
            //                            0,1,2,3,4,5,6,7,8
            //  int[] myArray = new int[]{1,2,3,4,5,6,7,8,9};

            //CIĄG FIBONACCIEGO !!!
            myArray[i] = myArray[i-2]+myArray[i-1];
            System.out.println(myArray[i]);



        }



    }
}



