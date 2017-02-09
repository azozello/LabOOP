package Seventh.animals;

import Seventh.interfaces.Runable;
import Seventh.interfaces.Swimable;
import Seventh.parent.Animal;

public class Penguin extends Animal implements Swimable, Runable {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void move() {
        run();
        swim();
    }

    @Override
    public void run() {
        System.out.println(this.getName()+" says: 'I can run'");
    }

    @Override
    public void swim() {
        System.out.println(this.getName()+" says: 'I can swim'");
    }
}
