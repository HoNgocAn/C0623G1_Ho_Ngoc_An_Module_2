package ss7_AbstractClass_interface.Bai_tap.Bai1;

public class Shape implements Resizeable {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
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

    @Override
    public double getArea() {
        return 0;
    }

}