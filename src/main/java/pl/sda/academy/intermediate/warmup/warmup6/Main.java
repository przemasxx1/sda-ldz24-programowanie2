package pl.sda.academy.intermediate.warmup.warmup6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> listaPerson = new ArrayList<>();
        listaPerson.add(new Person("Lala", "kkk", "ddd", 29, 6));
        listaPerson.add(new Person("Lala1", "kdd", "ddd", 18, 667981304));
        listaPerson.add(new Person("Lala2", "ddd", "ddd", 289, 8));
        listaPerson.add(new Person("Lala3", "zdc", "ddd", 16, 9));
        listaPerson.add(new Person("Lala4", "yui", "rtu", 299, 11));


        Main.displayAllPersons(listaPerson);

        System.out.println("------------");
        Main main = new Main();

        Iterator<Person> iterator = listaPerson.iterator();
        main.personsOlderThanTwenty(listaPerson);

        main.phoneNumberDivideByTwo(listaPerson);

        main.sumOfAllBirtdayDates(listaPerson);

        List<Person> duplicatingList = new LinkedList<>(listaPerson);

        //   System.out.println(listaPerson);

        System.out.println("-----------------");


        main.deleteMiddlePlacePerson(listaPerson);

        main.twoListsGetAge(listaPerson, duplicatingList);

        main.twoListsLength(listaPerson,duplicatingList);


    }

    public static void displayAllPersons(List<Person> persons) {


        // System.out.println(persons);
    }

    public void personsOlderThanTwenty(List<Person> people) {


        for (int i = 0; i < people.size(); i++) {

            if (people.get(i).getAge() > 20) {


                //    System.out.println(people.get(i).getAge());
            }
        }

    }

    public void phoneNumberDivideByTwo(List<Person> people) {


        for (int i = 0; i < people.size(); i++) {

            if (people.get(i).getPhone() % 2 == 0) {


                //   System.out.println(people.get(i).getPhone());
            }
        }
    }

    public void sumOfAllBirtdayDates(List<Person> people) {

        int sum = 0;
        for (int i = 0; i < people.size(); i++) {

            if (people.get(i).getAge() != 0) {

                sum += people.get(i).getAge();

            }
        }
        // System.out.println(sum);
    }

    public void deleteMiddlePlacePerson(List<Person> people) {

        int sum = 0;


        if (people.size() > 0) {

            sum = (people.size() / 2) + 1;

            people.remove(sum);
            System.out.println(people);

        }
    }

    public void twoListsGetAge(List<Person> people, List<Person> people1) {

        int sum = 0;
        for (int i = 0; i < people.size(); i++) {

            if (people.get(i).getAge() != 0) {

                sum += people.get(i).getAge();

            }
        }
        System.out.println("Suma wiek dla 1 lista " + sum);


        int sum1 = 0;
        for (int i = 0; i < people1.size(); i++) {

            if (people1.size() > 0) {

                sum1 += people1.get(i).getAge();

            }
        }
        System.out.println("Suma wiek dla lista duplikowana " + sum1);
    }

    public void twoListsLength(List<Person> people, List<Person> people1) {

        System.out.println(people.size());
        System.out.println(people1.size());


    }


}








