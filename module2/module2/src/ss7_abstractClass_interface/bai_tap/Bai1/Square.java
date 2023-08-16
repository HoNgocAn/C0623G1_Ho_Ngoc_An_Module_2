package ss7_abstractClass_interface.bai_tap.Bai1;

import ss7_abstractClass_interface.bai_tap.Bai2.Shape;

public class Square extends Shape implements Resizeable{
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
        return "Square width=" + getWidth();
    }

    public double getPerimeter() {
        return 2 *getWidth();
    }

    @Override
    public String howToColor() {
        if(super.isFilled()) {
            getColor();
        }
        return "";
    }
    @Override
    public void resize(double percent) {
        setWidth(getWidth() + getWidth()*percent);
    }

    @Override
    public double getArea() {
        return getWidth() * getWidth();
    }
}

