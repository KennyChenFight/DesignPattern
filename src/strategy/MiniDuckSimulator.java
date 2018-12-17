package strategy;

import strategy.behavior.fly.FlyRocketPowered;
import strategy.model.Duck;
import strategy.model.MallardDuck;
import strategy.model.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
