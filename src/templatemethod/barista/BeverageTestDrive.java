package templatemethod.barista;

public class BeverageTestDrive {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println();

        System.out.println("Making coffee");
        coffee.prepareRecipe();

        System.out.println();

        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making tea...");
        teaWithHook.prepareRecipe();

        System.out.println();

        System.out.println("Making coffee");
        coffeeWithHook.prepareRecipe();
    }
}
