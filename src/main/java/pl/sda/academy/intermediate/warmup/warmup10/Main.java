package pl.sda.academy.intermediate.warmup.warmup10;

import pl.sda.academy.intermediate.warmup.warmup8.Basic3Maps;

public class Main {
    public static void main(String[] args) {


        Vehicle motorbike = new Motorbike();
        motorbike.accelerate();



        Vehicle bicycle = new Bicycle();
        bicycle.accelerate();

        Vehicle rocket = new Rocket();
        rocket.accelerate();

        Basic6Polymorphism basic6Polymorphism = new Basic6Polymorphism();
        basic6Polymorphism.moveNTimesFast(motorbike,11);


       basic6Polymorphism.moveNTimesFast(bicycle,11);
        basic6Polymorphism.moveNTimesFast(rocket,11);
    }
}
