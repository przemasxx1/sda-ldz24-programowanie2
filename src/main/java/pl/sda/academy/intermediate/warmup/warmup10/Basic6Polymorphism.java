package pl.sda.academy.intermediate.warmup.warmup10;

public class Basic6Polymorphism {

   public int moveNTimesFast(Vehicle vehicle, int times){



int maxProperSpeed = vehicle.getSpeed()*times;
       System.out.println(maxProperSpeed);
       return maxProperSpeed;
   }

  /*  public int moveNTimesFastModified(Integer digit, int times){



        int maxProperSpeed = digit*times;
        System.out.println(maxProperSpeed);
        return maxProperSpeed;
    }*/
}
