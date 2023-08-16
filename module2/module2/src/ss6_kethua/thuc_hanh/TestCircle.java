package ss6_Kethua.Thuc_hanh;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "dingo", false);
        System.out.println(circle);
    }
}
