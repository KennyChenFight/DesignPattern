package templatemethod.barista;

public class Coffee extends CaffeineBeverage {

    public Coffee() {

    }

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
