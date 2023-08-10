package ss7_AbstractClass_interface.Bai_tap.Bai1;

import ss6_Kethua.Thuc_hanh.Square;

class ResizeableTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(20);

        System.out.println("Before");
        System.out.println(circle1);
        System.out.println(circle2);

        circle1.resize(Math.random() * 100);
        circle2.resize(Math.random() * 100);
        System.out.println("After");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println("");

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(20, 40);

        System.out.println("Before");
        System.out.println(rectangle1);
        System.out.println(rectangle2);

        rectangle1.resize(Math.random() * 100);
        rectangle2.resize(Math.random() * 100);
        System.out.println("After");
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println("");

        Square square1 = new Square();
        Square square2 = new Square(15);

        System.out.println("Before");
        System.out.println(square1);
        System.out.println(square2);

        square1.resize(Math.random() * 100);
        square2.resize(Math.random() * 100);
        System.out.println("After");
        System.out.println(square1);
        System.out.println(square2);
        System.out.println("");
    }
}