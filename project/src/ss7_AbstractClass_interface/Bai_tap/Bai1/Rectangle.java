package ss7_AbstractClass_interface.Bai_tap.Bai1;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return height;
    }

    public void setLength(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * this.height;
    }

    public double getPerimeter() {
        return 2 * (width + this.height);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and height="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double resize() {
        return 0;
    }

    @Override
    public double resize(double percent) {
        System.out.println("resize= "+percent);
        return percent;
    }
}

