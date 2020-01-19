package pl.sda.academy.intermediate.warmup.warmup10;

public class Rocket implements  Vehicle{

    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private int speed = 0;

    public  Rocket(){


    }

    @Override
    public void accelerate() {
        if (speed <= MAX_SPEED) {


            speed += 1000;
            System.out.println("Twoja aktualna prędkość to " + speed);

        }

        if (speed > MAX_SPEED) {

            System.out.println("Twoja aktualna prędkość została przekroczona " + speed);
        }


    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
