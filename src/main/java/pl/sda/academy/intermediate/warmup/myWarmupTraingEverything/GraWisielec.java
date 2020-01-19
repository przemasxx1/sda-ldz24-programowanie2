package pl.sda.academy.intermediate.warmup.myWarmupTraingEverything;

    import java.util.Scanner;

public class GraWisielec {



    /**
     * Created by sm on 2015-12-02.
     */

        public static void main(String[] args) {

            String word = "test";
            Scanner scaner = new Scanner(System.in);



            char[] userLetters = new char[word.length()];
            for(int i = 0; i < word.length(); i++){
                userLetters[i] = '_';
            }

            int playerLifes = 9;
            boolean isRunning = true;
            while (isRunning){

                String userChoice = scaner.nextLine();
                // sprawdź poprawność
                char letter = userChoice.charAt(0);

                //sprawdza czy odjąć życie..
                boolean containsLetter = false;

                //
                for(int i = 0; i < word.length(); i++ ){
                    if(letter == word.charAt(i)){
                        userLetters[i] = letter;
                        containsLetter = true;
                    }
                }
                if(containsLetter == false){
                    playerLifes--;
                    System.out.println("Pozostało Ci " + playerLifes + " żyć!");
                }
                if(playerLifes == 0){
                    isRunning = false;
                    System.out.println("Nie masz więcej żyć!");
                }

            }


        }
    }

