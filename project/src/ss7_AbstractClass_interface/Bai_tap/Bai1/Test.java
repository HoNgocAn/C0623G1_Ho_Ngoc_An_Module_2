package ss7_AbstractClass_interface.Bai_tap.Bai1;

import ss6_Kethua.Thuc_hanh.Square;

public class Test {
    public static void main(String[] args) {

        Circle circle2 = new Circle(10);

        System.out.println("Before");
        System.out.println(circle2.getArea());

        circle2.resize(Math.random() * 100);
        System.out.println("After");
        System.out.println(circle2.resize(Math.random() * 100) * circle2.getArea()/100 + circle2.getArea() );

        Rectangle rectangle2 = new Rectangle(10, 20);

        System.out.println("Before");
        System.out.println(rectangle2.getArea());

        rectangle2.resize(Math.random() * 100);
        System.out.println("After");
        System.out.println(rectangle2.resize(Math.random() * 100)* rectangle2.getArea()/100 + rectangle2.getArea());

    }
}

