package strategy.model;

import strategy.behavior.fly.FlyNoWay;
import strategy.behavior.quack.Squeak;

public class RobberDuck extends Duck {

    public RobberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real robber duck");
    }
}
