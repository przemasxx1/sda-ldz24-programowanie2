package pl.sda.academy.intermediate.warmup.warmup12;

import java.util.Arrays;
import java.util.Scanner;

public class Basic7UserInput {


    public static void makeAnswer() {
        System.out.println();

        String password = "kosa";
        String passwordVerificating = "";
        String QuessedPassword = "";

        String[] passwordArray = password.split("");

        String[] compareWordToPassword = new String[passwordArray.length];

        //Wprowadzam wartości do tablicy tu gwiazdki

        for (int j = 0; j < compareWordToPassword.length; j++) {

            compareWordToPassword[j] = "*";
        }
        //Powyższą pętle mozna zastąpić
        // Arrays.fill(compareWordToPassword, "*");

        int numberOfLives = 2;

        Scanner scanner = new Scanner(System.in);


        System.out.println("---------WITAMY W GRZE WISIELEC----------");

        for (; ; ) {

            System.out.println("");
            System.out.println("Podaj swoją literę lub całe hasło !!!");
            System.out.println("");

            String word = scanner.next();


            //zgadywanie samych liter do hasła
            for (int i = 0; i < passwordArray.length; i++) {

                if (passwordArray[i].equals(word)) {


              /*  System.out.println("Brawo ta litera występuje w haśle, czyli " + word);


                if(password.lastIndexOf(word,password.length()-2)!=-1){

                    System.out.println(password.lastIndexOf(word,password.length()-2)!=-1);

                    System.out.print(", ale już udało Ci się zgadnąć tę literę wcześniej.");
*/

                    compareWordToPassword[i] = word;


                    //  System.out.println(compareWordToPassword[i] + " " + i);


                }
                System.out.print(compareWordToPassword[i]);



            }

            String passwordFinal = Arrays.toString(compareWordToPassword);

           System.out.println(passwordFinal);




            System.out.println();


            if (passwordFinal.equals(word) || password.equals(word)) {

                System.out.println("Gratuluje, odgadłeś hasło, które brzmi " + password);

                System.out.println("");

                System.out.println("Czy chesz zagrać jeszcze raz ?");
                System.out.println("Jeśli tak napisz słowo tak, a jeśli nie napisz słowo nie");
                String answer = scanner.next();
                if (answer.equals("tak")) {
                    makeAnswer();
                } else if (answer.equals("nie")) {

                    System.out.println("Do zobaczenia :)");
                    System.exit(0);

                } else {

                    System.out.println("Graczu, źle wpisałeś");
                    System.exit(0);
                }


            } else if ((!password.contains(word)) || word.length() > 1) {

                System.out.println("Nie trafiłeś i tracisz życie");
                if (numberOfLives > 1) {

                    System.out.println("Twoja obecna liczba żyć to " + (numberOfLives - 1));
                }

                numberOfLives--;
                if (numberOfLives == 0) {

                    System.out.println("Twoja liczba żyć to " + numberOfLives);
                    System.out.println("Przegrałeś. Zapraszam Cię do gry ponownie");


                    System.out.println("");
                    System.out.println("Czy chesz zagrać jeszcze raz ?");
                    System.out.println("Jeśli tak napisz słowo tak, a jeśli nie napisz słowo nie");
                    String answer = scanner.next();
                    if (answer.equals("tak")) {
                        makeAnswer();
                    } else if (answer.equals("nie")) {

                        System.out.println("Do zobaczenia :)");
                        System.exit(0);

                    } else {

                        System.out.println("Graczu, źle wpisałeś");
                        System.exit(0);
                    }


                }
            }

        }

    }
}










