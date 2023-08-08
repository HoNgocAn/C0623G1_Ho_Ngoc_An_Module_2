package ss4_Class_Object.Bai_tap;

public class Calculate3 {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setSpeed(fan1.FAST);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("red");
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println(fan2);

    }
}


