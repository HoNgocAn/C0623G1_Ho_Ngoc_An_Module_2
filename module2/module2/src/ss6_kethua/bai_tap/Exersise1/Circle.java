package ss6_kethua.bai_tap.Exersise1;

public class Circle {
    private double radius ;
    private String color ;

    public Circle(){

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return  radius*radius*Math.PI;
    }
    public String toString(){
        return "A Circle with radius = " + getRadius() + " and color " +getColor();
    }
}
