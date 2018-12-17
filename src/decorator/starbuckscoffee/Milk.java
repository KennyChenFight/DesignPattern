package decorator.starbuckscoffee;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
