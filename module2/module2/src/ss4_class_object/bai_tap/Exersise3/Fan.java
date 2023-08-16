package ss4_class_object.bai_tap.Exersise3;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }
    public int getSpeed() {
        return speed;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String toString() {
        if (on) {
            return "fan is on: " + "color " + this.getColor() + " ,radius " + this.getRadius() + " ,speed " + this.getSpeed();
        } else {
            return "fan is of: " + "color " + this.getColor() + " ,radius " + this.getRadius();
        }

    }
    public Fan() {

    }

}
