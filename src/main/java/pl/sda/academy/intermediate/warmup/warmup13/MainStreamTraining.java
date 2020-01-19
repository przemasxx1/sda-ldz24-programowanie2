package pl.sda.academy.intermediate.warmup.warmup13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainStreamTraining {


    public static void main(String[] args) {

        Stream<String> namesStream = Stream.of("John", "Marry", "George", "Paul", "Alice", "Ann");
        Stream<String> namesStream1 = Stream.of("John", "Marry", "George", "Paul", "Alice", "Ann");

        namesStream
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        System.out.println("========================");

        namesStream1
                .filter(e -> e.startsWith("P"))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);

        List<String> namesList = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");
        System.out.println("--------------------------------------------");
        namesList
                .stream()
                .filter(e -> e.startsWith("M"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------------------------------------");

        List<String> namesList2 = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");

        namesList
                .stream()
                .filter(name -> {
                    System.out.println("Filtering name: " + name);
                    return true;
                })
                .forEach(name -> System.out.println("Now name is printed: " + name));
// operacja terminująca forEach dodana, wykonane obie operacje (filter i forEach) - wypisane 2 linie dla każdego imienia

        System.out.println("===============================");

        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Person> allPersons = Arrays.asList(person1, person2, person3);
        allPersons.stream()
                .filter(person -> person.getWiek() >= 18)
                .forEach(person -> System.out.println("Person: " + person.getImie() + " is adult."));
        System.out.println("===============================");

        Person person4 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person5 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person6 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Person> allPersons1 = Arrays.asList(person4, person5, person6);
        allPersons
                .stream()
                .filter(person -> person.getWiek() >= 18)

                // do tej pory mamy strumień elementów typu Person
                .map(person -> person.getNazwisko()) // albo z wykorzystaniem referencji do metody: Person::getName
                // teraz mamy strumień typu String!

                .forEach(name -> System.out.println("Person: " + name + " is adult."));

        System.out.println("==============================================");

        Person person7 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person8 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person9 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Person> allPersons2 = Arrays.asList(person7, person8, person9);
        allPersons
                .stream()
                .skip(1)
                .forEach(person -> System.out.println("Hello, " + person.getWiek()));

        List<Person> allPersons3 = Arrays.asList(person7, person8, person9);
        allPersons
                .stream()
                .limit(2)
                .forEach(person -> System.out.println("Hello, " + person.getImie()));

        System.out.println("==============================================");



    }
}