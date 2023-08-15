package ss5_Accessmodifier_staticmethod_staticproperty.Bai_tap.Exersise1;

public class Circle {
    private double radius = 1.0;
    private String coler = "red";

    public Circle(double v, String indigo, boolean b){

    }
    public Circle(double r){
        r = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
}
