package ss7_AbstractClass_interface.Thuc_hanh.Bai1.Animal;

import ss7_AbstractClass_interface.Thuc_hanh.Bai1.Edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

