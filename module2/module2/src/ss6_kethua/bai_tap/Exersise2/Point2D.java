package ss6_kethua.bai_tap.Exersise2;

public class Point2D {
    private float x;
    private float y;

    private float []arr = {2};

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return arr = new float[]{getX(), getY()};
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public String toString () {
            return "Point2D with x = " + getX() + " and y = " + getY();
    }
}

