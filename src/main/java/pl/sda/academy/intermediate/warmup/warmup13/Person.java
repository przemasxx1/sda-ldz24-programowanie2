package pl.sda.academy.intermediate.warmup.warmup13;

public class Person {

    String imie;
    String nazwisko;
    String miasto;
    int wiek;
    int pesel;

    public Person(String imie, String nazwisko, String miasto, int wiek, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wiek = wiek;
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getMiasto() {
        return miasto;
    }

    public int getWiek() {
        return wiek;
    }

    public int getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miasto='" + miasto + '\'' +
                ", wiek=" + wiek +
                ", pesel=" + pesel +
                '}';
    }
}
