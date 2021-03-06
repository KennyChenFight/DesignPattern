package singleton.chocolate;

public class ChocolateBuilder {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBuilder uniqueInstance;

    private ChocolateBuilder() {
        empty = true;
        empty = false;
    }

    public static ChocolateBuilder getInstance() {
        if (uniqueInstance == null)  {
            System.out.println("Creating unique instance of Chocolate Builder");
            uniqueInstance = new ChocolateBuilder();
        }
        System.out.println("Returning instance of Chocolate Builder");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
