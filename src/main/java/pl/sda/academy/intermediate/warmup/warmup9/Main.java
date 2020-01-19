package pl.sda.academy.intermediate.warmup.warmup9;

public class Main {
    public static void main(String[] args) {


      /*  Developer developer = new Developer() {
            @Override
            public void makeCode() {

            }
        }*/



        Developer backEndDeveloper = new BackEndDeveloper("Imie","lala",200,"ssss");
        backEndDeveloper.makeCode();

        Developer frontEndDeveloper = new FrontEndDeveloper();
        frontEndDeveloper.makeCode();
        Developer mobileDeveloper = new MobileDeveloper();
        mobileDeveloper.makeCode();


    }
}
