package pl.sda.academy.intermediate.warmup.warmup9;

public class BackEndDeveloper extends Developer{
    String backendLanguage;


    public BackEndDeveloper(String name, String company, double salary, String backendLanguage) {
        super(name, company, salary);
        this.backendLanguage = backendLanguage;
    }


    @Override
    public void makeCode() {

        System.out.println("Piotr is coding for Ericsson for 0.5 PLN in Java "+backendLanguage+" "+name+" "+super.getCompany()+" "+super.getSalary());
    }
}
