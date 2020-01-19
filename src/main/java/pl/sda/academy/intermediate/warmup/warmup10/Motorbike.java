package pl.sda.academy.intermediate.warmup.warmup10;

public class Motorbike implements Vehicle {

    private static final int MAX_SPEED = 300;
    private int speed = 0;

    public Motorbike() {


    }

    @Override
    public void accelerate() {

        if (speed <= MAX_SPEED) {


            speed += 30;
            System.out.println("Twoja aktualna prędkość to " + speed);

        }

        if (speed > MAX_SPEED) {

            System.out.println("Twoja aktualna prędkość została przekroczona " + speed);
        }


    }

   /* public int accelerateModified() {



        if (speed <= MAX_SPEED) {

            speed += 30;

            System.out.println("Twoja aktualna prędkość to " + speed);

        }

        if (speed > MAX_SPEED) {

            System.out.println("Twoja aktualna prędkość została przekroczona " + speed);
        }

    return speed;
    }*/

    @Override
    public int getSpeed() {
        return speed;
    }
}
