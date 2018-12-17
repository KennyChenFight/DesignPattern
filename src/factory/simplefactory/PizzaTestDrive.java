package factory.simplefactory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("We order a " + pizza.getName() + "\n");

        pizza = pizzaStore.orderPizza("clam");
        System.out.println("We order a " + pizza.getName() + "\n");

        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println("We order a " + pizza.getName() + "\n");

        pizza = pizzaStore.orderPizza("veggie");
        System.out.println("We order a " + pizza.getName() + "\n");
    }
}
