package singleton.chocolate;

public class ChocolateController {

    public static void main(String[] args) {
        ChocolateBuilder chocolateBuilder = ChocolateBuilder.getInstance();
        chocolateBuilder.fill();
        chocolateBuilder.boil();
        chocolateBuilder.drain();

        // will return the existing instance
        ChocolateBuilder chocolateBuilder1 = ChocolateBuilder.getInstance();
    }
}
