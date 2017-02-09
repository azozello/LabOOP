package Seventh.animals;

import Seventh.interfaces.Runable;
import Seventh.interfaces.Swimable;
import Seventh.parent.Animal;

public class Seal extends Animal implements Swimable {
    public Seal(String name) {
        super(name);
    }

    @Override
    public void move() {
        swim();
    }

    @Override
    public void swim() {
        System.out.println(this.getName()+" says: 'I can swim'");
    }
}
