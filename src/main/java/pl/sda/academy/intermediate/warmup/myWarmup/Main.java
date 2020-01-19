package pl.sda.academy.intermediate.warmup.myWarmup;

public class Main {
    public static void main(String[] args) {

        int[] myArray = new int[]{1,2,3,4,5,6,7,8,9};

       // ArrayTraining.getValue(myArray);

      /*  System.out.println("-----------------------");
        ArrayTraining.getBorderedValues(myArray);
        System.out.println("-----------------");
        ArrayTraining.reverseArray(myArray);
        System.out.println("-----------------");
        ArrayTraining.fibonacciArray(myArray);*/



        for(int i =0;i<myArray.length;i=i+4){//skok co 4 pozycja w tablicy


            System.out.println("Numer indeksu "+ i +" wartość w tablicy " + myArray[i]);
        }



    }
}
