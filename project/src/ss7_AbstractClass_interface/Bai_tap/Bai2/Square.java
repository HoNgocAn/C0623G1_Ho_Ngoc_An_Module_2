package ss7_AbstractClass_interface.Bai_tap.Bai2;

public class Square extends Shape implements Colorable {
    private double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + getWidth() +
                '}';
    }

    public double getPerimeter() {
        return getWidth() * getWidth();
    }

    @Override
    public String howToColor() {
        if(super.isFilled()) {
            return getColor();
        }

        return "";
    }
}