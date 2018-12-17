package strategy.model;

import strategy.behavior.fly.FlyNoWay;
import strategy.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real model duck");
    }
}
