package ss5_Accessmodifier_staticmethod_staticproperty.Bai_tap.Exersise1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "indigo", false);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        Circle circle1 = new Circle(10);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
    }
}
