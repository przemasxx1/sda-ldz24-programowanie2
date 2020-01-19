package pl.sda.academy.intermediate.warmup.warmup9;

public class FrontEndDeveloper extends Developer{
    String javaScriptFramework;

    public FrontEndDeveloper(String name, String company, double salary, String javaScriptFramework) {
        super(name, company, salary);
        this.javaScriptFramework = javaScriptFramework;
    }
    public FrontEndDeveloper(){


    }

    @Override
    public void makeCode() {

        System.out.println("Adam is coding for SDA for 999.99 in Angular");

    }
}
