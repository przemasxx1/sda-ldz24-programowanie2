package pl.sda.academy.intermediate.warmup.warmup9;

public class MobileDeveloper extends  Developer{
    String mobileOs;

    public MobileDeveloper(String name, String company, double salary, String mobileOs) {
        super(name, company, salary);
        this.mobileOs = mobileOs;
    }
    public MobileDeveloper(){


    }

    @Override
    public void makeCode() {

        System.out.println("Ania is coding for Google for 100000.0 in Android");

    }
}
