package pl.sda.academy.intermediate.warmup.warmup9;

public abstract class Developer {
    protected String name;
    protected String company;
    protected double salary;

    public Developer(String name, String company, double salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public Developer() {

    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void makeCode();
}
