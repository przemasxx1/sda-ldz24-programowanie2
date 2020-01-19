package pl.sda.academy.intermediate.warmup.warmup3;

public class ArrayTraining1 {

    public static void getValue() {

        int[] digitArray = {-2, 3, 1, 23,-9, 0, 12, 6, -4};

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;



        for (int i = 0; i < digitArray.length; i++) {

            if (digitArray[i] > maxValue) {


                maxValue = digitArray[i];
            }
            if (digitArray[i] < minValue) {

                minValue = digitArray[i];

            }


        }
        System.out.println(maxValue);

        System.out.println("-------------------");

        System.out.println(minValue);


    }
}
