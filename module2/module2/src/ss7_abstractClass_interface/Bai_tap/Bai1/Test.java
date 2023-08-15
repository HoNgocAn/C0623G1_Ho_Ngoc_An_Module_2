package ss7_AbstractClass_interface.Bai_tap.Bai1;

public class Test {

    public static void main(String[] args) {

        Circle circle2 = new Circle(10);
        circle2.resize(Math.random() * 100);

        Rectangle rectangle2 = new Rectangle(10, 20);
        rectangle2.resize(Math.random() * 100);

        Square square2 = new Square(15);
        square2.resize(Math.random()*100);
    }
}

