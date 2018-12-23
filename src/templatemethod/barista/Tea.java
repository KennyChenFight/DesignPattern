package templatemethod.barista;

public class Tea extends CaffeineBeverage {

    public Tea() {

    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
