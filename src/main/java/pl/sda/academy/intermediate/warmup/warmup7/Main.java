package pl.sda.academy.intermediate.warmup.warmup7;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Volksagen","Golf","1WVBH7A33DC118088");
        Car car2 = new Car("Volksagen1","Golf1","1WVBH7A33DC118080");
        Car car3 = new Car("Volksagen2","Golf2","1WVBH7A33DC118089");
        Car car4 = new Car("Volksagen3","Golf3","1WVBH7A33DC118077");
        Car car5 = new Car("Volksagen4","Golf4","1WVBH7A33DC118067");
        Car car6 = new Car("Volksagen5","Golf5","1WVBH7A33DC1180899");

        Set<Car> setOfCars = new HashSet<>();
        setOfCars.add(car1);
        setOfCars.add(car2);
        setOfCars.add(car3);
        setOfCars.add(car4);
        setOfCars.add(car5);
        setOfCars.add(car6);
        System.out.println(setOfCars.size());

        Iterator<Car> iterator = setOfCars.iterator();

//niezgodna kolejność wyświetlania z kolejnością dodawania !!!
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

        System.out.println("----------------");

        Set<Car> setOfCars1 = new LinkedHashSet<>();
        setOfCars1.add(car1);
        setOfCars1.add(car2);
        setOfCars1.add(car3);
        setOfCars1.add(car4);
        setOfCars1.add(car5);
        setOfCars1.add(car6);
        System.out.println(setOfCars.size());

        //właściwa kolejność wyświetlania elementów !!!
        for (Car car : setOfCars1) {

            System.out.println(car);
        }
    }
}
