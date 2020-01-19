package pl.sda.academy.intermediate.warmup.warmup7;

import java.util.Objects;

public class Car {
    String marka;
    String model;
    String nrVin;


    public Car(String marka, String model, String nrVin) {
        this.marka = marka;
        this.model = model;
        this.nrVin = nrVin;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getNrVin() {
        return nrVin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(nrVin, car.nrVin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrVin);
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", nrVin='" + nrVin + '\'' +
                '}';
    }
}
