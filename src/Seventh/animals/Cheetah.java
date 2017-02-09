package Seventh.animals;

import Seventh.interfaces.Runable;
import Seventh.parent.Animal;

public class Cheetah extends Animal implements Runable {

    public Cheetah(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName()+" says: 'I can run'");
    }

    @Override
    public void move() {
        run();
    }
}
