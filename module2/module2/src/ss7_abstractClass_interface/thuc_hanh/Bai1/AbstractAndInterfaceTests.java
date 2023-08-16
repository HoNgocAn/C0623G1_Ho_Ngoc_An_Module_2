package ss7_abstractClass_interface.thuc_hanh.Bai1;

import ss7_abstractClass_interface.thuc_hanh.Bai1.Animal.Animal;
import ss7_abstractClass_interface.thuc_hanh.Bai1.Animal.Chicken;
import ss7_abstractClass_interface.thuc_hanh.Bai1.Animal.Tiger;
import ss7_abstractClass_interface.thuc_hanh.Bai1.Edible.Edible;
import ss7_abstractClass_interface.thuc_hanh.Bai1.Fruit.Apple;
import ss7_abstractClass_interface.thuc_hanh.Bai1.Fruit.Fruit;
import ss7_abstractClass_interface.thuc_hanh.Bai1.Fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[]fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
     }
}
