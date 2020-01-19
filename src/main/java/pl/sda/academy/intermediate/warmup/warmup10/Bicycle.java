package pl.sda.academy.intermediate.warmup.warmup10;

public class Bicycle implements Vehicle {
    private static final int MAX_SPEED=50;
    private int speed = 0;

    public  Bicycle(){


    }

    @Override
    public void accelerate() {
        if (speed <= MAX_SPEED) {


            speed += 5;
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
