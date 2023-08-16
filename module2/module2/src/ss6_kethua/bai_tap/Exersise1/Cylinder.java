package ss6_kethua.bai_tap.Exersise1;

public class Cylinder extends Circle{
    private double heigth;

    public double getHeight(){
        return heigth;
    }
    public Cylinder(){

    }
    public Cylinder(double heigth){
        this.heigth = heigth;
    }

    public Cylinder(double heigth, double radius, String color){
        super (radius,color);
        this.heigth = heigth;
    }
    public double getVolume(){
        return getArea()*heigth;
    }
    public String toString(){
        return "A Cylinder with " + getHeight()  + ", which is a subclass of "
                + super.toString();
    }
}
