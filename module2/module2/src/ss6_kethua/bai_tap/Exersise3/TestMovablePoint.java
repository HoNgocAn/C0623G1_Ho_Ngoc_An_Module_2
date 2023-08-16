package ss6_kethua.bai_tap.Exersise3;

public class TestMovablePoint {
    public static void main(String[] args) {
        MoveablePoint movablePoint = new MoveablePoint();
        System.out.println(movablePoint);

        MoveablePoint moveablePoint1 = new MoveablePoint(3,4);
        System.out.println(moveablePoint1);

        MoveablePoint moveablePoint2 = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint2);
        System.out.println(moveablePoint2.move());


    }
}
